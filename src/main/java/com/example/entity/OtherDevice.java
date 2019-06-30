package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "other_devace")
public class OtherDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private   Long id;

    private String type;
    private String name;
    private String Description;
    private int count;

    @ManyToOne
    @JoinColumn(name = "storage_id")
    private Storage storageOther;

    public OtherDevice() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public Storage getStorageOther() {
        return storageOther;
    }

    public void setStorageOther(Storage storageOther) {
        this.storageOther = storageOther;
    }
}
