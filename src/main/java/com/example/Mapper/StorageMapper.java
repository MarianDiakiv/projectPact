package com.example.Mapper;

import com.example.dto.StorageDto;
import com.example.entity.Storage;

public class StorageMapper {
    public static StorageDto storageToRequest(Storage storage){
        StorageDto  dto = new StorageDto();
        dto.setId(storage.getId());
        dto.setIdCourps(storage.getCorpsStorage().getId());
        return dto;
    }
    public  static Storage requestToStorageSave(StorageDto dto){
        Storage storage = new Storage();
        return storage;
    }
    public  static Storage requestToStorageUpdate(StorageDto dto){
        Storage storage = new Storage();
        storage.setId(dto.getId());
        return storage;
    }
}
