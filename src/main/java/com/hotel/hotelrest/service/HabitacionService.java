package com.hotel.hotelrest.service;

import com.hotel.hotelrest.model.Habitacion;
import com.hotel.hotelrest.repository.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionService {

    @Autowired
    private HabitacionRepository habitacionRepository;

    public List<Habitacion> listarTodos() {
        return habitacionRepository.findAll();
    }

    public Habitacion guardar(Habitacion habitacion) {
        return habitacionRepository.save(habitacion);
    }

    public Habitacion obtenerPorId(Long id) {
        return habitacionRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        habitacionRepository.deleteById(id);
    }
}
