package com.example.just_eat_backend.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestaurantController {

    private String URL = "https://uk.api.just-eat.io/discovery/uk/restaurants/enriched/bypostcode/";

    @GetMapping("/restaurants/{postcode}")
    public String getRestaurants(@PathVariable String postcode){
        String apiURL = URL + postcode;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiURL, String.class);

    }



}
