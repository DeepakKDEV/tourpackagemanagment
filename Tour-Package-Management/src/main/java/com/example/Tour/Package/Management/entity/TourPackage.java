package com.example.Tour.Package.Management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class TourPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String duration;
    private String actualPrice;
    private String discountedPrice;
    private String discountInPercentage;
    private String location;
    private String imageUrl;


    public TourPackage(Long id, String title, String description, String duration, String actualPrice, String discountInPercentage, String discountedPrice, String location, String imageUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.actualPrice = actualPrice;
        this.discountInPercentage = discountInPercentage;
        this.discountedPrice = discountedPrice;
        this.location = location;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(String actualPrice) {
        this.actualPrice = actualPrice;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getDiscountInPercentage() {
        return discountInPercentage;
    }

    public void setDiscountInPercentage(String discountInPercentage) {
        this.discountInPercentage = discountInPercentage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
