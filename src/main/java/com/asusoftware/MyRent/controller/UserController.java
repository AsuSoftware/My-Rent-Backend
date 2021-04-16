package com.asusoftware.MyRent.controller;

import com.asusoftware.MyRent.dto.user.CreateUserDto;
import com.asusoftware.MyRent.dto.user.UserDto;
import com.asusoftware.MyRent.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping(path = "/create")
    public void create(@Valid @RequestBody CreateUserDto createUserDto) {
        userService.create(createUserDto);
    }

    @GetMapping(path = "/all")
    public List<UserDto> getAllUsers() {
        return userService.findAll();
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable(name = "id") UUID id) {
        userService.delete(id);
    }
}
