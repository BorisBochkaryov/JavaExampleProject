package ru.borisbochkarev.phonebook;

public class User {

    private int id;
    private String fio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public User(int id, String fio) {
        this.id = id;
        this.fio = fio;
    }

}
