package com.example.fitness.database;

import java.util.List;

public class fitnessInfo {
        private String name;
        private String location;
        private String description;
        private List<String> photos;
        private List<String> videos;
        private List<String> products;
        private float rating;

        // Constructors, getters, and setters...

        // Example: Constructor
        public fitnessInfo(String name, String location, String description, List<String> photos, List<String> videos, List<String> products, float rating) {
            this.name = name;
            this.location = location;
            this.description = description;
            this.photos = photos;
            this.videos = videos;
            this.products = products;
            this.rating = rating;
        }

        // Getters and setters...

}
