package com.asusoftware.MyRent.dto.vehicle;

import com.asusoftware.MyRent.model.Van;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class VanDto {

    @Id
    private UUID id;
    @NotBlank
    private String brand;
    @NotBlank private String model;
    @NotBlank private int hp;
    @NotBlank private String engine;
    @NotNull
    private LocalDateTime year;
    @NotNull private long km;
    @NotNull private int numberOfDoors;
    @NotBlank private String color;
    @NotNull private int numberOfSeats;
    @NotBlank private long fuelCapacity;

    public static Van toEntity(VanDto vanDto) {
        Van van = new Van();
        van.setId(vanDto.getId());
        van.setBrand(vanDto.getBrand());
        van.setModel(vanDto.getModel());
        van.setHp(vanDto.getHp());
        van.setEngine(vanDto.getEngine());
        van.setYear(vanDto.getYear());
        van.setKm(vanDto.getKm());
        van.setColor(vanDto.getColor());
        van.setNumberOfSeats(vanDto.getNumberOfSeats());
        van.setFuelCapacity(vanDto.getFuelCapacity());
        return van;
    }

    public static VanDto toDto(Van van) {
        VanDto vanDto = new VanDto();
        vanDto.setId(van.getId());
        vanDto.setBrand(van.getBrand());
        vanDto.setModel(van.getModel());
        vanDto.setHp(van.getHp());
        vanDto.setEngine(van.getEngine());
        vanDto.setYear(van.getYear());
        vanDto.setKm(van.getKm());
        vanDto.setColor(van.getColor());
        vanDto.setNumberOfSeats(van.getNumberOfSeats());
        vanDto.setFuelCapacity(van.getFuelCapacity());
        return vanDto;
    }
}
