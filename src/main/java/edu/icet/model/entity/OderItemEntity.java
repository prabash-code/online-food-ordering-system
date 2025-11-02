package edu.icet.model.entity;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class OderItemEntity {
    private Long id;
    private Long customerId;
    private Double totalPrice;
    private LocalDateTime createTimeSpan;

}
