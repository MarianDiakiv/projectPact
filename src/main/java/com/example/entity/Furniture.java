package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "furniture")
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "size")
    private String size;
    @Column(name = "description")
    private String description;



    @ManyToOne
    @JoinColumn(name = "cabinet_id")
    private Cabinet cabinetFurniture;

    @ManyToOne
    @JoinColumn(name = "strorage_id" )
    private Storage storageFurniture;



    public Furniture() {
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


    public Cabinet getCabinetFurniture() {
        return cabinetFurniture;
    }

    public void setCabinetFurniture(Cabinet cabinetFurniture) {
        this.cabinetFurniture = cabinetFurniture;
    }

    public Storage getStorageFurniture() {
        return storageFurniture;
    }

    public void setStorageFurniture(Storage storageFurniture) {
        this.storageFurniture = storageFurniture;
    }
}
