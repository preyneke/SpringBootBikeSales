package com.globalmatics.bike.Repositories;

import com.globalmatics.bike.Models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
