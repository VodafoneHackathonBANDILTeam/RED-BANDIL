package com.vodafone.backend.service.interfaces;

import com.vodafone.backend.entity.Community;

import java.util.List;
import java.util.Optional;

public interface CommunityService {
    List<Community> findAll();
    Optional<Community> findCommunityById(int id);
    Community createCommunity(Community community);
    void deleteCommunity(int id);
}
