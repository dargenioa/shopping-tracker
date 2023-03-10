package com.projects.shoppingtracker.controllers;

import com.projects.shoppingtracker.entities.Trip;
import com.projects.shoppingtracker.repositories.TripRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/trip")
public class TripController {

    private TripRepository tripRepository;

    public TripController(TripRepository tripsRepository) {
        this.tripRepository = tripsRepository;
    }

    @PostMapping("/add")
    public Trip addNewTrip(@RequestBody Trip trips) {
        return tripRepository.save(trips);
    }

    @PostMapping("/update/{id}")
    public Trip updateTrip(@RequestBody Trip trip, @PathVariable String id) {
        return tripRepository.save(trip);
    }
    @GetMapping("/")
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }


}
