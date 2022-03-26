package com.vodafone.backend.api.controller;

import com.vodafone.backend.entity.Gamer;
import com.vodafone.backend.service.interfaces.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/gamers/")
@RestController
public class GamerController {
    private GamerService gamerService;
    @Autowired
    public GamerController(GamerService gamerService) {
        this.gamerService = gamerService;
    }
    @GetMapping("findAll")
    public List<Gamer> findAll(){
        return gamerService.findAll();
    }
    @GetMapping("findbyid/{id}")
    public Optional<Gamer> findById(@PathVariable int id){
        return gamerService.findGamerById(id);
    }
    @PostMapping("add")
    public Gamer createGamer(Gamer gamer){
        return gamerService.createGamer(gamer);
    }
    @DeleteMapping("delete")
    public void deleteGamer(int id){
        gamerService.deleteGamer(id);
    }
}
