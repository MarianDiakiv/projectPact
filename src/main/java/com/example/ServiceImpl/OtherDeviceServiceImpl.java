package com.example.ServiceImpl;

import com.example.Service.OtherDeviceService;
import com.example.entity.OtherDevice;
import com.example.repository.OtherDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherDeviceServiceImpl implements OtherDeviceService {
    @Autowired
    private OtherDeviceRepository otherDeviceRepository;
    @Override
    public List<OtherDevice> getAll() {
        return otherDeviceRepository.findAll();
    }

    @Override
    public void save(OtherDevice otherDevice) {
 otherDeviceRepository.save(otherDevice);
    }

    @Override
    public List<OtherDevice> getAllByIdStorage(Long id) {
        return otherDeviceRepository.findAllByStorageID(id);
    }
}
