/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejeextra1;

/**
 *
 * @author Usuario
 */
public class Velero extends Barco {
   
    private int numeroMastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }
}


