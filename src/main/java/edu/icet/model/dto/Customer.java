package edu.icet.model.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Customer {
    private Long id;
    private String name;
    private String email;
    private String password;
}
