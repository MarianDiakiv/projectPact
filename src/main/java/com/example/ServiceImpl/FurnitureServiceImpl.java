package com.example.ServiceImpl;

import com.example.Service.FurnitureService;
import com.example.entity.Furniture;
import com.example.repository.FurnityreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureServiceImpl implements FurnitureService {
    @Autowired
    private FurnityreRepository furnityreRepository;
    @Override
    public List<Furniture> getAll() {
        return furnityreRepository.findAll();
    }

    @Override
    public List<Furniture> getAllFurnitureByCabinetsID(Long id) {
       return furnityreRepository.findAllByCabinetID(id);
    }

    @Override
    public List<Furniture> getAllFurnitureByStorage(Long id) {
        return furnityreRepository.findAllByCabinetID(id);
    }

    @Override
    public void save(Furniture furniture) {
furnityreRepository.save(furniture);
    }
}
