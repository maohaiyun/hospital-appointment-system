package com.auth.management.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    @Column(unique=true)
    private String phoneNumber;
    @ManyToMany(fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}

    )
    private List<Role> roles = new ArrayList<>();


    @OneToMany(mappedBy = "patient" , cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<Appointment> appointmentsAsPatient;

    @OneToMany(mappedBy = "doctor")
    @JsonBackReference
    private List<Appointment> appointmentsAsDoctor;



}