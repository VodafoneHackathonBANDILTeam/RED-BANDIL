package com.vodafone.backend.service.implement;

import com.vodafone.backend.repository.GamerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private GamerRepository gamerRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var result =gamerRepository.findByUsername(username);
        if(result !=null) {
            return new User(username,result.getPassword(),new ArrayList<>());
        }

        throw new UsernameNotFoundException(username);
    }

}
