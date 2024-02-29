package smu.mcda5550.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smu.mcda5550.hotel.entity.Hotel;
import smu.mcda5550.hotel.repository.HotelRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    private final HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> getHotels() {
        Iterable<Hotel> iterable = hotelRepository.findAll();
        List<Hotel> hotels = new ArrayList<>();
        for (Hotel hotel: iterable) {
            hotels.add(hotel);
        }
        return hotels;
    }

    public Hotel getHotel(int hotelId) throws Exception {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new Exception("ERROR.HOTEL_NOT_FOUND"));
    }

    public int createHotel(Hotel hotel) {
        return hotelRepository.save(hotel).getHotelId();
    }
}