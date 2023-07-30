/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcionesironman;

/**
 *
 * @author Usuario
 */
public class Armadura {
    // Atributos comunes a todas las armaduras
    protected String colorPrimario;
    protected String colorSecundario;
    protected int resistencia;
    protected int salud;
    protected int cargaReactor;
    protected int cargaMaximaReactor;
    protected int consumoBotas;
    protected int consumoGuantes;
    protected int consumoConsola;
    protected int consumoSintetizador;
    protected Generador generador;
    protected Consola consola;
    protected Sintetizador sintetizador;

    public Armadura(String colorPrimario, String colorSecundario, int resistencia) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;
        this.salud = 100;
        this.cargaReactor = 0;
        this.cargaMaximaReactor = 100;
        this.consumoBotas = 0;
        this.consumoGuantes = 0;
        this.consumoConsola = 0;
        this.consumoSintetizador = 0;
        this.generador = new Generador();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
    }

    // Getters y Setters
    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getCargaReactor() {
        return cargaReactor;
    }

    public void setCargaReactor(int cargaReactor) {
        this.cargaReactor = cargaReactor;
    }

    public int getCargaMaximaReactor() {
        return cargaMaximaReactor;
    }

    public void setCargaMaximaReactor(int cargaMaximaReactor) {
        this.cargaMaximaReactor = cargaMaximaReactor;
    }

    public int getConsumoBotas() {
        return consumoBotas;
    }

    public void setConsumoBotas(int consumoBotas) {
        this.consumoBotas = consumoBotas;
    }

    public int getConsumoGuantes() {
        return consumoGuantes;
    }

    public void setConsumoGuantes(int consumoGuantes) {
        this.consumoGuantes = consumoGuantes;
    }

    public int getConsumoConsola() {
        return consumoConsola;
    }

    public void setConsumoConsola(int consumoConsola) {
        this.consumoConsola = consumoConsola;
    }

    public int getConsumoSintetizador() {
        return consumoSintetizador;
    }

    public void setConsumoSintetizador(int consumoSintetizador) {
        this.consumoSintetizador = consumoSintetizador;
    }

    // Métodos para realizar acciones con la armadura
    public void caminar(int tiempo) {
        int consumo = consumoBotas * tiempo;
        if (consumo <= cargaReactor) {
            cargaReactor -= consumo;
            // Lógica para caminar
        } else {
            System.out.println("La carga del reactor es insuficiente para caminar durante ese tiempo.");
        }
    }

    public void correr(int tiempo) {
        int consumo = consumoBotas * 2 * tiempo;
        if (consumo <= cargaReactor) {
            cargaReactor -= consumo;
            // Lógica para correr
        } else {
            System.out.println("La carga del reactor es insuficiente para correr durante ese tiempo.");
        }
    }

    public void propulsar(int tiempo) {
        int consumo = consumoBotas * 3 * tiempo;
        if (consumo <= cargaReactor) {
            cargaReactor -= consumo;
            // Lógica para propulsarse
        } else {
            System.out.println("La carga del reactor es insuficiente para propulsarse durante ese tiempo.");
        }
    }

    public void volar(int tiempo) {
        int consumoBotas = this.consumoBotas * 3 * tiempo;
        int consumoGuantes = this.consumoGuantes * 2 * tiempo;
        if (consumoBotas <= cargaReactor && consumoGuantes <= cargaReactor) {
            cargaReactor -= consumoBotas + consumoGuantes;
            // Lógica para volar
        } else {
            System.out.println("La carga del reactor es insuficiente para volar durante ese tiempo.");
        }
    }

    public void usarGuantesComoArmas(int tiempo) {
        int consumo = consumoGuantes * 3 * tiempo;
        if (consumo <= cargaReactor) {
            cargaReactor -= consumo;
            // Lógica para usar los guantes como armas
        } else {
            System.out.println("La carga del reactor es insuficiente para utilizar los guantes como armas durante ese tiempo.");
        }
    }

    public void escribir(String mensaje) {
        int consumo = consumoConsola;
        if (consumo <= cargaReactor) {
            cargaReactor -= consumo;
            // Lógica para escribir en la consola
        } else {
            System.out.println("La carga del reactor es insuficiente para utilizar la consola.");
        }
    }

    public void leer() {
        int consumo = consumoConsola;
        if (consumo <= cargaReactor) {
            cargaReactor -= consumo;
            // Lógica para leer de la consola
        } else {
            System.out.println("La carga del reactor es insuficiente para utilizar la consola.");
        }
    }
}
