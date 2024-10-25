package com.cicd.author.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * packageName : com.cicd.author.entity
 * fileName    : AuthEntity
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
@Table(name= "author")
public class AuthEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Basic
    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Basic
    @Column(name = "birth_date", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date birthDate;

}
