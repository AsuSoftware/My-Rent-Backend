package com.asusoftware.MyRent.service.user.impl;

import com.asusoftware.MyRent.dto.user.CreateUserDto;
import com.asusoftware.MyRent.repository.UserRepository;
import com.asusoftware.MyRent.service.user.UserCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCreatorImpl implements UserCreator {

    private final UserRepository userRepository;

    @Override
    public void create(CreateUserDto createUserDto) {
        userRepository.save(CreateUserDto.toEntity(createUserDto));
    }
}
