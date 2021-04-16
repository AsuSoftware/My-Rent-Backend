package com.asusoftware.MyRent.dto.vehicle;

import com.asusoftware.MyRent.model.Bicycle;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class BicycleDto {

    @Id private UUID id;
    @NotBlank
    private String brand;
    @NotBlank private String model;
    @NotNull
    private LocalDateTime year;
    @NotBlank private String color;

    public static Bicycle toEntity(BicycleDto bicycleDto) {
        Bicycle bicycle = new Bicycle();
        bicycle.setId(bicycleDto.getId());
        bicycle.setBrand(bicycleDto.getBrand());
        bicycle.setModel(bicycleDto.getModel());
        bicycle.setYear(bicycleDto.getYear());
        bicycle.setColor(bicycleDto.getColor());
        return bicycle;
    }

    public static BicycleDto toDto(Bicycle bicycle) {
        BicycleDto bicycleDto = new BicycleDto();
        bicycleDto.setId(bicycle.getId());
        bicycleDto.setBrand(bicycle.getBrand());
        bicycleDto.setModel(bicycle.getModel());
        bicycleDto.setYear(bicycle.getYear());
        bicycleDto.setColor(bicycle.getColor());
        return bicycleDto;
    }

}
