package com.sistema.examenes;

import com.sistema.examenes.entities.Rol;
import com.sistema.examenes.entities.RolUser;
import com.sistema.examenes.entities.User;
import com.sistema.examenes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamenesApplication implements CommandLineRunner {

	@Autowired
    private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamenesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*User user = new User();
		user.setName("Daniel");
		user.setLastname("Lorenzo");
		user.setUsername("LoreS");
		user.setPassword("12345");
		user.setEmail("lo@gmail.com");
		user.setPhone("52854185");
		user.setProfile("photo.png");

		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setName("ADMIN");

		Set<RolUser> rolUsers = new HashSet<>();
		RolUser rolUser = new RolUser();
		rolUser.setRol(rol);
		rolUser.setUser(user);
		rolUsers.add(rolUser);

		User savedUser = userService.saveUser(user, rolUsers);
		System.out.println(savedUser.getUsername());*/
	}
}
