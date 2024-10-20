package com.cicd_jar.cicd_project.model.repository;

import com.cicd_jar.cicd_project.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : com.cicd_jar.cicd_project.model.repository
 * fileName    : ProductRepository
 * author      : jaejun
 * date        : 2024-10-18
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-18         jaejun
 */

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
