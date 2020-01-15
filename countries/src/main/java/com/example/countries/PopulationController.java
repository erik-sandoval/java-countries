package com.example.countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/population")
public class PopulationController {

    @GetMapping(value = "/min", produces = {"application/json"})
    public ResponseEntity<?> getMinPopCountry(){

        return new ResponseEntity<>(CountriesApplication.countryList.getLowestPopulation(), HttpStatus.OK);
    }

    @GetMapping(value = "/max", produces = {"application/json"})
    public ResponseEntity<?> getMaxPopCountry(){

        return new ResponseEntity<>(CountriesApplication.countryList.getHighestPopulation(), HttpStatus.OK);
    }

}
