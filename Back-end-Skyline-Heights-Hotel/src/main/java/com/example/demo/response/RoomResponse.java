package com.example.demo.response;

import java.math.BigDecimal;

import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoomResponse {
     private Long id;

    private String roomType;

    private BigDecimal roomPrice;

    private String foto;

    private boolean isBooked;

    private List<BookingResponse> bookings;


 public RoomResponse(Long id, String roomType, BigDecimal roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        
    }

    public RoomResponse(Long id, String roomType, BigDecimal roomPrice, byte[] fotoByte, boolean isBooked, List<BookingResponse> bookings) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.foto = fotoByte != null ? Base64.encodeBase64String(fotoByte) : null;
        this.isBooked = isBooked;
        this.bookings = bookings;
    }

}
