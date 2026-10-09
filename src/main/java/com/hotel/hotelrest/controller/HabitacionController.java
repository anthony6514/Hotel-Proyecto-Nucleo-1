package com.hotel.hotelrest.controller;

import com.hotel.hotelrest.model.Habitacion;
import com.hotel.hotelrest.service.HabitacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habitaciones")
public class HabitacionController {

    private final HabitacionService habitacionService;

    public HabitacionController(HabitacionService habitacionService) {
        this.habitacionService = habitacionService;
    }

    // GET /api/habitaciones
    @GetMapping
    public List<Habitacion> listar() {
        return habitacionService.listarTodos();
    }

    // GET /api/habitaciones/{id}
    @GetMapping("/{id}")
    public Habitacion buscar(@PathVariable Long id) {
        return habitacionService.obtenerPorId(id);
    }

    // POST /api/habitaciones
    @PostMapping
    public Habitacion guardar(@RequestBody Habitacion habitacion) {
        return habitacionService.guardar(habitacion);
    }

    // DELETE /api/habitaciones/{id}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        habitacionService.eliminar(id);
    }
}
