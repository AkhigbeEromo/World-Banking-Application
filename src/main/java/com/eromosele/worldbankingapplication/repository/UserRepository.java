package com.eromosele.worldbankingapplication.repository;

import com.eromosele.worldbankingapplication.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Boolean existsByEmail(String email);

    Optional<UserEntity> findByEmail(String email);
}
