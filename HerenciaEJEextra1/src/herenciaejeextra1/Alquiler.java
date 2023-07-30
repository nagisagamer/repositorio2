/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejeextra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Usuario
 */
public class Alquiler {
    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion,
                    int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double calcularPrecio() {
        long numDiasOcupacion = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double modulo = barco.calcularModulo();
        return numDiasOcupacion * modulo;
    }
}

