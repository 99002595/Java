package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dao.HotelDAO;
import com.hotelapp.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	HotelDAO hotelDAO ;

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelDAO.getAllHotels();
	}

	@Override
	public Hotel getByID(int ID) {
		// TODO Auto-generated method stub
		return hotelDAO.getByID(ID);
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return hotelDAO.getByCity(city);
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return hotelDAO.getByCuisine(cuisine);
		
	}

}
