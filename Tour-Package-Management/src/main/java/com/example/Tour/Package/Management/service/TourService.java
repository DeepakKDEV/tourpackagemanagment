package com.example.Tour.Package.Management.service;

import com.example.Tour.Package.Management.entity.TourPackage;
import com.example.Tour.Package.Management.repository.TourRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class TourService {

    @Autowired
    private TourRepository repository;

    public TourService(TourRepository repository) {
        this.repository = repository;
    }

    public TourPackage saveTour(TourPackage tour) {
        log.info("save  data ");
        return repository.save(tour);
    }

    public List<TourPackage> getAllTours() {
        log.info("find all data  from  db");
        return repository.findAll();
    }

    public TourPackage getTourById(Long id) {
        log.info("find by  id ");
        return repository.findById(id).orElse(null);
    }

    public List<TourPackage> getToursByLocation(String location) {
        log.info("find  by  location");
        return repository.findByLocationIgnoreCase(location);
    }
}

