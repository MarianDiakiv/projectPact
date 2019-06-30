package com.example.Mapper;

import com.example.dto.OtherDeviceDto;
import com.example.entity.OtherDevice;

public class OtherDeviceMapper {

    public static OtherDeviceDto deviceToRequest(OtherDevice otherDevice){
        OtherDeviceDto dto = new OtherDeviceDto();
        dto.setId(otherDevice.getId());
        dto.setCount(otherDevice.getCount());
        dto.setDescription(otherDevice.getDescription());
        dto.setType(otherDevice.getType());
        dto.setName(otherDevice.getName());
        dto.setIdStorage(otherDevice.getStorageOther().getId());
        return dto;
    }
    public static OtherDevice requestToOtherDeviceSave(OtherDeviceDto dto){
        OtherDevice otherDevice = new OtherDevice();
        otherDevice.setName(dto.getName());
        otherDevice.setCount(dto.getCount());
        otherDevice.setDescription(dto.getDescription());
        otherDevice.setType(dto.getType());
        return otherDevice;
    }
    public static OtherDevice requestToOtherDeviceUpdate(OtherDeviceDto dto){
        OtherDevice otherDevice = new OtherDevice();
        otherDevice.setId(dto.getId());
        otherDevice.setName(dto.getName());
        otherDevice.setCount(dto.getCount());
        otherDevice.setDescription(dto.getDescription());
        otherDevice.setType(dto.getType());
        return otherDevice;
    }
}
