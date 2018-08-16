/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author DAS
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double saldo_cliente=0;
    
        
        int opcion=0;
        //Permite leer la entrada por consola
        Scanner entrada= new Scanner (System.in);
        //se muestra el menu
        do{
        System.out.println("+++++++++++++++++++++"); 
        System.out.println("+++++Banco DAS+++++++");  
        System.out.println("+++++++++++++++++++++"); 
        System.out.println("Menu");
        System.out.println("0. Salir");
        System.out.println("1. Consultar");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        
        //Captura la entrada por consola, en este caso
        //lee un entero
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 0:
                //Salir de la aplicacion
                System.out.println("Hasta Luego");
                //Realiza la accion
                break;
                //Aqui termina el caso 0
                
            case 1:
                //Consultar saldo
                System.out.println("Tu Saldo es:" + saldo_cliente);
                //Realiza la accion
                break;
                //Aqui termina el caso 1
            case 2:
                //Depositar saldo
                System.out.println("Ingrese la cantidad a depositar:");
                double deposito= entrada.nextDouble();
                saldo_cliente = saldo_cliente + deposito;
                
                //Realiza la accion
                break;
                //Aqui termina el caso 2
            case 3:
                //Retirar saldo
                System.out.println("Ingrese la cantidad a retirar:");
                double retiro = entrada.nextDouble();
             
               if (saldo_cliente>=retiro){
                      saldo_cliente =saldo_cliente - retiro;
                   
               }else{
                   System.out.println("No es posible retirar");
                   System.out.println("Saldo insuficiente");
               }
                //Realiza la accion
                break;
                //Aqui termina el caso 3
            default:
                //si la opcion no cumple ninguna
                //de las condicones anteriores
                break;
                //Aqui termina default
        }
            //se ejecuta el do, hasta que la opcion sea 0
        }while(opcion !=0);
        
        //Se cierra la entrada por consula
        entrada.close();
        
        
    }
    
}
