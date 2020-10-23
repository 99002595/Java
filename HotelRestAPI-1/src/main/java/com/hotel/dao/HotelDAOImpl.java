package com.hotel.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;


import com.hotelapp.model.Hotel;

@Service
public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public Hotel getByID(int ID) {
		// TODO Auto-generated method stub
		for(Hotel hotel:showHotelList())
		{
			if(hotel.getHotelId()==ID)
				return hotel;
		}
		
		return null;
	}
		

	@Override
	public List<Hotel> getByCity(String city) {
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel: showHotelList())
		{
		
			if(hotel.getCity().equals(city))
				newHotelList.add(hotel);
		}
		
		return newHotelList;
	}
		

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel: showHotelList())
		{
		
			if(hotel.getCuisine().equals(cuisine))
				newHotelList.add(hotel);
		}
		
		return newHotelList;
	}
		
		
	private List<Hotel> showHotelList()
	{
		
			return Arrays.asList(new Hotel("Mayura",101,"Ballari","Indian"));
		

	}

}
