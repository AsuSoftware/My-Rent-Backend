package com.asusoftware.MyRent.dto.vehicle;

import com.asusoftware.MyRent.model.Vehicle;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
public class VehicleDto {

    @Id private UUID id;
    private CarDto carDto;
    private VanDto vanDto;
    private MotorcycleDto motorcycleDto;
    private BoatDto boatDto;
    private BicycleDto bicycleDto;

    public static Vehicle toEntity(VehicleDto vehicleDto) {
        Vehicle vehicle = new Vehicle();
        vehicle.setCar(CarDto.toEntity(vehicleDto.getCarDto()));
        vehicle.setVan(VanDto.toEntity(vehicleDto.getVanDto()));
        vehicle.setMotorcycle(MotorcycleDto.ToEntity(vehicleDto.getMotorcycleDto()));
        vehicle.setBoat(BoatDto.toEntity(vehicleDto.getBoatDto()));
        vehicle.setBicycle(BicycleDto.toEntity(vehicleDto.getBicycleDto()));
        return vehicle;
    }

    public static VehicleDto toDto(Vehicle vehicle) {
        VehicleDto vehicleDto = new VehicleDto();
        vehicleDto.setId(vehicle.getId());
        vehicleDto.setCarDto(CarDto.toDto(vehicle.getCar()));
        vehicleDto.setVanDto(VanDto.toDto(vehicle.getVan()));
        vehicleDto.setMotorcycleDto(MotorcycleDto.toDto(vehicle.getMotorcycle()));
        vehicleDto.setBoatDto(BoatDto.toDto(vehicle.getBoat()));
        vehicleDto.setBicycleDto(BicycleDto.toDto(vehicle.getBicycle()));
        return vehicleDto;
    }
}
