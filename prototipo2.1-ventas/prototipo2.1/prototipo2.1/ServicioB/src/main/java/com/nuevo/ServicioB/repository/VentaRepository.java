package com.nuevo.ServicioB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuevo.ServicioB.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
