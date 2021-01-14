package si.meshetr.adrealestate.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RealEstateAdController {
    @CrossOrigin
    @GetMapping("/")
    public String getHome(){
        return "Hello World!";
    }
}