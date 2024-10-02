package com.hotelService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelService.entities.Hotel;
import com.hotelService.excepation.ResourceNotFoundException;
import com.hotelService.respository.HotelRepository;
 

@Service 
public class HotelServiceImpl implements HotelService {
 
    @Autowired
    HotelRepository hotelRepository;  // Fixed spelling


    public Hotel createHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }
    public  Hotel  getHotelById(String id) {
    	return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException());
		
	}
  
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }
     
    
}
