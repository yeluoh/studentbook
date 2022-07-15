package com.wu.pojo;

public class Book {
    private int id;
    private String name;
    private int price;
    private int number;

    public Book() {
    }

    public Book(int id, String name, int price, int number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
