package si.meshetr.adrealestate.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import si.meshetr.adrealestate.models.RealEstateAd;
import si.meshetr.adrealestate.repos.AdRealEstateRepository;

@RestController
public class RealEstateAdController {

    @Autowired
    AdRealEstateRepository adRealEstateRepository;

    static final Logger logger = LogManager.getLogger("CONSOLE_JSON_APPENDER");

    @PostMapping("/realestate/api/v1/ad")
    public void postAd(RealEstateAd realEstateAd){
        logger.info(String.format("RealEstate ad created " + realEstateAd.toString()));
        adRealEstateRepository.save(realEstateAd);
    }

    @GetMapping("/realestate/api/v1/ad/{id}")
    public void getAd(@PathVariable("id") long id){
        logger.info(String.format("RealEstate ad requested " + id));
    }

    @PutMapping("/realestate/api/v1/ad")
    public RealEstateAd updateAd(@RequestBody RealEstateAd newAdModel, @PathVariable Long id){
        logger.info(String.format("RealEstate ad updated " + id));

        return adRealEstateRepository.findById(id)
                .map(adModel -> {
                    adModel.setDescription(newAdModel.getDescription());
                    adModel.setPrice(newAdModel.getPrice());
                    adModel.setTitle(newAdModel.getTitle());
                    adModel.setIdUser(newAdModel.getIdUser());
                    return adRealEstateRepository.save(adModel);
                })
                .orElseGet(() -> {
                    newAdModel.setIdAd(id);
                    return adRealEstateRepository.save(newAdModel);
                });
    }

    @DeleteMapping("/realestate/api/v1/ad/{id}")
    public void deleteAd(@PathVariable Long id){
        logger.info(String.format("RealEstate ad deleted " + id));

        adRealEstateRepository.deleteById(id);
    }



}
