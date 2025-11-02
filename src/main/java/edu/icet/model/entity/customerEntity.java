package edu.icet.model.entity;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class customerEntity {
    private Long id;
    private String name;
    private String email;
    private String password;
}
