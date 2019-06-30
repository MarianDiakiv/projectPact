package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "electronic_device")
public class ElectronicDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "maker")
    private String maker;
    @Column(name = "model")
    private String model;
    @Column(name = "description")
    private String description;


    @ManyToOne
    @JoinColumn(name = "cabinet_id")
    private Cabinet cabinetElectronic;

    @ManyToOne
    @JoinColumn(name = "storage_id")
    private Storage storageElectronic;



    public ElectronicDevice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Storage getStorageElectronic() {
        return storageElectronic;
    }

    public void setStorageElectronic(Storage storageElectronic) {
        this.storageElectronic = storageElectronic;
    }

    public Cabinet getCabinetElectronic() {
        return cabinetElectronic;
    }

    public void setCabinetElectronic(Cabinet cabinetElectronic) {
        this.cabinetElectronic = cabinetElectronic;
    }
}
