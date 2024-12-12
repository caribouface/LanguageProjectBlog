package org.jonathonstephens.languageprojectblog.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotNull
    @Size(min = 3, max = 20)
    private String username;

    @Column(nullable = false)
    @NotNull
    private String password;

    @Column(nullable = false, unique = true)
    @NotNull
    @Email
    private String email;
}