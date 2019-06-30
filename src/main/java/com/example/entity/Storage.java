package com.example.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "storage")
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private   Long id;

    @ManyToOne
    @JoinColumn(name = "corps_id")
    private Corps corpsStorage;


    @OneToMany(mappedBy = "storageFurniture")
    private List<Furniture> furnitures= new ArrayList<>();

    @OneToMany(mappedBy = "storageElectronic")
    private List<ElectronicDevice> electronicDevices = new ArrayList<>();

    @OneToMany(mappedBy = "storageOther")
    private List<OtherDevice> otherDevices = new ArrayList<>();

    public Storage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Furniture> getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(List<Furniture> furnitures) {
        this.furnitures = furnitures;
    }

    public List<ElectronicDevice> getElectronicDevices() {
        return electronicDevices;
    }

    public void setElectronicDevices(List<ElectronicDevice> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    public List<OtherDevice> getOtherDevices() {
        return otherDevices;
    }

    public void setOtherDevices(List<OtherDevice> otherDevices) {
        this.otherDevices = otherDevices;
    }

    public Corps getCorpsStorage() {
        return corpsStorage;
    }

    public void setCorpsStorage(Corps corpsStorage) {
        this.corpsStorage = corpsStorage;
    }
}
