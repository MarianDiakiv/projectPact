package com.example.Service;

import com.example.entity.Cabinet;

import java.util.List;

public interface CabinetService {
     List<Cabinet> getAllCabinets();
    void save(Cabinet cabinet);
    Cabinet getById(Long id);
    List<Cabinet> getAllCabinetsByCourps(Long id);
}
