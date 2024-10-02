package com.hotelService.service;

import java.util.List;

import com.hotelService.entities.Hotel;


public interface HotelService  {
	  // to create hotel 
	    Hotel createHotel(Hotel hotel);
	    
	    List<Hotel>  getAll();
	    
	    
	    Hotel getHotelById(String id);
	    
	    

}
