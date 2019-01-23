package ru.borisbochkarev.phonebook;

public class EntityUser extends User {

    private String authorizedCapital;

    public EntityUser() {}

    public EntityUser(Long id, String fio, String phone, String authorizedCapital) {
        super(id, fio, phone);
        this.authorizedCapital = authorizedCapital;
    }

    public String getAuthorizedCapital() {
        return authorizedCapital;
    }

    public void setAuthorizedCapital(String authorizedCapital) {
        this.authorizedCapital = authorizedCapital;
    }

}
