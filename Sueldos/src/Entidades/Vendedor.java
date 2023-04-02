/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
//un atributo tipo date para calcular
//antiguedad y vacaciones
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Vendedor {
    private String nombre;
    private Integer dni;
    private Double SueldoBasico;
    private Double comisiones;
    private Double sueldomensual;
    private Date fechaInicio;
    
    //constructores
    //constructor vacio
    public Vendedor() {
    }

   //contructor por parametros
   public Vendedor(String nombre, Integer dni, Double SueldoBasico, Double comisiones, Double sueldomensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.SueldoBasico = SueldoBasico;
        this.comisiones = comisiones;
        this.sueldomensual = sueldomensual;
        this.fechaInicio = fechaInicio;
    } 
   //getter

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public Double getSueldoBasico() {
        return SueldoBasico;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public Double getSueldomensual() {
        return sueldomensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
   
    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setSueldoBasico(Double SueldoBasico) {
        this.SueldoBasico = SueldoBasico;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public void setSueldomensual(Double sueldomensual) {
        this.sueldomensual = sueldomensual;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    //el metodo toString se utiliza para retornar una
    //impresion de todos los objetos detallados
    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", SueldoBasico=" + SueldoBasico + ", comisiones=" + comisiones + ", sueldomensual=" + sueldomensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
           
}
