package edu.icet.model.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class OrederDetailsEntity {
    private Long orderItemId;//pk
    private Long orderDetailsId;//fk
    private String foodItemId;
    private Double foodItemPrice;
}
