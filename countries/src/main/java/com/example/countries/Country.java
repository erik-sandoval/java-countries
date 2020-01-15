package com.example.countries;

import java.util.concurrent.atomic.AtomicInteger;

public class Country {

    private static AtomicInteger currId;
    private long countryId;
    private String countryName;
    private int landMassSize;
    private int population;
    private int medianAge;

    public Country(String countryName, int landMassSize, int population, int medianAge) {
        this.countryName = countryName;
        this.landMassSize = landMassSize;
        this.population = population;
        this.medianAge = medianAge;
    }

    public Country(Country toClone){
        this.countryName = toClone.getCountryName();
        this.landMassSize = toClone.getLandMassSize();
        this.population = toClone.getPopulation();
        this.medianAge = toClone.getMedianAge();
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getLandMassSize() {
        return landMassSize;
    }

    public void setLandMassSize(int landMassSize) {
        this.landMassSize = landMassSize;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(int medianAge) {
        this.medianAge = medianAge;
    }
}
