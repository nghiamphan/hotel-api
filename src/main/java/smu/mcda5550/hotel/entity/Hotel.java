package smu.mcda5550.hotel.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelId;

    @Column(nullable = false)
    private String name;

    @Column
    private String location;

    @Column
    private int availableRooms;

    @Column
    private float rating;
}