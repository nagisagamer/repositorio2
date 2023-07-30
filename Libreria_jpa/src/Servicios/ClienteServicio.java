/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import Persistencia.ClienteDao;
import java.util.Scanner;


public class ClienteServicio {
 
    private ClienteDao cd = new ClienteDao();

    public Cliente crearCliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cliente cliente = new Cliente();
        do {
            try {
                System.out.println("Ingrese el documento del cliente");
                int documento = leer.nextInt();
                Cliente cliente2 = cd.buscarCliente(documento);
                if(cliente2 != null){
                    System.out.println("Cliente ya registrado.");
                    return cliente2;
                }
                cliente.setId(documento);
                cliente.setDocumento(documento);
                break;
            } catch (Exception e) {
                System.out.println("Documento mal ingresado");
                leer.next();
            }
        } while (true);
        System.out.println("Ingrese el nombre del cliente");
        cliente.setNombre(leer.next());
        System.out.println("Ingrese el apellido del cliente");
        cliente.setApellido(leer.next());
        System.out.println("Ingrese el nro de teléfono del cliente");
        cliente.setTelefono(leer.next());
        cd.persistirCliente(cliente);
        return cliente;
    }
}
