package com.apap.tutorial04.repository;

import com.apap.tutorial04.model.FlightModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDb extends JpaRepository<FlightModel,Long> {


}
