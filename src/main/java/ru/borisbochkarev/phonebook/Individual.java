package ru.borisbochkarev.phonebook;

public class Individual extends User {

    private String homeAddress;

    public Individual(int id, String fio, String homeAddress) {
        super(id, fio);
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

}
