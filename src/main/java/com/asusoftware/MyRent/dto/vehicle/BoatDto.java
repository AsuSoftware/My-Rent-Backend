package com.asusoftware.MyRent.dto.vehicle;

import com.asusoftware.MyRent.model.Boat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class BoatDto {

    @Id
    private UUID id;
    @NotBlank
    private String brand;
    @NotBlank private String model;
    @NotNull private int numberOfBeds;
    @NotBlank private int hp;
    @NotBlank private String engine;
    @NotNull private int meters;
    @NotNull private boolean isGps;
    @NotNull private long hour;
    @NotBlank private String color;
    @NotNull
    private LocalDateTime year;

    public static Boat toEntity(BoatDto boatDto) {
        Boat boat = new Boat();
        boat.setId(boatDto.getId());
        boat.setBrand(boatDto.getBrand());
        boat.setModel(boatDto.getModel());
        boat.setNumberOfBeds(boatDto.getNumberOfBeds());
        boat.setHp(boatDto.getHp());
        boat.setEngine(boatDto.getEngine());
        boat.setMeters(boatDto.getMeters());
        boat.setGps(boatDto.isGps());
        boat.setHour(boatDto.getHour());
        boat.setColor(boatDto.getColor());
        boat.setYear(boatDto.getYear());
        return boat;
    }

    public static BoatDto toDto(Boat boat) {
        BoatDto boatDto = new BoatDto();
        boatDto.setId(boat.getId());
        boatDto.setBrand(boat.getBrand());
        boatDto.setModel(boat.getModel());
        boatDto.setNumberOfBeds(boat.getNumberOfBeds());
        boatDto.setHp(boat.getHp());
        boatDto.setEngine(boat.getEngine());
        boatDto.setMeters(boat.getMeters());
        boatDto.setGps(boat.isGps());
        boatDto.setHour(boat.getHour());
        boatDto.setColor(boat.getColor());
        boatDto.setYear(boat.getYear());
        return boatDto;
    }
}
