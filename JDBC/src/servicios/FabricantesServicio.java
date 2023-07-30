/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import java.util.Scanner;
import persistencia.FabricantesDAO;

/**
 *
 * @author Usuario
 */
public class FabricantesServicio {
     FabricantesDAO DAOF = new FabricantesDAO();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void mostrarListaFabricantes() throws Exception{
        ArrayList<String> nombres = new ArrayList<String>();
        DAOF.mostrarFabricantes(nombres);
        for (String aux : nombres) {
            System.out.println(aux);
        }
    }
    
    public void ingresarFabricante() throws Exception{
        System.out.println("Lista de fabricantes: ");
        mostrarListaFabricantes();
        System.out.println("Ingrese el nuevo fabricante: ");
        String nombre = leer.next();
        int codigo = 0;
        codigo = DAOF.consultarCodigoF(codigo) + 1;
        String sql = "INSERT INTO fabricante VALUES(" + codigo + ", '" + nombre + "');";
        DAOF.ingresarFabricante(sql);
        System.out.println("Fabricante Ingresado!");
    }
}
