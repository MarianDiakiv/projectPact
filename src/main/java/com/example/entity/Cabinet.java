package com.example.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cabinet")
public class Cabinet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private   Long id;
    @Column(name = "number")
    private int number;
    @Column(name = "title")
    private String title;
    @Column(name = "type")
    private String type;


    @ManyToOne
    @JoinColumn(name = "corps_id")
    private Corps corps;

    @OneToMany(mappedBy = "cabinetElectronic")
    private List<ElectronicDevice> electronicDevices = new ArrayList<>();

    @OneToMany(mappedBy = "cabinetFurniture")
    private List<Furniture> furnitures = new ArrayList<>();

    public Cabinet(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public Cabinet() {
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

    public Corps getCorps() {
        return corps;
    }

    public void setCorps(Corps corps) {
        this.corps = corps;
    }


    public List<ElectronicDevice> getElectronicDevices() {
        return electronicDevices;
    }

    public void setElectronicDevices(List<ElectronicDevice> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    public List<Furniture> getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(List<Furniture> furnitures) {
        this.furnitures = furnitures;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
