/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4;

import Service.cineService;

/**
 *
 * @author Usuario
 */
public class Colecciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        cineService cs = new cineService();
        
        cs.insert();
        cs.peliMayor1Hora();
        cs.peliMayorMenor();
        cs.peliMenorMayor();
        cs.peliOrdenadaTitulo();
        cs.peliOrdenadaDirector();
    }
    
    }
    

