package com.sistema.examenes.entities;

import jakarta.persistence.*;

@Entity
public class RolUser {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Rol rol;

    public Long getUserRolId() {
        return userRolId;
    }

    public void setUserRolId(Long userRolId) {
        this.userRolId = userRolId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public RolUser() {
    }
}
