package com.apap.tutorial04.service;

import com.apap.tutorial04.model.FlightModel;

import java.util.List;

public interface FlightService {

    void addFlight(FlightModel flight);
    void delete(FlightModel flightModel);
    List<FlightModel> getFlighDetailByLicenseNumer(String flightNumber);
}
