package com.asusoftware.MyRent.controller;

import com.asusoftware.MyRent.dto.user.CreateUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/users")
public class UserController {

    @PostMapping
    public void create(@Valid @RequestBody CreateUserDto createUserDto) {}
}
