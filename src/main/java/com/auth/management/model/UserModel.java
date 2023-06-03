package com.auth.management.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private Long id;

    @NotEmpty(message = "First Name should not be empty or null")
    private String firstName;

    @NotEmpty(message = "Last name should not be empty or null")
    private String lastName;

    @NotEmpty(message = "Email should not be empty or null")
    @Email
    private String email;

    @NotEmpty(message = "Password should not be empty")
    private String password;

    @NotEmpty(message="Phone number should not be empty")
    private String phoneNumber;
}