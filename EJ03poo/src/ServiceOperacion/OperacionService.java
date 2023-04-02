/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceOperacion;


import Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OperacionService {
    private static final Scanner sc = new Scanner(System.in);
    
    
    public Operacion crearOperacion (){
          Operacion op = new Operacion();
        System.out.println("ingrese el 2 numeros");
        op.setNum1(sc.nextInt());
        op.setNum2(sc.nextInt());
        return op;
      
 } 

    public int suma (Operacion op){
       return (op.getNum1()) + (op.getNum2());
       
        
    }
      
    public int resta (Operacion op){
        return (op.getNum1()) - (op.getNum2());
    }
    
    public int multiplicacion (Operacion op) {
        int multiplicacion = op.getNum1()* op.getNum2();
        if (multiplicacion == 0) {
            System.out.println("ERROR");
        }
        return multiplicacion;
    }
    
     public float division(Operacion op) {
        float division = 0 ;
        if (op.getNum2()== 0) {
            System.out.println("ERROR");
            
        }else {
            division = (float)op.getNum1()/op.getNum2();
        }
        return division; 
    }
}
