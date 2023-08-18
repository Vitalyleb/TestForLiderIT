package com.example.rest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String productname;
    @Column
    private char address;
    @Column
    private Double price;
    @Column
    private String type;
    @Column
    private String dateofcreate;
    @Column
    private String dateofchanging;
    @Column
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
