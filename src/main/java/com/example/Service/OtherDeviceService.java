package com.example.Service;

import com.example.entity.OtherDevice;

import java.util.List;

public interface OtherDeviceService {
    List<OtherDevice> getAll();
    void save(OtherDevice otherDevice);
    List<OtherDevice> getAllByIdStorage(Long id);
 }
