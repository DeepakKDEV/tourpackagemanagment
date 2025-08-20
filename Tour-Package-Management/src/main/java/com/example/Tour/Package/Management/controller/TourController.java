package com.example.Tour.Package.Management.controller;


import com.example.Tour.Package.Management.entity.TourPackage;
import com.example.Tour.Package.Management.service.TourService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
@Tag(name = "Tour Management", description = "APIs for managing tour packages")
public class TourController {

    @Autowired
    private final TourService service;

    public TourController(TourService service) {
        this.service = service;
    }
    @Operation(summary = "Create a new tour package", description = "Add a new tour package with details like title, description, price, duration, etc.")
    @ApiResponse(responseCode = "200", description = "Tour package created successfully")
    @PostMapping
    public TourPackage createTour(@RequestBody TourPackage tour) {
        return service.saveTour(tour);
    }
    @Operation(summary = "Get all tours", description = "Retrieve all tour packages. Optionally filter by location.")
    @ApiResponse(responseCode = "200", description = "List of tours returned successfully")
    @GetMapping
    public List<TourPackage> getAllTours(@RequestParam(required = false) String location) {
        if (location != null) {
            return service.getToursByLocation(location);
        }
        return service.getAllTours();
    }

    @Operation(summary = "Get tour by ID", description = "Retrieve a tour package by its unique ID.")
    @ApiResponse(responseCode = "200", description = "Tour package found")
    @ApiResponse(responseCode = "404", description = "Tour package not found")
    @GetMapping("/{id}")
    public TourPackage getTourById(@PathVariable Long id) {
        return service.getTourById(id);
    }
    @Operation(summary = "List all tour packages", description = "Retrieve all tour packages from the database without any filter.")
    @ApiResponse(responseCode = "200", description = "All tour packages returned successfully")
    @GetMapping("/all")
    public List<TourPackage> listAllTours() {
        return service.getAllTours();
    }
}