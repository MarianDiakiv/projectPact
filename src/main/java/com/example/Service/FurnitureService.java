package com.example.Service;

import com.example.entity.Furniture;

import java.util.List;

public interface FurnitureService {
    List<Furniture> getAll();
    void save(Furniture furniture);
    List<Furniture> getAllFurnitureByCabinetsID(Long id);
    List<Furniture> getAllFurnitureByStorage(Long id);
}
