package com.globalmatics.bike.Controllers;

import com.globalmatics.bike.Models.Bike;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @GetMapping
    public List<Bike> list(){

        List<Bike> bikes = new ArrayList<>();

        return bikes;

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
  public void create(@RequestBody Bike bike){

  }

  @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id){
        return  new Bike();
    }


}
