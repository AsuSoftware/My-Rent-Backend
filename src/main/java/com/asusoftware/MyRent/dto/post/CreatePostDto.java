package com.asusoftware.MyRent.dto.post;

import com.asusoftware.MyRent.dto.vehicle.VehicleDto;
import com.asusoftware.MyRent.model.CategoryType;
import com.asusoftware.MyRent.model.Post;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreatePostDto {

    private String description;
    @Enumerated(EnumType.STRING) private CategoryType categoryType;
    @NotBlank private String pricePerDay;
    @NotNull private VehicleDto vehicleDto;

    public static Post toEntity(CreatePostDto createPostDto) {
        Post post = new Post();
        post.setDescription(createPostDto.description);
        post.setCategoryType(createPostDto.getCategoryType());
        post.setPricePerDay(createPostDto.getPricePerDay());
        post.setVehicle(VehicleDto.toEntity(createPostDto.getVehicleDto()));
        return post;
    }
}
