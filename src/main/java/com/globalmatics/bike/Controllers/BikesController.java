package com.globalmatics.bike.Controllers;

import com.globalmatics.bike.Models.Bike;
import com.globalmatics.bike.Repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @Autowired
    public BikeRepository bikeRepository;

    @GetMapping
    public List<Bike> list(){



        return bikeRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
  public void create(@RequestBody Bike bike){
        bikeRepository.save(bike);

  }

  @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id){
        return  bikeRepository.getOne(id);
    }


}
