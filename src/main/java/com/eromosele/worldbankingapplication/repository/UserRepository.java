package com.eromosele.worldbankingapplication.repository;

import com.eromosele.worldbankingapplication.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Boolean existsByEmail(String email);
}
