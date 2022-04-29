package com.r2ag.citiesapi.distances.resource;

import com.r2ag.citiesapi.distances.service.DistanceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
@AllArgsConstructor
public class DistanceResource {

    private final DistanceService service;

    @GetMapping("/by-points")
    public ResponseEntity byPoints(@RequestParam(name = "from") final Long city1,
                                   @RequestParam(name = "to") final Long city2) {
        return ResponseEntity.ok().body(service.distanceByPointsInMiles(city1, city2));
    }

    @GetMapping("/by-cube")
    public ResponseEntity byCube(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2){
        return ResponseEntity.ok().body(service.distanceByCubeInMeters(city1, city2));
    }


}
