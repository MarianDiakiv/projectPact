package com.example.Service;

import com.example.entity.Storage;

import java.util.List;

public interface StorageService {
    List<Storage> getAll();
    void save(Storage storage);
    Storage getById(Long id);


}
