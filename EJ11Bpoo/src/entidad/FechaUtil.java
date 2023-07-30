/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class FechaUtil {

    public FechaUtil() {
    }
     public int diferenciaEnAnios(Date fecha1, Date fecha2) {
        // Calcular la diferencia en milisegundos entre las dos fechas
        long diferenciaEnMilisegundos = fecha2.getTime() - fecha1.getTime();
        // Calcular la diferencia en años
        int diferenciaEnAnios = (int) (diferenciaEnMilisegundos / (1000 * 60 * 60 * 24 * 365));
        return diferenciaEnAnios;
    }
    
}
