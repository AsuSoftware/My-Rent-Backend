package com.asusoftware.MyRent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "bicycles")
public class Bicycle {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "brand")
    private String brand;

    @NotBlank
    @Column(name = "model")
    private String model;

    @NotNull
    @Column(name = "year")
    private LocalDateTime year;

    @NotBlank
    @Column(name = "color")
    private String color;

}
