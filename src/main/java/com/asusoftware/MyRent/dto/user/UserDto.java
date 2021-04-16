package com.asusoftware.MyRent.dto.user;

import com.asusoftware.MyRent.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class UserDto {

    @Id private UUID id;
    @NotBlank
    private String firstName;
    @NotBlank private String lastName;
    @NotBlank @Email
    private String email;
   // @NotBlank private String password;
    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd") private Date birthday;
    @NotNull private LocalDateTime createdAt;

    public static UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setBirthday(user.getBirthday());
        userDto.setCreatedAt(user.getCreatedAt());
        return userDto;
    }
}
