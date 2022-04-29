package com.r2ag.citiesapi.cities.resource;

import com.r2ag.citiesapi.cities.entities.City;
import com.r2ag.citiesapi.cities.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityService service;

    @GetMapping
    public ResponseEntity cities(Pageable page){
        return ResponseEntity.ok().body(service.allCities(page));
    }

    @GetMapping("/{name}")
    public ResponseEntity cityByName(@PathVariable String name){
       List<City> listCity = service.findByName(name);

       return listCity.isEmpty()? ResponseEntity.notFound().build(): ResponseEntity.ok().body(listCity);
    }
}
