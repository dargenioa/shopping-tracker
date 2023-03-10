package com.projects.shoppingtracker.controllers;

import com.projects.shoppingtracker.entities.Item;
import com.projects.shoppingtracker.repositories.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/item")
public class ItemController {
    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @PostMapping("/add")
    public Item addItemToTrip(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @GetMapping("/")
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/{tripId}")
    public List<Item> findAllByTripId(@PathVariable Integer TripId) {
        return itemRepository.findByTripId(TripId);
    }

}
