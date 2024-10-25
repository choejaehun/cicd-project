package com.cicd.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

/**
 * packageName : com.cicd.user.dto
 * fileName    : UserGetDto
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
public class UserGetDto implements Serializable {
    @JsonProperty("id")
    private String id;

    @JsonProperty("email")
    private String email;

    @JsonProperty("name")
    private String name;

    @JsonProperty("password")
    private String password;

    @JsonProperty("surname")
    private String surname;

}
