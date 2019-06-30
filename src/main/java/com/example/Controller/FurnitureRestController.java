package com.example.Controller;

import com.example.Mapper.FurnitureMapper;
import com.example.Service.CabinetService;
import com.example.Service.FurnitureService;
import com.example.Service.StorageService;
import com.example.dto.FurnitureDto;
import com.example.entity.Furniture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FurnitureRestController {

    @Autowired
    private FurnitureService furnitureService;
    @Autowired
    private CabinetService cabinetService;
    @Autowired
    private StorageService storageService;

    @RequestMapping(value = "/showAllFurniture", method = RequestMethod.GET)
    @ResponseBody
    public List<FurnitureDto> showAllFurniture(){
        List<Furniture> furnitures = furnitureService.getAll();
        FurnitureDto dto = new FurnitureDto();
        List<FurnitureDto> list = new ArrayList<>();
        for (Furniture f: furnitures) {
            dto = FurnitureMapper.furnitureToRequest(f);
            dto.setIdCabinet(f.getCabinetFurniture().getId());
            dto.setIdStorage(f.getStorageFurniture().getId());
            list.add(dto);
        }
        return list;
    }

    @RequestMapping(value = "/saveFurniture", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void saveCabinetDtos(@RequestBody FurnitureDto dto ){
    Furniture furniture = FurnitureMapper.requestToFurnitureSave(dto);
    furniture.setCabinetFurniture(cabinetService.getById(dto.getIdCabinet()));
    furniture.setStorageFurniture(storageService.getById(dto.getIdStorage()));
furnitureService.save(furniture);
    }

    @RequestMapping(value = "/updateFurniture", method = RequestMethod.PUT,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void updateElectronicDtos(@RequestBody FurnitureDto dto ){
        Furniture  furniture = new Furniture();
        furniture = FurnitureMapper.requestToFurnitureUpdate(dto);
        furniture.setStorageFurniture(storageService.getById(dto.getIdStorage()));
        furniture.setCabinetFurniture(cabinetService.getById(dto.getIdCabinet()));
        furnitureService.save(furniture);

    }

    @RequestMapping(value = "/showElementsByIDCabinetsFurniture/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<FurnitureDto> showAllFurnitureByCabinetsId(@PathVariable(value = "id") Long id){
        List<Furniture> furnitures = furnitureService.getAllFurnitureByCabinetsID(id);
        FurnitureDto dto = new FurnitureDto();
        List<FurnitureDto> list = new ArrayList<>();
        for (Furniture f: furnitures) {
            dto = FurnitureMapper.furnitureToRequest(f);
            dto.setIdCabinet(f.getCabinetFurniture().getId());
            dto.setIdStorage(f.getStorageFurniture().getId());
            list.add(dto);
        }
        return list;
    }

    @RequestMapping(value = "/showAllFurnitureInStorage/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<FurnitureDto> showAllFurnitureByStarageId(@PathVariable(value = "id") Long id){
        List<Furniture> furnitures = furnitureService.getAllFurnitureByCabinetsID(id);
        FurnitureDto dto = new FurnitureDto();
        List<FurnitureDto> list = new ArrayList<>();
        for (Furniture f: furnitures) {
            dto = FurnitureMapper.furnitureToRequest(f);
            dto.setIdCabinet(f.getCabinetFurniture().getId());
            dto.setIdStorage(f.getStorageFurniture().getId());
            list.add(dto);
        }
        return list;
    }

}

