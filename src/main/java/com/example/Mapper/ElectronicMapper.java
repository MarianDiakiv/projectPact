package com.example.Mapper;

import com.example.dto.ElectronicdeviceDto;
import com.example.entity.ElectronicDevice;

public class ElectronicMapper {
    public static ElectronicDevice requestToElDeviceUpdate(ElectronicdeviceDto dto){
        ElectronicDevice electronicDevice= new ElectronicDevice();
        electronicDevice.setId(dto.getId());
        electronicDevice.setMaker(dto.getMaker());
        electronicDevice.setModel(dto.getModel());
        electronicDevice.setType(dto.getType());
        electronicDevice.setDescription(dto.getDescription());
        return electronicDevice;
    }
    public static ElectronicDevice requestToElDeviceSave(ElectronicdeviceDto dto){
        ElectronicDevice electronicDevice= new ElectronicDevice();
        //electronicDevice.setId(dto.getId());
        electronicDevice.setMaker(dto.getMaker());
        electronicDevice.setModel(dto.getModel());
        electronicDevice.setType(dto.getType());
        electronicDevice.setDescription(dto.getDescription());
        return electronicDevice;
    }
    public static ElectronicdeviceDto electronicToRequest(ElectronicDevice electronicDevice ){
        ElectronicdeviceDto dto = new ElectronicdeviceDto();
        dto.setId(electronicDevice.getId());
        dto.setType(electronicDevice.getType());
        dto.setMaker(electronicDevice.getMaker());
        dto.setModel(electronicDevice.getModel());
        dto.setDescription(electronicDevice.getDescription());
        dto.setIdCabinet(electronicDevice.getCabinetElectronic().getId());
        dto.setIdStorage(electronicDevice.getStorageElectronic().getId());

        return  dto;
    }
}
