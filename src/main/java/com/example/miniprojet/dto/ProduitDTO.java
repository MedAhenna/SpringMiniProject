package com.example.miniprojet.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitDTO {
    private Long productId;
    private Long cooperativeId;
    private Long categoryId;
    private Long regionId;
}
