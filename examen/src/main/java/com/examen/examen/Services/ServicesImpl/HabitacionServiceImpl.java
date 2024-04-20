package com.examen.examen.Services.ServicesImpl;

import com.examen.examen.Entities.Habitacion;
import com.examen.examen.Repositories.HabitacionRepository;
import com.examen.examen.Services.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionServiceImpl implements HabitacionService {

    @Autowired
    private HabitacionRepository repository;

    @Override
    public Habitacion crearHabitacion(Habitacion habitacion) {
        return  repository.save( habitacion);
    }

    @Override
    public List<Habitacion> getAllHabitaciones() {
        return repository.findAll();
    }

    @Override
    public Habitacion getHabitacionById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Habitacion no encontrada"));
    }

    @Override
    public void deleteHabitacion(Long id) {
            repository.deleteById(id);
    }
}
