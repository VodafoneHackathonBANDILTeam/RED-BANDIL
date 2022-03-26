package com.vodafone.backend.service.interfaces;

import com.vodafone.backend.entity.Gamer;

import java.util.List;
import java.util.Optional;

public interface GamerService {
    List<Gamer> findAll();
    Optional<Gamer> findGamerById(int id);
    Gamer createGamer(Gamer gamer);
    void deleteGamer(int id);
}
