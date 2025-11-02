package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Order {
    private Long orderId;
    private Long customerId;
    @
    private LocalDateTime createTime;
}
