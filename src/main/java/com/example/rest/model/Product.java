package com.example.rest.model;

public class Product {

    private Integer id;
    private String productname;
    private char address;
    private Double price;
    private String type;
    private String dateofcreate;
    private String dateofchanging;
    private String position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public char getAddress() {
        return address;
    }

    public void setAddress(char address) {
        this.address = address;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateofcreate() {
        return dateofcreate;
    }

    public void setDateofcreate(String dateofcreate) {
        this.dateofcreate = dateofcreate;
    }

    public String getDateofchanging() {
        return dateofchanging;
    }

    public void setDateofchanging(String dateofchanging) {
        this.dateofchanging = dateofchanging;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
