package com.example.demo.model;

import java.time.LocalDate;

public class BookedRoom {
    private Long bookingId;
    private LocalDate checkIdDate;
    private LocalDate checkOutDate;
    private String guestFullName;
    private String guestEmail;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuests;
    private String bookingConfirmationCode;
    private Room room;

    public void calculateNumOfGuests(){
        this.totalNumOfGuests = this.numOfChildren + this.numOfAdults ;
    }
}
