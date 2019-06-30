package com.example.Controller;

import com.example.Mapper.OtherDeviceMapper;
import com.example.Service.OtherDeviceService;
import com.example.Service.StorageService;
import com.example.dto.OtherDeviceDto;
import com.example.entity.OtherDevice;
import com.example.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OtherDeviceController {

    @Autowired
    private OtherDeviceService otherDeviceService;
    @Autowired
    private StorageService storageService;
    @RequestMapping(value = "/showAllOtherDevice", method = RequestMethod.GET)
    @ResponseBody
    public List<OtherDeviceDto> showAllOtehr(){
        List<OtherDevice> otherDevices = otherDeviceService.getAll();
        List<OtherDeviceDto> dtos = new ArrayList<>();
        OtherDeviceDto dto = new OtherDeviceDto();
        for (OtherDevice o :otherDevices) {
            dto = OtherDeviceMapper.deviceToRequest(o);
            dtos.add(dto);
        }
        return dtos;
    }



    @RequestMapping(value = "/saveOtherDevices", method = RequestMethod.POST,
                   produces = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void saveOtherDtos(@RequestBody OtherDeviceDto dto ){
        OtherDevice otherDevice = OtherDeviceMapper.requestToOtherDeviceSave(dto);
        otherDevice.setStorageOther(storageService.getById(dto.getIdStorage()));
        otherDeviceService.save(otherDevice);


    }
    @RequestMapping(value = "/updateOtherDevices", method = RequestMethod.PUT,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void updateOtherDtos(@RequestBody OtherDeviceDto dto ){
        OtherDevice otherDevice = OtherDeviceMapper.requestToOtherDeviceUpdate(dto);
        otherDevice.setStorageOther(storageService.getById(dto.getIdStorage()));
        otherDeviceService.save(otherDevice);

    }
}
