package edu.icet.model.dto;

import jakarta.persistence.Column;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Order {
    private Long orderId;
    private Long customerId;
    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createTime;


}
