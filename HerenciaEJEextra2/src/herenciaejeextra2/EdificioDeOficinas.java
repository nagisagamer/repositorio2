/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejeextra2;

/**
 *
 * @author Usuario
 */
class EdificioDeOficinas extends Edificio{
    private int numOficinas;
    private int personasPorOficinas;
    private int numPisos;

    public EdificioDeOficinas(int numOficinas, int personasPorOficinas, int numPisos, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.numOficinas = numOficinas;
        this.personasPorOficinas = personasPorOficinas;
        this.numPisos = numPisos;
    }
    public int getNumOficinas() {
        return numOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficinas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public int cantPersonas() {
        return numOficinas * personasPorOficinas * numPisos;
    }
}

  