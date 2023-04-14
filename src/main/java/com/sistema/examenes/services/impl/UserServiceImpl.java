package com.sistema.examenes.services.impl;

import com.sistema.examenes.entities.RolUser;
import com.sistema.examenes.entities.User;
import com.sistema.examenes.repositories.RolRepository;
import com.sistema.examenes.repositories.UserRepository;
import com.sistema.examenes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolRepository rolRepository;


    @Override
    public User saveUser(User user, Set<RolUser> rolUsers) throws Exception {
        User localUser = userRepository.findByUsername(user.getUsername());
        if (localUser != null) {
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya existe");
        } else {
            for (RolUser rolUser : rolUsers) {
                rolRepository.save(rolUser.getRol());
            }
            user.getRolUsers().addAll(rolUsers);
            localUser = userRepository.save(user);
        }
        return localUser;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
