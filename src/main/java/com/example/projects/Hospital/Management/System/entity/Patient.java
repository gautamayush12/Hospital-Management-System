package com.example.projects.Hospital.Management.System.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
@Getter
@Setter
@Table(
        name = "patient_tbl",
        uniqueConstraints = {
                @UniqueConstraint(name="unique_patient_email", columnNames = {"email"}),
                @UniqueConstraint(name = "unique_patient_name_dob", columnNames = {"name", "birthDate"})
        },
        indexes = {
                @Index(name = "idx_patient_dob", columnList = "columnNames")
        }
)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ToString.Exclude
    private LocalDate birthDate;

    private String email;

    private String gender;


}
