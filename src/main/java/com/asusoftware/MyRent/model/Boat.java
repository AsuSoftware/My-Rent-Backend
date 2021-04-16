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
@Table(name = "boats")
public class Boat {

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
    @Column(name = "number_of_beds")
    private int numberOfBeds;

    @NotNull
    @Column(name = "hp")
    private int hp;

    @NotBlank
    @Column(name = "engine")
    private String engine;

    @NotNull
    @Column(name = "meters")
    private int meters;

    @NotNull
    @Column(name = "is_gps")
    private boolean gps;

    @NotNull
    @Column(name = "hour")
    private long hour;

    @NotBlank
    @Column(name = "color")
    private String color;

    @NotNull
    @Column(name = "year")
    private LocalDateTime year;
}
