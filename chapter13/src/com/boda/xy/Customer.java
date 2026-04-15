package com.boda.xy;

import java.io.Serializable;

public class Customer implements Serializable {
    public int id;
    public String name;
    public String address;

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
