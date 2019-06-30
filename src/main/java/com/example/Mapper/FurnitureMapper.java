package com.example.Mapper;

import com.example.dto.FurnitureDto;
import com.example.entity.Furniture;

public class FurnitureMapper {

    public static FurnitureDto furnitureToRequest(Furniture furniture){
        FurnitureDto dto = new FurnitureDto();
        dto.setId(furniture.getId());
        dto.setSize(furniture.getSize());
        dto.setType(furniture.getType());
        dto.setDescription(furniture.getDescription());
        return dto;
    }
    public static Furniture requestToFurnitureSave(FurnitureDto dto){
        Furniture furniture = new Furniture();
        furniture.setSize(dto.getSize());
        furniture.setType(dto.getType());
        furniture.setDescription(dto.getDescription());
        return furniture;

    }

    public static Furniture requestToFurnitureUpdate(FurnitureDto dto){
        Furniture furniture = new Furniture();
        furniture.setId(dto.getId());
        furniture.setSize(dto.getSize());
        furniture.setType(dto.getType());
        furniture.setDescription(dto.getDescription());
        return furniture;

    }


}
