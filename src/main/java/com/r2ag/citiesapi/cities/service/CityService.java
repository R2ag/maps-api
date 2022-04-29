package com.r2ag.citiesapi.cities.service;

import com.r2ag.citiesapi.cities.entities.City;
import com.r2ag.citiesapi.cities.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityService {
    @Autowired
    private final CityRepository cityRepository;

    public Page<City> allCities(Pageable page){
        return cityRepository.findAll(page);
    }

    public List<City> findByName(String name){
        return cityRepository.findByName(name);
    }
}
