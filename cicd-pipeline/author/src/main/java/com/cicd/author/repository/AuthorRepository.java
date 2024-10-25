package com.cicd.author.repository;

import com.cicd.author.entity.AuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.cicd.author.repository
 * fileName    : AuthorRepository
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */

@Repository
public interface AuthorRepository extends JpaRepository<AuthEntity, Integer> {
}
