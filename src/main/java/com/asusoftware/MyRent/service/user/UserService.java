package com.asusoftware.MyRent.service.user;

import com.asusoftware.MyRent.dto.user.CreateUserDto;
import com.asusoftware.MyRent.dto.user.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {
    void create(CreateUserDto createUserDto);
    List<UserDto> findAll();
    void delete(UUID id);
}
