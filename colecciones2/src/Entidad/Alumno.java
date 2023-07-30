/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
import java.util.List;

public class Alumno {

 
    
    
   
    private String nombre;
    private List<Integer> notas;
    
    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public double notaFinal() {
        double sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return sum / notas.size();
    }
}
