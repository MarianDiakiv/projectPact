package com.example.Mapper;

import com.example.dto.CorpsDto;
import com.example.entity.Corps;

public class CorpsMapper {
    public static Corps requestToCorpsSave(CorpsDto request){
        Corps corps = new Corps();
        corps.setStreet(request.getStreet());
        corps.setTitle(request.getTitle());
    return corps;
    }
    public static CorpsDto corpsToDto(Corps corps){
        CorpsDto corpsDto = new CorpsDto();
        corpsDto.setId(corps.getId());
        corpsDto.setStreet(corps.getStreet());
        corpsDto.setTitle(corps.getTitle());
        return corpsDto;
    }
}
