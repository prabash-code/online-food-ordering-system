package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class OrderDetails {
    private Long id;
    private Long customerId;
    private Double totalPrice;
    private LocalDateTime createTimeSpan;


}
