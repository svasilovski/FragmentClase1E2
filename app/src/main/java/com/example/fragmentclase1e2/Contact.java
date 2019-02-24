package com.example.fragmentclase1e2;

public class Contact {
    private int phone;
    private String name;
    private String lastName;

    public Contact(int phone, String name, String lastName) {
        this.phone = phone;
        this.name = name;
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
