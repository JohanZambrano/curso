/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordenotas;

/**
 * clase del docente, asigna el nombre del docente y el nombre de la materia
 * @author Johan Zambrano
 * @version java 1.8.0_161
 */
public class docentes extends principal{
        //Crea los objetos 
        principal obj1=new principal("Carolina");
        principal obj2=new principal("Alexander");
        principal obj3=new principal("Roberto");
        principal obj4=new principal("Sistemas", "Estructuras");
        principal obj5=new principal("Sistemas", "Arquitectura");
        principal obj6=new principal("Sistemas", "Programacion");
    void docentes(){
        //imprime los nombres de todos los docentes con su respectiva materia
        System.out.println("Docentes: \n1-"+obj1.principal()+"\t"+obj4.curso()+"\n2-"+obj2.principal()+"\t"+obj5.curso()+"\n3-"+obj3.principal()+"\t"+obj6.curso());
    }
    void m1(){//imprime el docente de la materia 1
        System.out.println("Docentes: \n1-"+obj1.principal()+"\t"+obj4.curso());
    }
    void m2(){//imprime el docente de la materia 2
        System.out.println("Docentes: \n1-"+obj2.principal()+"\t"+obj5.curso());
    }
    void m3(){//imprime el docente de la materia 3
        System.out.println("Docentes: \n1-"+obj3.principal()+"\t"+obj6.curso());
    }
}
