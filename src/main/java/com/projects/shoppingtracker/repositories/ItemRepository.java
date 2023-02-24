package com.projects.shoppingtracker.repositories;

import com.projects.shoppingtracker.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
