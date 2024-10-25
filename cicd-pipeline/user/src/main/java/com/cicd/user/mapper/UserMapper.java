package com.cicd.user.mapper;

import com.cicd.user.dto.UserGetDto;
import com.cicd.user.dto.UserPostDto;
import com.cicd.user.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * packageName : com.cicd.user.mapper
 * fileName    : UserMapper
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserGetDto userToUserGetDto(UserEntity user);

    UserEntity userPostDtoToUser(UserPostDto userPostDto);

    List<UserGetDto> userToUserGetDtos(List<UserEntity> users);
}
