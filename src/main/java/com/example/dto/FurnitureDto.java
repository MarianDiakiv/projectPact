package com.example.dto;

import com.example.entity.Cabinet;
import com.example.entity.Storage;

import javax.persistence.*;

public class FurnitureDto {

    private  Long id;

    private String type;

    private String size;

    private String description;
    private Long idCabinet;
    private Long idStorage;




//    private Cabinet cabinetFurniture;
//
//
//    private Storage storageFurniture;

    public FurnitureDto() {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getIdCabinet() {
        return idCabinet;
    }

    public void setIdCabinet(Long idCabinet) {
        this.idCabinet = idCabinet;
    }

    public Long getIdStorage() {
        return idStorage;
    }

    public void setIdStorage(Long idStorage) {
        this.idStorage = idStorage;
    }

//    public Cabinet getCabinetFurniture() {
//        return cabinetFurniture;
//    }
//
//    public void setCabinetFurniture(Cabinet cabinetFurniture) {
//        this.cabinetFurniture = cabinetFurniture;
//    }
//
//    public Storage getStorageFurniture() {
//        return storageFurniture;
//    }
//
//    public void setStorageFurniture(Storage storageFurniture) {
//        this.storageFurniture = storageFurniture;
//    }
}
