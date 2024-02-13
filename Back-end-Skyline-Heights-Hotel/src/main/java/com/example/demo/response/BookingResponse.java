package com.example.demo.response;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 
public class BookingResponse {

    private Long bookingId;

    private LocalDate checkIdDate;

    private LocalDate checkOutDate;

    private String guestFullName;

    private String guestEmail
    ;
    private int numOfAdults;

    private int numOfChildren;

    private int totalNumOfGuests;

    private String bookingConfirmationCode;
    
    private RoomResponse roomResponse;


    public BookingResponse(Long bookingId, LocalDate checkIdDate, LocalDate checkOutDate, String bookingConfirmationCode) {
        this.bookingId = bookingId;
        this.checkIdDate = checkIdDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }

}
