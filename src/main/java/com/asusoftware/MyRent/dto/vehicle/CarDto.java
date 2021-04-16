package com.asusoftware.MyRent.dto.vehicle;

import com.asusoftware.MyRent.model.Car;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class CarDto {

    @Id private UUID id;
    @NotBlank private String brand;
    @NotBlank private String model;
    @NotBlank private int hp;
    @NotBlank private String engine;
    @NotNull private LocalDateTime year;
    @NotNull private long km;
    @NotNull private int numberOfDoors;
    @NotBlank private String color;
    @NotBlank private long fuelCapacity;

    public static Car toEntity(CarDto carDto) {
        Car car = new Car();
        car.setId(carDto.getId());
        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setHp(carDto.getHp());
        car.setEngine(carDto.getEngine());
        car.setYear(carDto.getYear());
        car.setKm(carDto.getKm());
        car.setNumberOfDoors(carDto.getNumberOfDoors());
        car.setColor(carDto.getColor());
        car.setFuelCapacity(carDto.getFuelCapacity());
        return car;
    }

    public static CarDto toDto(Car car) {
        CarDto carDto = new CarDto();
        carDto.setId(car.getId());
        carDto.setBrand(car.getBrand());
        carDto.setModel(car.getModel());
        carDto.setHp(car.getHp());
        carDto.setEngine(car.getEngine());
        carDto.setYear(car.getYear());
        carDto.setKm(car.getKm());
        carDto.setNumberOfDoors(car.getNumberOfDoors());
        carDto.setColor(car.getColor());
        carDto.setFuelCapacity(carDto.getFuelCapacity());
        return carDto;
    }
}
