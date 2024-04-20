package com.examen.examen.Controllers;

import com.examen.examen.Entities.Habitacion;
import com.examen.examen.Services.ServicesImpl.HabitacionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/")
public class HabitacionController {

    @Autowired
    private HabitacionServiceImpl service;

    @PostMapping
    public Habitacion crearHabitacion(@RequestBody Habitacion habitacion){
        return service.crearHabitacion(habitacion);
    }

    @GetMapping
    public List<Habitacion> obtenerHabitaciones(){
        return service.getAllHabitaciones();
    }

    @GetMapping("/{id}")
    public Habitacion obtenerHabitacionPorId(@PathVariable Long id){
        return service.getHabitacionById(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarHabitacion(@PathVariable Long id){
        service.deleteHabitacion(id);
    }
}


