package edu.icet.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FoodItem {
    private Long id;
    private String name;
    private String unitPrice;
    private String description;
}
