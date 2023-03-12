package com.sistema.examenes.services;

import com.sistema.examenes.entities.RolUser;
import com.sistema.examenes.entities.User;

import java.util.Set;

public interface UserService {

    public User saveUser(User user, Set<RolUser> rolUsers) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);
}
