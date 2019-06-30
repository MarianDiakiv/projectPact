package com.example.ServiceImpl;

import com.example.Service.StorageService;
import com.example.entity.Storage;
import com.example.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageRepository storageRepository;
    @Override
    public List<Storage> getAll() {
        return storageRepository.findAll();
    }

    @Override
    public void save(Storage storage) {
    storageRepository.save(storage);
    }

    @Override
    public Storage getById(Long id) {
        return storageRepository.getOne(id);
    }
}
