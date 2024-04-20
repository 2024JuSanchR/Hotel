package com.examen.examen.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Pattern;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_identificacion", nullable = false)
    private String numero_identificacion;

    @Pattern(regexp = "[^0-9]*", message = "El campo no puede contener números")
    @Column(name = "nombres", nullable = false, length = 30 )
    private String nombres;

    @Pattern(regexp = "[^0-9]*", message = "El campo no puede contener números")
    @Column(name = "apellidos", nullable = false, length = 30 )
    private String apellidos;

    @Column(name = "numero_habitacion", nullable = false)
    private String numero_habitacion;
}
