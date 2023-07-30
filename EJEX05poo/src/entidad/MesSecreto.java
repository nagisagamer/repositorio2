/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class MesSecreto {
    private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = meses[9];

    public String getMesSecreto() {
        return mesSecreto;
    }

    public boolean adivinarMes(String mes) {
        if (mes.equalsIgnoreCase(mesSecreto)) {
            System.out.println("¡Ha acertado!");
            return true;
        } else {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            return false;
        }
    }
    
}
