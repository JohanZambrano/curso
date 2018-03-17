/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordenotas;
import java.util.Scanner;
/**
 * le solicita la cantidad de notas que desea ingresar
 * @author Johan Zambrano
 * @version java 1.8.0_161
 */
public class asignarNotas {
    public int asignarNotas(){
        int cant=0;
        Scanner leer=new Scanner(System.in);
        do{//verifica que el valor ingresado sea mayor que 0
            System.out.println("Cuantas notas desea ingresar");
            cant=leer.nextInt();
            if(cant<0){
                System.out.println("Ingrese una opcion valida");
            }
        }while(cant<0);
        return cant;        //retorna el valor que haya ingresado el usuario
    }
    
}
