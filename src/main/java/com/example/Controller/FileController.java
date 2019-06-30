package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileController {
    @GetMapping("/home")
    public  String indexFile(){
        return "index";
    }
    public String infoTableAllElements(){
        return "index";
    }
    @GetMapping("/cabinetsInfo")
    public String cabinetController(){
        return"infoAllCabinet";
    }
    @GetMapping("/courpsInfo")
    public String courpsController(){
        return"infoAllCourps";
    }
    @GetMapping("/electronicInfo")
    public String elecronicFileController(){return "infoElectronic";}
    @GetMapping("/furnitureInfo")
    public String furnitureFileController(){
        return "furnitureInfo";
    }
    @GetMapping("/otherDeviceInfo")
    public String otherDeviceFileController(){
        return "infoOtherDevice";
    }
    @GetMapping("storageInfo")
    public String storageInfoController(){
        return "storageInfo";
    }
}
