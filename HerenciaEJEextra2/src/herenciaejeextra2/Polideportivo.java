/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejeextra2;

/**
 *
 * @author Usuario
 */
   class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }
}