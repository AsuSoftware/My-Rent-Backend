package com.asusoftware.MyRent.dto.user;

import com.asusoftware.MyRent.model.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Getter
@Setter
public class CreateUserDto {

    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @NotBlank @Email private String email;
    @NotBlank private String password;
    @NotNull private LocalDateTime birthday;

    public static User toEntity(CreateUserDto createUserDto) {
        User user = new User();
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setEmail(createUserDto.getEmail());
        user.setPassword(createUserDto.getPassword());
        user.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
        return user;
    }
}
