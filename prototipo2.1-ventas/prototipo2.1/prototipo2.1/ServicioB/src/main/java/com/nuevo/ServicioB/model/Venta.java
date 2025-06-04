package com.nuevo.ServicioB.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int clienteId;
    private int empleadoId;
    private int productoId;
    private int cantidad;
    private double total;
    private Date fecha;
}
