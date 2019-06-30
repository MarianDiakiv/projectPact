package com.example.ServiceImpl;

import com.example.Service.CorpsService;
import com.example.entity.Corps;
import com.example.repository.CorpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CorpsServiceImpl implements CorpsService {
    @Autowired
    private CorpsRepository corpsRepository;
    @Override
    public List<Corps> getAllCorps() {
        return corpsRepository.findAll();
    }

    @Override
    public void save(Corps corps) {
corpsRepository.save(corps);
    }

    @Override
    public Corps finById(Long id) {
        return corpsRepository.getOne(id);
    }
}
