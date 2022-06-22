package com.ronald.bankingbusiness.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("credits")
public class Credit
{
    @Id
    private String numberCredit;
    private String typeCredit;
    private String dniClient;
    private Double balanceCredit;
}