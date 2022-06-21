package com.ronald.bankingbusiness.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("clients")
public class Client
{
    @Id
    private String dni;
    private String typeClient;
    private String product;

}