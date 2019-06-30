package com.example.Controller;

import com.example.Mapper.ElectronicMapper;
import com.example.Service.CabinetService;
import com.example.Service.ElectronicDeviceService;
import com.example.Service.StorageService;
import com.example.dto.ElectronicdeviceDto;
import com.example.entity.Cabinet;
import com.example.entity.ElectronicDevice;
import com.example.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ElectronicDeviceController {

    @Autowired
    private ElectronicDeviceService electronicDeviceService;
    @Autowired
    private StorageService storageService;
    @Autowired
    private CabinetService cabinetService;

    @RequestMapping(value = "/showAllElectronic", method = RequestMethod.GET)
    @ResponseBody
public List<ElectronicdeviceDto> showAllElDevoice(){

List<ElectronicDevice> deviceList = electronicDeviceService.getAllELD();
List<ElectronicdeviceDto> devices = new ArrayList<>();
 ElectronicdeviceDto dto = new ElectronicdeviceDto();
        for (ElectronicDevice e: deviceList
             ) {
            dto = ElectronicMapper.electronicToRequest(e);
            devices.add(dto);

        }
        return devices;

}

    @RequestMapping(value = "/updateElectronic", method = RequestMethod.PUT,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void updateElectronicDtos(@RequestBody ElectronicdeviceDto dto ){
ElectronicDevice electronicDevice = ElectronicMapper.requestToElDeviceUpdate(dto);
        Cabinet cabinet = cabinetService.getById(dto.getIdCabinet());

        Storage storage = storageService. getById(dto.getIdStorage());

        electronicDevice.setCabinetElectronic(cabinet);

        electronicDevice.setStorageElectronic(storage);

        electronicDeviceService.save(electronicDevice);

    }
    @RequestMapping(value = "/saveElectronic", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void saveCabinetDtos(@RequestBody ElectronicdeviceDto dto ){
        ElectronicDevice electronicDevice = ElectronicMapper.requestToElDeviceSave(dto);
        Cabinet cabinet = cabinetService.getById(dto.getIdCabinet());
        Storage storage = storageService. getById(dto.getIdStorage());
        electronicDevice.setCabinetElectronic(cabinet);
        electronicDevice.setStorageElectronic(storage);
        electronicDeviceService.save(electronicDevice);

    }
    @RequestMapping(value = "/showElementsByIDCabinets/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<ElectronicdeviceDto> showAllElSelect(@PathVariable(value = "id") Long id ){
List<ElectronicDevice> electronicDevices = electronicDeviceService.getAllByCabinet(id);
List<ElectronicdeviceDto> devices = new ArrayList<>();
ElectronicdeviceDto electronicdeviceDto = new ElectronicdeviceDto();
for (ElectronicDevice e:electronicDevices ) {
            electronicdeviceDto = ElectronicMapper.electronicToRequest(e);
    System.out.println(electronicdeviceDto.getDescription()+ electronicdeviceDto.getId());
//            electronicdeviceDto.setIdCabinet(e.getCabinetElectronic().getId());
//            electronicdeviceDto.setIdStorage(e.getStorageElectronic().getId());
            devices.add(electronicdeviceDto);
        }


        return devices;

    }

    @RequestMapping(value = "/showAllElectronicInStorage/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<ElectronicdeviceDto> showAllElInStorageSelect(@PathVariable(value = "id") Long id ){
        List<ElectronicDevice> electronicDevices = electronicDeviceService.getAllByStorage(id);
       List<ElectronicdeviceDto> devices = new ArrayList<>();
       ElectronicdeviceDto dto = new ElectronicdeviceDto();

        for (ElectronicDevice e:electronicDevices             ) {
            dto = ElectronicMapper.electronicToRequest(e);
            devices.add(dto);
        }
        return devices;

    }

}
