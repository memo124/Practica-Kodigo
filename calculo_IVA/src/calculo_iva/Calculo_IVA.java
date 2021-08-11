/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_iva;
import java.util.Scanner;

/**
 *
 * @author miner
 */
public class Calculo_IVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double precio = 0,total = 0;
        String nombre;
        
        System.out.print("Ingrese el nombre del producto:\n");
        nombre = leer.nextLine();
        System.out.print("Ingrese el precio del producto:\n");
        precio = leer.nextDouble();
        total=precio*0.13;
        total= precio + total;
        System.out.print("El total a pagar es: "+total+"\n"+"Nombre del producto es: "+nombre);
    }
    
}
