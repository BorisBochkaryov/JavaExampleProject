package ru.borisbochkarev.phonebook;

public abstract class User {

    private Long id;
    private String fio;
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public User() {}

    public User(Long id, String fio, String phone) {
        this.id = id;
        this.fio = fio;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
