package com.cicd_jar.cicd_project.model.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * packageName : com.cicd_jar.cicd_project.entity
 * fileName    : ProductEntity
 * author      : jaejun
 * date        : 2024-10-18
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-18         jaejun
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
}
