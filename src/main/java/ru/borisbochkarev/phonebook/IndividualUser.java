package ru.borisbochkarev.phonebook;

public class IndividualUser extends User {

    private String homeAddress;

    public IndividualUser(){}

    public IndividualUser(Long id, String fio, String phone, String homeAddress) {
        super(id, fio, phone);
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

}
