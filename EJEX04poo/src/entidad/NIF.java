/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NIF {
    private long numeroDni;
    private char letra;

    public NIF(long numeroDni, char letra) {
        this.numeroDni = numeroDni;
        this.letra = letra;
    }

    public long getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(long numeroDni) {
        this.numeroDni = numeroDni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void crearNif() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de DNI: ");
        this.numeroDni = sc.nextLong();
        this.letra = calcularLetra(numeroDni);
    }

    private char calcularLetra(long numeroDni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = (int) (numeroDni % 23);
        return letras[resto];
    }

    public void mostrar() {
        System.out.println(String.format("%08d", this.numeroDni) + "-" + this.letra);
    }
}
