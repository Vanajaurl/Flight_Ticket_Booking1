package com.kingflyer.flightbooking.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.Model.Flight;
import com.kingflyer.flightbooking.Repository.FlightRepo;
@Service
@Transactional
public class FlightService {
    @Autowired
    FlightRepo repo;
    public Flight addFlightDetails1(Flight f) {

		return repo.save(f);
	}

		public List<Flight> findByDepartureLocationAndArrivalLocation(String departureLocation, String arrivalLocation) {
		return repo.findByDepartureLocationAndArrivalLocation(departureLocation,arrivalLocation);
	}

		public Optional<Flight> findById(int findByremainingEconomySeats) {
			// TODO Auto-generated method stub
			return null;
		}

		public Object addFlightDetails(Flight flight) {
			// TODO Auto-generated method stub
			return null;
		}

   
}
