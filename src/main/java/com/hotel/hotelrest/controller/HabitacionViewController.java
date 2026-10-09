package com.hotel.hotelrest.controller;

import com.hotel.hotelrest.model.Habitacion;
import com.hotel.hotelrest.service.HabitacionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/habitaciones")
public class HabitacionViewController {

    private final HabitacionService habitacionService;

    public HabitacionViewController(HabitacionService habitacionService) {
        this.habitacionService = habitacionService;
    }

    // Página principal - lista todas las habitaciones
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("habitaciones", habitacionService.listarTodos());
        return "habitaciones/index";
    }

    // Formulario para nueva habitación
    @GetMapping("/nueva")
    public String nueva(Model model) {
        model.addAttribute("habitacion", new Habitacion());
        return "habitaciones/formulario";
    }

    // Guardar habitación
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Habitacion habitacion) {
        habitacionService.guardar(habitacion);
        return "redirect:/habitaciones";
    }

    // Eliminar habitación
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        habitacionService.eliminar(id);
        return "redirect:/habitaciones";
    }
}
