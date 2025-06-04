package com.nuevo.ServicioB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuevo.ServicioB.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
