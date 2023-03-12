package com.sistema.examenes.controllers;

import com.sistema.examenes.entities.Rol;
import com.sistema.examenes.entities.RolUser;
import com.sistema.examenes.entities.User;
import com.sistema.examenes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) throws Exception{
        Set<RolUser> roles = new HashSet<>();
        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setName("Normal");

        RolUser rolUser = new RolUser();
        rolUser.setUser(user);
        rolUser.setRol(rol);

        return userService.saveUser(user, roles);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return userService.getUser(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
    }
}
