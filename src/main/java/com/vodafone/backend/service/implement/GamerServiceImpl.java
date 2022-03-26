package com.vodafone.backend.service.implement;

import com.vodafone.backend.entity.Gamer;
import com.vodafone.backend.repository.GamerRepository;
import com.vodafone.backend.service.interfaces.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamerServiceImpl implements GamerService {

    private GamerRepository gamerRepository;

    @Autowired
    public GamerServiceImpl(GamerRepository gamerRepository) {
        this.gamerRepository = gamerRepository;
    }


    @Override
    public List<Gamer> findAll() {
        return gamerRepository.findAll();
    }

    @Override
    public Optional<Gamer> findGamerById(int id) {
        return gamerRepository.findById(id);
    }

    @Override
    public Gamer createGamer(Gamer gamer) {
        return gamerRepository.save(gamer);
    }

    @Override
    public void deleteGamer(int id) {
        gamerRepository.deleteById(id);
    }
}
