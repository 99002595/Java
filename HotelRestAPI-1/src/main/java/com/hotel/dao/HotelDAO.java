package com.hotel.dao;

import java.util.List;

import com.hotelapp.model.Hotel;

public interface HotelDAO {
	List<Hotel> getAllHotels();
	Hotel getByID(int ID);
	List<Hotel> getByCity(String city);
	List<Hotel> getByCuisine(String cuisine);
	

}
