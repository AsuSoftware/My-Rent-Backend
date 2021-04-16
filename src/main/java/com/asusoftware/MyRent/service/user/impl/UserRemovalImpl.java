package com.asusoftware.MyRent.service.user.impl;

import com.asusoftware.MyRent.repository.UserRepository;
import com.asusoftware.MyRent.service.user.UserRemoval;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserRemovalImpl implements UserRemoval {

    private final UserRepository userRepository;

    @Override
    public void delete(UUID id) {
        userRepository.deleteById(id);
    }
}
