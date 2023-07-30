/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepcioneseje2;

/**
 *
 * @author Usuario
 */
public class exep {
 private int[] array;

    public exep() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public exep(int size) {
        array = new int[size];
    }

    public void setValue(int index, int value) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango: " + index);
        }
        array[index] = value;
    }

    public int getValue(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango: " + index);
        }
        return array[index];
    }
    }

