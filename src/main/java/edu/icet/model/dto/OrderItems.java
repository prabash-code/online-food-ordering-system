package edu.icet.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class OrderItems {
    private Long orderItemId;//pk
    private Long orderDetailsId;//fk
    private String foodItemId;
    private Double foodItemPrice;
}
