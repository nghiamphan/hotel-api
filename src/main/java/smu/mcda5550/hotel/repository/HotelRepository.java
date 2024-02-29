package smu.mcda5550.hotel.repository;

import org.springframework.data.repository.CrudRepository;
import smu.mcda5550.hotel.entity.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {
}