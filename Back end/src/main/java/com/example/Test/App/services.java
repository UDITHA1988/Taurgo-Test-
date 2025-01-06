package com.example.Test.App;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "services")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class services {

    @Id
    private ObjectId _id;

    private String serviceId;

    private String serviceName;

    private String Description;

    private String price;

    private String partnerId;
}
