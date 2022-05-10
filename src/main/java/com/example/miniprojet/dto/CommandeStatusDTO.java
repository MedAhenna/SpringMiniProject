package com.example.miniprojet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandeStatusDTO {

    private Long commandeId;
    private Long statusId;
}
