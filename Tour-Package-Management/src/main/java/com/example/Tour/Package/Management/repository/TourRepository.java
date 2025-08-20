package com.example.Tour.Package.Management.repository;

import com.example.Tour.Package.Management.entity.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourRepository extends JpaRepository<TourPackage, Long> {
    List<TourPackage> findByLocationIgnoreCase(String location);
}
