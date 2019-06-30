package com.example.ServiceImpl;

import com.example.Service.ElectronicDeviceService;
import com.example.entity.Cabinet;
import com.example.entity.ElectronicDevice;
import com.example.repository.ElectronicDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ElectronecDeviceServicwImpl implements ElectronicDeviceService {
    @Autowired
    private ElectronicDeviceRepository electronicDeviceRepository;
    @Override
    public List<ElectronicDevice> getAllELD() {
        return electronicDeviceRepository.findAll();
    }

    @Override
    public void save(ElectronicDevice electronicDevice) {
electronicDeviceRepository.save(electronicDevice);
    }

    @Override
    public List<ElectronicDevice> getAllByCabinet(Long id) {
       return electronicDeviceRepository.getAllByIDCabinets(id);
    }

    @Override
    public List<ElectronicDevice> getAllByStorage(Long id) {
        return electronicDeviceRepository.getAllByIDStorage(id);
    }
}
