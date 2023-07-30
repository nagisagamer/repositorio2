/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman;

/**
 *
 * @author Usuario
 */
public class ArmaduraIronManRevisada extends MostrandoEstado {

    public ArmaduraIronManRevisada(String colorPrimario, String colorSecundario, int resistencia) {
        super(colorPrimario, colorSecundario, resistencia);
    }

// Método para revisar los dispositivos y realizar intentos de reparación insistente
    public void revisarDispositivos() {
        System.out.println("Revisando dispositivos...");
        
        if (generador.estaDanado()) {
            int intentos = 0;
            do {
                intentos++;
                System.out.println("Intento de reparación del generador número: " + intentos);
                
                if (intentos > 1) {
                    System.out.println("¡El generador sigue dañado!");
                }
                
                repararDanios(generador);
            } while (generador.estaDanado() && intentos <= 3);
            
            if (generador.estaDanado()) {
                System.out.println("¡El generador ha quedado destruido!");
            }
        }
        
        if (consola.estaDanado()) {
            int intentos = 0;
            do {
                intentos++;
                System.out.println("Intento de reparación de la consola número: " + intentos);
                
                if (intentos > 1) {
                    System.out.println("¡La consola sigue dañada!");
                }
                
                repararDanios(consola);
            } while (consola.estaDanado() && intentos <= 3);
            
            if (consola.estaDanado()) {
                System.out.println("¡La consola ha quedado destruida!");
            }
        }
        
        if (sintetizador.estaDanado()) {
            int intentos = 0;
            do {
                intentos++;
                System.out.println("Intento de reparación del sintetizador número: " + intentos);
                
                if (intentos > 1) {
                    System.out.println("¡El sintetizador sigue dañado!");
                }
                
                repararDanios(sintetizador);
            } while (sintetizador.estaDanado() && intentos <= 3);
            
            if (sintetizador.estaDanado()) {
                System.out.println("¡El sintetizador ha quedado destruido!");
            }
        }
    }
    
    // Método para reparar los daños en un dispositivo
    private void repararDanios(Dispositivo dispositivo) {
        if (Math.random() <= 0.4) {
            dispositivo.reparar();
            System.out.println("¡Reparación exitosa del dispositivo!");
        } else {
            dispositivo.setDanado(true);
            System.out.println("La reparación del dispositivo ha fallado.");
        }
    
}
}
