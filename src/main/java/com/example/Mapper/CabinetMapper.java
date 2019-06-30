package com.example.Mapper;

import com.example.dto.CabinetDto;
import com.example.entity.Cabinet;

public class CabinetMapper {
    public  static Cabinet requestToCabinetUpdate(CabinetDto request){
        Cabinet cabinet = new Cabinet();
        cabinet.setId(request.getId());
    cabinet.setType(request.getType());
    cabinet.setNumber(request.getNumber());
    cabinet.setTitle(request.getTitle());


//    cabinet.setCorps(request.getCorps());
//    cabinet.setElectronicDevices(request.getElectronicDevices());
//    cabinet.setFurnitures(request.getFurnitures());



        return cabinet;
    }
    public  static  CabinetDto cabinetToRequest(Cabinet c){
        CabinetDto dto = new CabinetDto();
        dto.setId(c.getId());
        dto.setNumber(c.getNumber());
        dto.setTitle(c.getTitle());
        dto.setType(c.getType());

        dto.setIdCorps(c.getCorps().getId());
        return dto;
    }
    public  static Cabinet requestToCabinetsave(CabinetDto request){
        Cabinet cabinet = new Cabinet();

        cabinet.setType(request.getType());
        cabinet.setNumber(request.getNumber());
        cabinet.setTitle(request.getTitle());



        return cabinet;
    }
}
