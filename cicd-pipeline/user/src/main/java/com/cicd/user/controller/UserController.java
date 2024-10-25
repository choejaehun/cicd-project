package com.cicd.user.controller;

import com.cicd.user.dto.UserGetDto;
import com.cicd.user.dto.UserPostDto;
import com.cicd.user.exception.DataNotFoundException;
import com.cicd.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName : com.cicd.user.controller
 * fileName    : UserController
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public UserPostDto create(@RequestBody UserPostDto userPostDto) {
        return userService.create(userPostDto);
    }

    @GetMapping("/{id}")
    @Cacheable(key = "#id", value = "USER")
    public UserGetDto getById(@PathVariable("id") int id) throws DataNotFoundException {
        return userService.getById(id);
    }

    @GetMapping()
    public List<UserGetDto> getAll() {
        return userService.getAll();
    }
}
