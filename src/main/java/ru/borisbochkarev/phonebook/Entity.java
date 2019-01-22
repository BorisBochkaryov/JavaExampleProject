package ru.borisbochkarev.phonebook;

import java.math.BigInteger;

public class Entity extends User {

    private BigInteger authorizedCapital;

    public Entity(int id, String fio, BigInteger authorizedCapital) {
        super(id, fio);
        this.authorizedCapital = authorizedCapital;
    }

    public BigInteger getAuthorizedCapital() {
        return authorizedCapital;
    }

    public void setAuthorizedCapital(BigInteger authorizedCapital) {
        this.authorizedCapital = authorizedCapital;
    }
    
}
