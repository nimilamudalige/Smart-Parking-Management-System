package com.example.parkingspace.service;

import com.example.parkingspace.dto.ParkingDTO;

import java.util.List;
import java.util.UUID;

public interface ParkingService {
    int saveParkingPlace(ParkingDTO parkingDTO);

    int updateParkingPlace(ParkingDTO parkingDTO);

    int ReservationUpdateParkingPlace(String Location);

    int deleteParkingPlace(UUID id, String email, int LocationCode);

    List<ParkingDTO> getParkingPlaceCity(String city);

    List<ParkingDTO> getAllParkingPlace();
}
