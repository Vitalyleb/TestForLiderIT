package com.example.rest.model;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;
@Entity
@Table(name = "showcase")
public class Showcase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String name;
    @Column
    private char address;
    @Column
    private String type;
    @Column
    private String dt;
    @Column
    private String updating;

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

    public char getAddress() {
        return address;
    }

    public void setAddress(char address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getUpdating() {
        return updating;
    }

    public void setUpdating(String updating) {
        this.updating = updating;
    }
}
