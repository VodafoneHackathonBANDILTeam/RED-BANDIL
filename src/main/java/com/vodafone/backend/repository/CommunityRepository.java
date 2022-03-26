package com.vodafone.backend.repository;

import com.vodafone.backend.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityRepository extends JpaRepository<Community,Integer> {
}
