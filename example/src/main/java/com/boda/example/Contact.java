package com.boda.example;

public class Contact {
    private int id;
    private String name;
    private String birthday;
    private String email;
    private String address;
    private String city;
    private String phone;
    private String zip;

    public Contact(int id, String name, String birthday, String email, String address, String city, String phone, String zip) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.zip = zip;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }
}
