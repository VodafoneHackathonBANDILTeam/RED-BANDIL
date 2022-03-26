package com.vodafone.backend.service.implement;

import com.vodafone.backend.entity.Community;
import com.vodafone.backend.repository.CommunityRepository;
import com.vodafone.backend.service.interfaces.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommunityServiceImpl implements CommunityService {
    private CommunityRepository communityRepository;

    @Autowired
    public CommunityServiceImpl(CommunityRepository communityRepository) {
        this.communityRepository = communityRepository;
    }


    @Override
    public List<Community> findAll() {
        return communityRepository.findAll();
    }

    @Override
    public Optional<Community> findCommunityById(int id) {
        return communityRepository.findById(id);
    }

    @Override
    public Community createCommunity(Community community) {
        return communityRepository.save(community);
    }

    @Override
    public void deleteCommunity(int id) {

    }
}
