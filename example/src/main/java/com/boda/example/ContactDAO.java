package com.boda.example;
import java.util.List;

public interface ContactDAO {
    List<Contact> getAllContacts();
    Contact getContactById(int id);
    void addContact(Contact contact);
    void updateContact(Contact contact);
    void deleteContact(int id);
}
