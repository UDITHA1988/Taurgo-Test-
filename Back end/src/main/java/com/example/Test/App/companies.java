package com.example.Test.App;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "companies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class companies {

    @Id
    private ObjectId _id;

    private String companyId;

    private String companyName;
}
