package com.nuevo.ServicioB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuevo.ServicioB.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
