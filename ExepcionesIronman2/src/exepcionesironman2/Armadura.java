/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman2;

import exepcionesironman2.EnergiaInsuficienteException;

public class Armadura {
   
    private String colorPrimario;
    private String colorSecundario;
    private Propulsor botaIzquierda;
    private Propulsor botaDerecha;
    private Repulsor guanteIzquierdo;
    private Repulsor guanteDerecho;
    private int nivelResistencia;
    private int nivelSalud;
    private Generador generador;
    private Consola consola;
    private Sintetizador sintetizador;

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.generador = new Generador();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
        this.botaIzquierda = new Propulsor();
        this.botaDerecha = new Propulsor();
        this.guanteIzquierdo = new Repulsor();
        this.guanteDerecho = new Repulsor();
    }

    public void caminar(int tiempo) throws EnergiaInsuficienteException {
        int consumoEnergia = botaIzquierda.usar(Dispositivo.INTENSIDAD_BASICA, tiempo);
        try {
            generador.consumirEnergia(consumoEnergia);
        } catch (EnergiaInsuficienteException e) {
            System.out.println("No hay suficiente energía para realizar la acción.");
            throw e;
        }
    }

    public void correr(int tiempo) throws EnergiaInsuficienteException {
        int consumoEnergia = botaIzquierda.usar(Dispositivo.INTENSIDAD_NORMAL, tiempo * 2);
        try {
            generador.consumirEnergia(consumoEnergia);
        } catch (EnergiaInsuficienteException e) {
            System.out.println("No hay suficiente energía para realizar la acción.");
            throw e;
        }
    }

    public void propulsar(int tiempo) throws EnergiaInsuficienteException {
        int consumoEnergia = botaIzquierda.usar(Dispositivo.INTENSIDAD_INTENSIVA, tiempo * 3);
        try {
            generador.consumirEnergia(consumoEnergia);
        } catch (EnergiaInsuficienteException e) {
            System.out.println("No hay suficiente energía para realizar la acción.");
            throw e;
        }
    }

    public void volar(int tiempo) throws EnergiaInsuficienteException {
        int consumoBotas = botaIzquierda.usar(Dispositivo.INTENSIDAD_INTENSIVA, tiempo * 3);
        int consumoGuantes = guanteIzquierdo.usar(Dispositivo.INTENSIDAD_NORMAL, tiempo * 2);
        try {
            generador.consumirEnergia(consumoBotas + consumoGuantes);
        } catch (EnergiaInsuficienteException e) {
            System.out.println("No hay suficiente energía para realizar la acción.");
            throw e;
        }
    }

    public void usarGuanteComoArma(int tiempo) throws EnergiaInsuficienteException {
        int consumoEnergia = guanteIzquierdo.usar(Dispositivo.INTENSIDAD_NORMAL, tiempo * 3);
        try {
            generador.consumirEnergia(consumoEnergia);
        } catch (EnergiaInsuficienteException e) {
            System.out.println("No hay suficiente energía para realizar la acción.");
            throw e;
        }
    }

    public void escribirEnConsola(String mensaje) throws EnergiaInsuficienteException {
        int consumoEnergia = consola.usar(Dispositivo.INTENSIDAD_BASICA);
        try {
            generador.consumirEnergia(consumoEnergia);
            consola.escribirMensaje(mensaje);
        } catch (EnergiaInsuficienteException e) {
            System.out.println("No hay suficiente energía para realizar la acción.");
            throw e;
        }
    }

    public void hablarPorSintetizador(String mensaje) throws EnergiaInsuficienteException {
        int consumoEnergia = sintetizador.usar(Dispositivo.INTENSIDAD_BASICA);
        try {
            generador.consumirEnergia(consumoEnergia);
            sintetizador.hablar(mensaje);
        } catch (EnergiaInsuficienteException e) {
            System.out.println("No hay suficiente energía para realizar la acción.");
            throw e;
        }
    }
    
    public void calcularDistanciaEnemigos(ObjetoRadar[] objetos) {
        double distancia;
        for (ObjetoRadar objeto : objetos) {
            if (objeto.esHostil()) {
                distancia = Math.sqrt(Math.pow(objeto.getCoordenadaX(), 2) + Math.pow(objeto.getCoordenadaY(), 2) + Math.pow(objeto.getCoordenadaZ(), 2));
                System.out.println("Enemigo detectado a una distancia de: " + distancia + " unidades.");
            }
        }
    }
}
