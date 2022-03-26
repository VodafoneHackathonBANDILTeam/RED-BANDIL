package com.vodafone.backend.api.controller;

import com.vodafone.backend.entity.Community;
import com.vodafone.backend.service.interfaces.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/communities/")
public class CommunitiesController {
    private CommunityService communityService;
    @Autowired
    public CommunitiesController(CommunityService communityService) {
        this.communityService = communityService;
    }
    @GetMapping("findall")
    public List<Community> findAll(){
        return communityService.findAll();
    }
    @GetMapping("findbyid/{id}")
    public Optional<Community> findById(@PathVariable int id){
        return communityService.findCommunityById(id);
    }
    @PostMapping("add")
    public Community createCommunity(@RequestBody Community community){
        return communityService.createCommunity(community);
    }
    @DeleteMapping("delete/{id}")
    public void deleteCommunity(@PathVariable int id){
        communityService.deleteCommunity(id);
    }
}
