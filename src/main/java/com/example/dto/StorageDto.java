package com.example.dto;

import com.example.entity.Corps;
import com.example.entity.ElectronicDevice;
import com.example.entity.Furniture;
import com.example.entity.OtherDevice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class StorageDto {

    private   Long id;
    private Long idCourps;

    public Long getIdCourps() {
        return idCourps;
    }

    public void setIdCourps(Long idCourps) {
        this.idCourps = idCourps;
    }
//    private Corps corpsStorage;
//
//
//
//    private List<Furniture> furnitures= new ArrayList<>();
//
//
//    private List<ElectronicDevice> electronicDevices = new ArrayList<>();
//
//
//    private List<OtherDevice> otherDevices = new ArrayList<>();

    public StorageDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Corps getCorpsStorage() {
//        return corpsStorage;
//    }
//
//    public void setCorpsStorage(Corps corpsStorage) {
//        this.corpsStorage = corpsStorage;
//    }
//
//    public List<Furniture> getFurnitures() {
//        return furnitures;
//    }
//
//    public void setFurnitures(List<Furniture> furnitures) {
//        this.furnitures = furnitures;
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
//    public List<OtherDevice> getOtherDevices() {
//        return otherDevices;
//    }
//
//    public void setOtherDevices(List<OtherDevice> otherDevices) {
//        this.otherDevices = otherDevices;
//    }
}
