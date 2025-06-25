package com.example.vehicleservice.dto;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO {
    private UUID id;
    private String licensePlate;
    private String model;
    private String email;
}

