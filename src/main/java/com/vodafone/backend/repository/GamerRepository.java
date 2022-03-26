package com.vodafone.backend.repository;

import com.vodafone.backend.entity.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GamerRepository extends JpaRepository<Gamer,Integer> {
    Gamer findByUsername(String username);
}
