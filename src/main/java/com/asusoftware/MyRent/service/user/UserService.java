package com.asusoftware.MyRent.service.user;

import com.asusoftware.MyRent.dto.user.CreateUserDto;

import java.util.UUID;

public interface UserService {
    void create(CreateUserDto createUserDto);
    void delete(UUID id);
}
