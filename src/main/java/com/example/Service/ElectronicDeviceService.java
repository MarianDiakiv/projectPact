package com.example.Service;

import com.example.entity.Cabinet;
import com.example.entity.ElectronicDevice;

import java.util.List;

public interface ElectronicDeviceService {
    List<ElectronicDevice> getAllELD();
    void save(ElectronicDevice electronicDevice);
    List<ElectronicDevice> getAllByCabinet(Long id);
    List<ElectronicDevice> getAllByStorage(Long id);
}
