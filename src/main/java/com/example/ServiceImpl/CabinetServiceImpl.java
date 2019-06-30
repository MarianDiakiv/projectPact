package com.example.ServiceImpl;

import com.example.Service.CabinetService;
import com.example.entity.Cabinet;
import com.example.repository.CabinetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CabinetServiceImpl implements CabinetService {
    @Autowired
    private CabinetRepository cabinetRepository;
    @Override
    public List<Cabinet> getAllCabinets() {
        return cabinetRepository.findAll();
    }

    @Override
    public Cabinet getById(Long id) {
        return cabinetRepository.getOne(id);
    }

    @Override
    public List<Cabinet> getAllCabinetsByCourps(Long id) {
        return cabinetRepository.getAllCabinetByCourps(id);
    }

    @Override
    public void save(Cabinet cabinet) {
cabinetRepository.save(cabinet);
    }
}
