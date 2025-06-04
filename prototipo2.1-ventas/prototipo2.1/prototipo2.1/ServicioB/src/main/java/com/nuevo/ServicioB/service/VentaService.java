package com.nuevo.ServicioB.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nuevo.ServicioB.model.Venta;
import com.nuevo.ServicioB.repository.VentaRepository;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> listarTodas() {
        return ventaRepository.findAll();
    }

    public Optional<Venta> buscarPorId(Long id) {
        return ventaRepository.findById(id);
    }

    public Venta crear(Venta venta) {
        return ventaRepository.save(venta);
    }

    public Optional<Venta> actualizar(Long id, Venta ventaNueva) {
        return ventaRepository.findById(id).map(p -> {
            p.setClienteId(ventaNueva.getClienteId());
            return ventaRepository.save(p);
        });
    }

    public boolean eliminar(Long id) {
        if (ventaRepository.existsById(id)) {
            ventaRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
