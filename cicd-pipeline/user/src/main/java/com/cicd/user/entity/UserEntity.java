package com.cicd.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName : com.cicd.user.entity
 * fileName    : UserEntity
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
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column(unique = true, nullable = false)
    private int id;

    @Basic
    @Column(name="email", nullable = false)
    private String email;

    @Basic
    @Column(name = "password", nullable = false)
    private String password;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "surname")
    private String surname;
}
