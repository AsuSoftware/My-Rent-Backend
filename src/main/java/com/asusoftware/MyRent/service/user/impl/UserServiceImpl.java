package com.asusoftware.MyRent.service.user.impl;

import com.asusoftware.MyRent.dto.user.CreateUserDto;
import com.asusoftware.MyRent.dto.user.UserDto;
import com.asusoftware.MyRent.service.user.UserCreator;
import com.asusoftware.MyRent.service.user.UserFinder;
import com.asusoftware.MyRent.service.user.UserRemoval;
import com.asusoftware.MyRent.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserCreator userCreator;
    private final UserFinder userFinder;
    private final UserRemoval userRemoval;

    @Override
    public void create(CreateUserDto createUserDto) {
        userCreator.create(createUserDto);
    }

    @Override
    public List<UserDto> findAll() {
        return userFinder.findAll().stream().map(UserDto::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(UUID id) {
       userRemoval.delete(id);
    }
}
