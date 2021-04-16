package com.asusoftware.MyRent.service.user.impl;

import com.asusoftware.MyRent.model.User;
import com.asusoftware.MyRent.repository.UserRepository;
import com.asusoftware.MyRent.service.user.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserFinderImpl implements UserFinder {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
