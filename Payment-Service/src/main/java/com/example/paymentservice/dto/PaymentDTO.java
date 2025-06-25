package com.example.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {
    private UUID paymentId;
    private String licensePlate;
    private String userEmail;
    private String parkingLocation;
    private int amount;
    private Date paymentDate;
    private Date bookingDate;
    private Time paymentTime;


    public static String getEmail() {
        // This method is not implemented in the original code snippet.
        // It seems to be a placeholder for retrieving the email of the user.
        // You might want to implement this method based on your application's requirements.
        return null;
    }
}
