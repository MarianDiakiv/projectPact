package com.example.dto;

import com.example.entity.Cabinet;
import com.example.entity.Storage;

import java.util.ArrayList;
import java.util.List;

public class CorpsDto {
    private  Long id;

    private String street;

    private String title;

//    private List<Cabinet> cabinets = new ArrayList<>();
//
//
//    private List<Storage> storages = new ArrayList<>();

    public CorpsDto() {
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

//    public List<Cabinet> getCabinets() {
//        return cabinets;
//    }

//    public void setCabinets(List<Cabinet> cabinets) {
//        this.cabinets = cabinets;
//    }
//
//    public List<Storage> getStorages() {
//        return storages;
//    }
//
//    public void setStorages(List<Storage> storages) {
//        this.storages = storages;
//    }
}
