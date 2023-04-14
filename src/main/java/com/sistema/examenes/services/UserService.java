package com.sistema.examenes.services;

import com.sistema.examenes.entities.RolUser;
import com.sistema.examenes.entities.User;

import java.util.List;
import java.util.Set;

public interface UserService {

    public User saveUser(User user, Set<RolUser> rolUsers) throws Exception;

    public User getUser(String username);

    public List<User> getUsers();

    public void deleteUser(Long userId);
}
