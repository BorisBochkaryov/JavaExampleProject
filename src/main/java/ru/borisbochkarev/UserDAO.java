package ru.borisbochkarev;

import org.springframework.stereotype.Repository;
import ru.borisbochkarev.phonebook.EntityUser;
import ru.borisbochkarev.phonebook.IndividualUser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {

    private final String url="jdbc:mysql://localhost:3306/phonebook";
    private final String username="root";
    private final String password="18091995";

    private Statement statement = null;

    public UserDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            this.statement = connection.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateStatement() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            this.statement = connection.createStatement();
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveEntityUser(EntityUser user) {
        if (this.statement == null)
            this.updateStatement();
        try {
            this.statement.executeUpdate(
                    String.format("INSERT INTO entity(fio, phone, authorizedcapital) VALUES ('%s', '%s', '%s')",
                            user.getFio(), user.getPhone(), user.getAuthorizedCapital())
            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveIndividualUser(IndividualUser user) {
        if (this.statement == null)
            this.updateStatement();
        try {
            this.statement.executeUpdate(
                    String.format("INSERT INTO individual(fio, phone, homeaddress) VALUES ('%s', '%s', '%s')",
                            user.getFio(), user.getPhone(), user.getHomeAddress())
            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public synchronized List<EntityUser> getAllEntityUsers() {
        if (this.statement == null)
            this.updateStatement();
        try {
            ResultSet rs = this.statement.executeQuery("SELECT * FROM entity");
            List<EntityUser> users = new ArrayList<>();
            while (rs.next()) {
                users.add(new EntityUser(rs.getLong("id"), rs.getString("fio"),
                                         rs.getString("phone"), rs.getString("authorizedcapital")));
            }
            rs.close();
            return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public synchronized List<IndividualUser> getAllIndividualUsers() {
        if (this.statement == null)
            this.updateStatement();
        try {
            ResultSet rs = this.statement.executeQuery("SELECT * FROM individual");
            List<IndividualUser> users = new ArrayList<>();
            while (rs.next()) {
                users.add(new IndividualUser(rs.getLong("id"), rs.getString("fio"),
                        rs.getString("phone"), rs.getString("homeaddress")));
            }
            rs.close();
            return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Integer getCountIndividualUser() {
        return this.getAllIndividualUsers().size();
    }

    public Integer getCountEntityUser() {
        return this.getAllEntityUsers().size();
    }

}
