/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejeextra1;

/**
 *
 * @author Usuario
 */
public class Yate extends Barco {
    private int potenciaCV;
    private int numeroCamarotes;

    public Yate(String matricula, double eslora, int anioFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numeroCamarotes;
    }
}

