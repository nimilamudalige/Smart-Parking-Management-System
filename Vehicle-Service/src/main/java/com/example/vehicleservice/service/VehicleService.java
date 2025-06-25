package com.example.vehicleservice.service;

import com.example.vehicleservice.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    int saveVehicle(VehicleDTO vehicle);

    int updateVehicle(VehicleDTO vehicleDTO);

    int deleteVehicle(VehicleDTO vehicleDTO);

    List<VehicleDTO> getAllVehicle();

    VehicleDTO getVehicleByNumberPlate(String licenPlate);
}
