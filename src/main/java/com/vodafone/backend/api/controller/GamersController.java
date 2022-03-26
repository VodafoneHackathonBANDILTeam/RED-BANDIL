package com.vodafone.backend.api.controller;

import com.vodafone.backend.entity.Gamer;
import com.vodafone.backend.service.interfaces.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("/api/gamers/")
@RestController
public class GamersController {
    private GamerService gamerService;
    @Autowired
    public GamersController(GamerService gamerService) {
        this.gamerService = gamerService;
    }
    @Autowired
    private BCryptPasswordEncoder passEncoder;
    @GetMapping("findall")
    public List<Gamer> findAll(){
        return gamerService.findAll();
    }
    @GetMapping("findbyid/{id}")
    public Optional<Gamer> findById(@PathVariable int id){
        return gamerService.findGamerById(id);
    }
    @PostMapping("add")
    public Gamer createGamer(@RequestBody Gamer gamer){
        gamer.setPassword(passEncoder.encode(gamer.getPassword()));
        return  gamerService.createGamer(gamer);
    }
    @DeleteMapping("delete/{id}")
    public void deleteGamer(@PathVariable int id){
        gamerService.deleteGamer(id);
    }
}
