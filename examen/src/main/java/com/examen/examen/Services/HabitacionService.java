package com.examen.examen.Services;

import com.examen.examen.Entities.Habitacion;

import java.util.List;

public interface HabitacionService {

    public Habitacion crearHabitacion(Habitacion habitacion);

    public List<Habitacion> getAllHabitaciones();

   public Habitacion getHabitacionById(Long id);

    public void deleteHabitacion(Long ind);
}
