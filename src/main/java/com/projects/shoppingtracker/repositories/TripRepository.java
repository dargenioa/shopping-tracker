package com.projects.shoppingtracker.repositories;

import com.projects.shoppingtracker.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Integer> {
}
