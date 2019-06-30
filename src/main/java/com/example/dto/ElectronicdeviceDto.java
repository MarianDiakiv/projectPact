package com.example.dto;

import com.example.entity.Cabinet;
import com.example.entity.Storage;

import javax.persistence.*;

public class ElectronicdeviceDto {

    private  Long id;

    private String type;


    private String maker;

    private String model;

    private String description;
//    private Storage storageElectronic;
//
//    private Cabinet cabinetElectronic;
    private Long idStorage;
    private Long IdCabinet;

    public Long getIdStorage() {
        return idStorage;
    }

    public void setIdStorage(Long idStorage) {
        this.idStorage = idStorage;
    }

    public Long getIdCabinet() {
        return IdCabinet;
    }

    public void setIdCabinet(Long idCabinet) {
        IdCabinet = idCabinet;
    }



//    public Storage getStorageElectronic() {
//        return storageElectronic;
//    }
//
//    public void setStorageElectronic(Storage storageElectronic) {
//        this.storageElectronic = storageElectronic;
//    }
//
//
//
//    public Cabinet getCabinetElectronic() {
//        return cabinetElectronic;
//    }
//
//    public void setCabinetElectronic(Cabinet cabinetElectronic) {
//        this.cabinetElectronic = cabinetElectronic;
//    }
//
//    public Storage getStorageElectronic() {
//        return storageElectronic;
//    }
//
//    public void setStorageElectronic(Storage storageElectronic) {
//        this.storageElectronic = storageElectronic;
//    }
//


    public ElectronicdeviceDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
