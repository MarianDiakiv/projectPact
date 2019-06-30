package com.example.dto;

import com.example.entity.Corps;
import com.example.entity.ElectronicDevice;
import com.example.entity.Furniture;

import java.util.ArrayList;
import java.util.List;

public class CabinetDto {
    private   Long id;

    private int number;

    private String title;

    private String type;
    private Long idCorps;



    public Long getIdCorps() {
        return idCorps;
    }

    public void setIdCorps(Long idCorps) {
        this.idCorps = idCorps;
    }
//    private Corps corps;


//    private List<ElectronicDevice> electronicDevices = new ArrayList<>();
//
//
//    private List<Furniture> furnitures = new ArrayList<>();

    public CabinetDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public Corps getCorps() {
//        return corps;
//    }

//    public void setCorps(Corps corps) {
//        this.corps = corps;
//    }
//
//    public List<ElectronicDevice> getElectronicDevices() {
//        return electronicDevices;
//    }
//
//    public void setElectronicDevices(List<ElectronicDevice> electronicDevices) {
//        this.electronicDevices = electronicDevices;
//    }
//
//    public List<Furniture> getFurnitures() {
//        return furnitures;
//    }
//
//    public void setFurnitures(List<Furniture> furnitures) {
//        this.furnitures = furnitures;
//    }
}
