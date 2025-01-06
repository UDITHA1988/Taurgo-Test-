package com.example.Test.App;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "bookings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class bookings {

    @Id
    private ObjectId _id;

    private String bookingId;

    private String clientId;

    private String serviceId;

    private String bookingDate;

    private String status;
}
