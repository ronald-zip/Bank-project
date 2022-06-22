package com.ronald.bankingbusiness.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("passives")
public class Passive
{
    @Id
    private String numberAccount;
    private String typeAccount;
    private String dniClient;
    private Double balance;
}
