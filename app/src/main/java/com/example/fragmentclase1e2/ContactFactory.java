package com.example.fragmentclase1e2;

import java.util.ArrayList;
import java.util.List;

public class ContactFactory {
    private List<Contact> lstContact;

    public ContactFactory() {
        this.lstContact = new ArrayList<>();
        lstContact.add(new Contact(123456, "José", "Perez"));
        lstContact.add(new Contact(456789, "Jóse", "Lopez"));
        lstContact.add(new Contact(123789, "María", "Gonzales"));
        lstContact.add(new Contact(456123, "Amalia", "Gomez"));
        lstContact.add(new Contact(789123, "Analia", "Sanchez"));
    }

    public List<Contact> getListContact(){
        return lstContact;
    }
}
