package com.boda.xy;

import java.util.Objects;

public class Product implements Cloneable {
    Integer id;
    String name;
    String brand;
    double price;

    public Product(Integer id, String name, String brand, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Product))
            return false;

        Product p = (Product) obj;
        return getId() == p.getId() && Objects.equals(getName(), p.getName())
                && Objects.equals(getBrand(), p.getBrand()) && getPrice() == p.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, brand, price);
    }

    @Override
    public String toString() {
        return "商品信息:" + id + "  " + name + "  " + brand + "  " + price;
    }

    public static void main(String[] args)
            throws CloneNotSupportedException {
        Product p = new Product(108, "笔记本电脑", "Lenovo", 4500);
        Product p2 = new Product(108, "笔记本电脑", "Lenovo", 4500);
        IO.println(p);
        IO.println(p.equals(p2));
        IO.println(p.hashCode());
        p2 = (Product) p.clone();
        IO.println(p2);
        IO.println(p2.hashCode());
        IO.println(p == p2);
    }
}
