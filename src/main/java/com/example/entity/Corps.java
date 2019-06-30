package com.example.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "corps")
public class Corps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name = "street")
    private String street;
    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "corps")
    private List<Cabinet> cabinets = new ArrayList<>();

    @OneToMany(mappedBy = "corpsStorage")
    private List<Storage> storages = new ArrayList<>();



    public Corps(String street, String title) {
        this.street = street;
        this.title = title;
    }

    public Corps() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Cabinet> getCabinets() {
        return cabinets;
    }

    public void setCabinets(List<Cabinet> cabinets) {
        this.cabinets = cabinets;
    }


    public List<Storage> getStorages() {
        return storages;
    }

    public void setStorages(List<Storage> storages) {
        this.storages = storages;
    }
}
