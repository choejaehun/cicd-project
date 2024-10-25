package com.cicd.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

/**
 * packageName : com.cicd.user.dto
 * fileName    : UserPostDto
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */

@Getter
@Setter
@RedisHash("USER")
public class UserPostDto {
    @JsonProperty("id")
    private String id;

    @Email
    @NotNull
    @JsonProperty("email")
    private String email;

    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("password")
    private String password;

    @JsonProperty("surname")
    private String surname;




}
