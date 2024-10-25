package com.cicd.user.service;

import com.cicd.user.dto.UserGetDto;
import com.cicd.user.dto.UserPostDto;
import com.cicd.user.entity.UserEntity;
import com.cicd.user.exception.DataNotFoundException;
import com.cicd.user.mapper.UserMapper;
import com.cicd.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.cicd.user.service
 * fileName    : UserService
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserPostDto create(UserPostDto userPostDto) {
        userRepository.save(userMapper.userPostDtoToUser(userPostDto));
        return userPostDto;
    }

    public UserGetDto getById(int id) throws DataNotFoundException {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(DataNotFoundException::new);
        return userMapper.userToUserGetDto(userEntity);
    }

    public List<UserGetDto> getAll() {
        List<UserEntity> users = userRepository.findAll();
        return userMapper.userToUserGetDtos(users);
    }
}
