package com.example.Test.App;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class users {

    @Id
    private ObjectId _id;

    private String userId;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String companyId;


}
