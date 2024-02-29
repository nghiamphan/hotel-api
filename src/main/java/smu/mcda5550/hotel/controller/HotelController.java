package smu.mcda5550.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import smu.mcda5550.hotel.entity.Hotel;
import smu.mcda5550.hotel.service.HotelService;

import java.util.List;

@RequestMapping(value = "/api/hotels")
@RestController
public class HotelController {
    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping(value = "")
    public ResponseEntity<List<Hotel>> getHotels() {
        List<Hotel> hotels = hotelService.getHotels();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

    @GetMapping(value = "/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable int hotelId) throws Exception {
        Hotel hotel = hotelService.getHotel(hotelId);
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Integer> createHotel(@RequestBody Hotel hotel) {
        int hotelId = hotelService.createHotel(hotel);
        return new ResponseEntity<>(hotelId, HttpStatus.CREATED);
    }
}