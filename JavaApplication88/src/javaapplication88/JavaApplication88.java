/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication88;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 

        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
    Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int column = sc.nextInt();

if (seats[row][column] == 0){
	System.out.print("free");
	
} else {System.out.print("sold");}

    }
    
}
