package com.example.Controller;

import com.example.Mapper.CabinetMapper;
import com.example.Mapper.OtherDeviceMapper;
import com.example.Mapper.StorageMapper;
import com.example.Service.*;
import com.example.dto.CabinetDto;
import com.example.dto.OtherDeviceDto;
import com.example.dto.StorageDto;
import com.example.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RestElDevController {

    @Autowired
    private ElectronicDeviceService electronicDeviceService;
    @Autowired
    private StorageService storageService;
    @Autowired
    private CabinetService cabinetService;
    @Autowired
    private CorpsService corpsService;
    @Autowired
    private OtherDeviceService otherDeviceService;
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    @ResponseBody
    public ElectronicDevice show(){
        Cabinet cabinet = new Cabinet();
        cabinet.setNumber(2);
        cabinet.setTitle("dsds");
        cabinet.setType("Ss");
        ElectronicDevice electronicDevice = new ElectronicDevice();
        electronicDevice.setId(2L);
        electronicDevice.setDescription("dsdss");
        electronicDevice.setMaker("dss");
        electronicDevice.setModel("Dde");
        electronicDevice.setType("Dsd");
        electronicDevice.setCabinetElectronic(cabinet);

        return electronicDevice;

    }

    @RequestMapping(value = "/showAll", method = RequestMethod.GET)
    @ResponseBody
    public List<ElectronicDevice> showAll(){


        return electronicDeviceService.getAllELD();

    }
    @RequestMapping(value = "/showAllStorage", method = RequestMethod.GET)
    @ResponseBody
    public List<StorageDto> showStorage(){
        List<StorageDto> storageDtos = new ArrayList<>();
        List<Storage> storages = storageService.getAll();
        StorageDto storageDto = new StorageDto();
        for (Storage s: storages) {
            System.out.println( s.getId()+ " " + s.getCorpsStorage().getId());

        }

        for (Storage s:storages ) {
            storageDto = StorageMapper.storageToRequest(s);
            storageDtos.add(storageDto);
        }

        for (StorageDto s: storageDtos) {
            System.out.println( s.getId()+ " " + s.getIdCourps());

        }

        return storageDtos;
    }


    @RequestMapping(value = "/saveStorage", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void saveStarageDtos(@RequestBody StorageDto dto){

        Storage storage = StorageMapper.requestToStorageSave(dto);

        storage.setCorpsStorage(corpsService.finById(dto.getIdCourps()));
        System.out.println(dto.getIdCourps() );
        storageService.save(storage);

    }

    @RequestMapping(value = "/saveStorage", method = RequestMethod.PUT,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void updateStarageDtos(@RequestBody StorageDto dto){

        Storage storage = StorageMapper.requestToStorageUpdate(dto);
        storage.setCorpsStorage(corpsService.finById(dto.getId()));
        storageService.save(storage);

    }

    @RequestMapping(value = "/showAllCabinets", method = RequestMethod.GET)
    @ResponseBody
    public List<CabinetDto> showCabinetDtos(){
    List<Cabinet> cabinets = cabinetService.getAllCabinets();
    List<CabinetDto> cabinetDtos = new ArrayList<>();
    CabinetDto dto = new CabinetDto();
    for (Cabinet c : cabinets){

        cabinetDtos.add(CabinetMapper.cabinetToRequest(c));
    }
    return cabinetDtos;
    }


    @RequestMapping(value = "/saveCabinets", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void saveCabinetDtos(@RequestBody CabinetDto dto){
        Cabinet cabinet = CabinetMapper.requestToCabinetsave(dto);
        Long id = dto.getIdCorps();
        Corps corps = corpsService.finById(id);
        cabinet.setCorps(corps);
        cabinetService.save(cabinet);

        System.out.println(cabinet.getId() + " " + id);


    }

    @RequestMapping(value = "/saveCabinets", method = RequestMethod.PUT,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void updateCabinetDtos(@RequestBody CabinetDto dto){
        Cabinet cabinet = CabinetMapper.requestToCabinetUpdate(dto);
        Corps corps= corpsService.finById(dto.getIdCorps());

        cabinet.setCorps(corps);
        System.out.println(cabinet.getId());
        cabinetService.save(cabinet);


    }

    @RequestMapping(value = "/selectAllCorpsByIdCabinets/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<CabinetDto> showCabinetDtosByCourpusId(@PathVariable(value = "id") Long id){
        List<Cabinet> cabinets = cabinetService.getAllCabinetsByCourps(id);
        List<CabinetDto> cabinetDtos = new ArrayList<>();
        CabinetDto dto = new CabinetDto();
        for (Cabinet c: cabinets) {
            dto = CabinetMapper.cabinetToRequest(c);
            cabinetDtos.add(dto);
        }
        return cabinetDtos;
    }


    @RequestMapping(value = "/selectAllDevByIdStorage/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<OtherDeviceDto> showOtherDevicesDtosByStarageId(@PathVariable(value = "id") Long id){
        List<OtherDevice> otherDevices = otherDeviceService.getAllByIdStorage(id);
        List<OtherDeviceDto> dtos = new ArrayList<>();
        OtherDeviceDto dto = new OtherDeviceDto();
        for (OtherDevice o: otherDevices) {
            dto = OtherDeviceMapper.deviceToRequest(o);
            dtos.add(dto);
        }
        return dtos;
    }



}
