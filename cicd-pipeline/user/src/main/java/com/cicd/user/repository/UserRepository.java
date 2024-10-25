package com.cicd.user.repository;

import com.cicd.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.cicd.user.repository
 * fileName    : UserRepository
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Integer> {
}
