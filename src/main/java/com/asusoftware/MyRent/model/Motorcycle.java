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
@Table(name = "motorcycles")
public class Motorcycle {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "brand")
    private String brand;

    @NotBlank
    @Column(name = "model")
    private String model;

    @NotBlank
    @Column(name = "hp")
    private String hp;

    @NotBlank
    @Column(name = "engine")
    private String engine;

    @NotNull
    @Column(name = "year")
    private LocalDateTime year;

    @NotNull
    @Column(name = "km")
    private long km;

    @NotBlank
    @Column(name = "color")
    private String color;

    @NotNull
    @Column(name = "fuel_capacity")
    private long fuelCapacity;

}
