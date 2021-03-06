package com.hotelapp.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	@GetMapping("/hotels")
	public List<Hotel> showAllBooks()
	{
		return hotelService.getAllHotels();
	}
	@GetMapping("/hotelss-by-city/{city}")
	public List<Hotel> showBooksByCity(@PathVariable("city")String city)
	{
		return hotelService.getByCity(city);
	}
	@GetMapping("/hotels-by-cuisine/{cuisine}")
	public List<Hotel> showBooksByCuisine(@PathVariable("cuisine")String cuisine)
	{
		return hotelService.getByCuisine(cuisine);
	}
	@GetMapping("/hotel-by-Id/{hotelId}")
	public Hotel showById(@PathVariable("hotelId")int id)
	{
		return hotelService.getByID(id);
	}
}
	