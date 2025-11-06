package edu.icet.model.dto;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PlaceOrder {

    private Long id;
    private String name;
    private LocalDateTime createTime;
}

