package com.example.Controller;

import com.example.Mapper.CorpsMapper;
import com.example.Service.CorpsService;
import com.example.dto.CorpsDto;
import com.example.entity.Corps;
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
public class RestCorpsController {

    @Autowired
    private CorpsService corpsService;
@RequestMapping(value = "/selectAllCorps" ,method = RequestMethod.GET)
@ResponseBody
public List<CorpsDto> selectAll(){

    CorpsDto corpsDto = new CorpsDto();
    List<Corps> corps = corpsService.getAllCorps();
    List<CorpsDto> corpsDtos = new ArrayList<>();
    for (Corps c:corps) {
        corpsDto = CorpsMapper.corpsToDto(c);
        corpsDtos.add(corpsDto);
    }
    return corpsDtos;

}

    @RequestMapping(value = "/saveCourps", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<CorpsDto> saveCabinetDtos(@RequestBody CorpsDto dto ){

    Corps corps = CorpsMapper.requestToCorpsSave(dto);
    corpsService.save(corps);
    List<CorpsDto> corpsDtos = new ArrayList<>();
    List<Corps> corpsList = corpsService.getAllCorps();

        for (Corps c:corpsList) {
         dto = CorpsMapper.corpsToDto(c);
         corpsDtos.add(dto);
        }
return corpsDtos;
    }
    @RequestMapping(value = "/saveCourps", method = RequestMethod.PUT,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void updateCabinetDtos(@RequestBody CorpsDto dto ){

        Corps corps = CorpsMapper.requestToCorpsSave(dto);
        corps.setId(dto.getId());
        corpsService.save(corps);
//        List<CorpsDto> corpsDtos = new ArrayList<>();
//        List<Corps> corpsList = corpsService.getAllCorps();
//
//        for (Corps c:corpsList) {
//            dto = CorpsMapper.corpsToDto(c);
//            corpsDtos.add(dto);
//        }
//        return corpsDtos;
    }
}
