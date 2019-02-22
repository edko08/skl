package model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Username cannot be empty")
    private String login;
    @NotBlank(message = "Password cannot be empty")
    private String password;

    private String surname;
    private String name;
    private String secondname;
    private String phone;

    private boolean active;
}
