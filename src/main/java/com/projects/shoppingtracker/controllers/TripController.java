package com.projects.shoppingtracker.controllers;

import com.projects.shoppingtracker.entities.Trip;
import com.projects.shoppingtracker.repositories.TripRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/trip")
public class TripController {

    private TripRepository tripRepository;

    public TripController(TripRepository tripsRepository) {
        this.tripRepository = tripsRepository;
    }

    @PostMapping
    public Trip addNewTrip(@RequestBody Trip trips) {
        return tripRepository.save(trips);
    }

}
