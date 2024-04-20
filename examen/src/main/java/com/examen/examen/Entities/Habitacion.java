package com.examen.examen.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "habitacion")
public class Habitacion {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_habitacion", nullable = false)
    private String numero_habitacion;

    @Column(name = "piso", nullable = false)
    private String piso;

    @Column(name = "disponibilidad")
    private Boolean disponibilidad;

    @Column(name = "id_ubicacion", nullable = false)
    private String id_ubicacion;

    @Column(name = "valor_noche")
    private Double  valor_noche;


}
