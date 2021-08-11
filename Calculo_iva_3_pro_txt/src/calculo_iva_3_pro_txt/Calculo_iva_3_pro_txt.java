/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_iva_3_pro_txt;

import java.util.HashMap;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author miner
 */
public class Calculo_iva_3_pro_txt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        double[] total = new double[3];
        double[] precio = new double[3];
        String[] nombre = new String[3];
        
        for(int i=0;i<nombre.length;i++){
            System.out.print("Ingrese el nombre del producto:#"+i+"\n");
            nombre[i]= leer.nextLine();
            
        }
        for(int o=0;o<nombre.length;o++){
            System.out.print("Ingrese el precio del producto:#"+o+"\n");
            precio[o] = leer.nextDouble();
            total[o]=precio[o]*0.13;
            total[o]= precio[o] + total[o];          
        }
        FileWriter texto = new FileWriter("C:/Users/miner/Escritorio/prueba.txt");
        for(int i=0;i<nombre.length;i++){
            texto.write(nombre[i]+"|"+total[i]+"\n");
        }
        texto.close();
        System.out.print("Se ingresaron los registros!");
    }
    
}
