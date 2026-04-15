package com.boda.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDAOImpl implements ContactDAO {
    private Connection connection;

    public ContactDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();
        String query = "SELECT * FROM contacts";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                contacts.add(new Contact(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("birthday"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("phone"),
                        rs.getString("zip")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    @Override
    public Contact getContactById(int id) {
        String query = "SELECT * FROM contacts WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Contact(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("birthday"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("phone"),
                        rs.getString("zip")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addContact(Contact contact) {
        String query = "INSERT INTO contacts (name, birthday, email, address, city, phone, zip) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, contact.getName());
            stmt.setString(2, contact.getBirthday());
            stmt.setString(3, contact.getEmail());
            stmt.setString(4, contact.getAddress());
            stmt.setString(5, contact.getCity());
            stmt.setString(6, contact.getPhone());
            stmt.setString(7, contact.getZip());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateContact(Contact contact) {
        String query = "UPDATE contacts SET name = ?, birthday = ?, email = ?, address = ?, city = ?, phone = ?, zip = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, contact.getName());
            stmt.setString(2, contact.getBirthday());
            stmt.setString(3, contact.getEmail());
            stmt.setString(4, contact.getAddress());
            stmt.setString(5, contact.getCity());
            stmt.setString(6, contact.getPhone());
            stmt.setString(7, contact.getZip());
            stmt.setInt(8, contact.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteContact(int id) {
        String query = "DELETE FROM contacts WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

