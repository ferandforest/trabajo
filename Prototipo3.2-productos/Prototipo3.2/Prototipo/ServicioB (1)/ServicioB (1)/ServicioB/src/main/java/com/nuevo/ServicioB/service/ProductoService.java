package com.nuevo.ServicioB.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nuevo.ServicioB.model.Producto;
import com.nuevo.ServicioB.repository.ProductoRepository;

@Service
public class ProductoService {

     @Autowired
    private ProductoRepository productoRepository;

     public List<Producto> listarTodas() {
        return productoRepository.findAll();
    }

    public Optional<Producto> buscarPorId(Long id) {
        return productoRepository.findById(id);
    }

    public Producto crear(Producto producto) {
        return productoRepository.save(producto);
    }

    public Optional<Producto> actualizar(Long id, Producto productoNueva) {
        return productoRepository.findById(id).map(p -> {
            p.setNombre(productoNueva.getNombre());
            return productoRepository.save(p);
        });
    }

    public boolean eliminar(Long id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
