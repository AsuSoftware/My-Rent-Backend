package com.asusoftware.MyRent.dto.vehicle;

import com.asusoftware.MyRent.model.Motorcycle;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class MotorcycleDto {

    @Id private UUID id;
    @NotBlank
    private String brand;
    @NotBlank private String model;
    @NotBlank private int hp;
    @NotBlank private String engine;
    @NotNull
    private LocalDateTime year;
    @NotNull private long km;
    @NotBlank private String color;
    @NotBlank private long fuelCapacity;

    public static Motorcycle ToEntity(MotorcycleDto motorcycleDto) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setId(motorcycleDto.getId());
        motorcycle.setBrand(motorcycleDto.getBrand());
        motorcycle.setModel(motorcycleDto.getModel());
        motorcycle.setHp(motorcycleDto.getHp());
        motorcycle.setEngine(motorcycleDto.getEngine());
        motorcycle.setYear(motorcycleDto.getYear());
        motorcycle.setKm(motorcycleDto.getKm());
        motorcycle.setColor(motorcycleDto.getColor());
        motorcycle.setFuelCapacity(motorcycleDto.getFuelCapacity());
        return motorcycle;
    }

    public static MotorcycleDto toDto(Motorcycle motorcycle) {
        MotorcycleDto motorcycleDto = new MotorcycleDto();
        motorcycleDto.setId(motorcycle.getId());
        motorcycleDto.setBrand(motorcycle.getBrand());
        motorcycleDto.setModel(motorcycle.getModel());
        motorcycleDto.setHp(motorcycle.getHp());
        motorcycleDto.setEngine(motorcycle.getEngine());
        motorcycleDto.setYear(motorcycle.getYear());
        motorcycleDto.setKm(motorcycle.getKm());
        motorcycleDto.setColor(motorcycle.getColor());
        motorcycleDto.setFuelCapacity(motorcycle.getFuelCapacity());
        return motorcycleDto;
    }
}
