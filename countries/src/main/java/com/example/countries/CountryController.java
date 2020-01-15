package com.example.countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class CountryController {

    @GetMapping(value = "/all", produces = {"application/json"})
    public ResponseEntity<?> getAllEmployees(){
        CountriesApplication.countryList.countryList.sort((c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));

        return new ResponseEntity<>(CountriesApplication.countryList.countryList, HttpStatus.OK);
    }

    @GetMapping(value = "/start/{letter}", produces = {"application/json"})
    public ResponseEntity<?> getCountryThatStartsWith(@PathVariable char letter){
        ArrayList<Country> tempList = CountriesApplication.countryList.findCountries(c -> c.getCountryName().toUpperCase().charAt(0) == Character.toUpperCase(letter));

        return new ResponseEntity<>(tempList, HttpStatus.OK);
    }

    @GetMapping(value = "/size/{number}", produces = {"application/json"})
    public ResponseEntity<?> getCountryWithPopulationHigherThan(@PathVariable int number){
        ArrayList<Country> tempList = CountriesApplication.countryList.findCountries(c -> c.getPopulation() >= number);

        tempList.sort((c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));

        return new ResponseEntity<>(tempList, HttpStatus.OK);
    }
}
