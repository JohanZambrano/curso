/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordenotas;

/**
 * clase de alumnos, crea los objetos con los nombres de los 10 alumnos
 *@author Johan Zambrano
 * @version java 1.8.0_161
 */
public class alumnos extends principal{
    principal obj1=new principal("Andres");
        principal obj2=new principal("Andrea");
        principal obj3=new principal("Carlos");
        principal obj4=new principal("Diego");
        principal obj5=new principal("Fernanda");
        principal obj6=new principal("Heidy");
        principal obj7=new principal("Jaime");
        principal obj8=new principal("Luisa");
        principal obj9=new principal("Mario");
        principal obj10=new principal("Patricia");
    void alumnos(){
        System.out.println("Estudiantes: \n1-"+obj1.principal()+"\n2-"+obj2.principal()+"\n3-"+obj3.principal()+"\n4-"+obj4.principal()+"\n5-"+obj5.principal()+"\n6-"+obj6.principal()+"\n7-"+obj7.principal()+"\n8-"+obj8.principal()+"\n9-"+obj9.principal()+"\n10-"+obj10.principal());       
    }
    void e1(){//imprime el estudiante 1
        System.out.println("Estudiantes: \n1-"+obj1.principal());
    }
    void e2(){//imprime el estudiante 2
        System.out.println("Estudiantes: \n1-"+obj2.principal());
    }
    void e3(){//imprime el estudiante 3
        System.out.println("Estudiantes: \n1-"+obj3.principal());
    }
    void e4(){//imprime el estudiante 4
        System.out.println("Estudiantes: \n1-"+obj4.principal());
    }
    void e5(){//imprime el estudiante 5
        System.out.println("Estudiantes: \n1-"+obj5.principal());
    }
    void e6(){//imprime el estudiante 6
        System.out.println("Estudiantes: \n1-"+obj6.principal());
    }
    void e7(){//imprime el estudiante 7
        System.out.println("Estudiantes: \n1-"+obj7.principal());
    }
    void e8(){//imprime el estudiante 8
        System.out.println("Estudiantes: \n1-"+obj8.principal());
    }
    void e9(){//imprime el estudiante 9
        System.out.println("Estudiantes: \n1-"+obj9.principal());
    }
    void e10(){//imprime el estudiante 10
        System.out.println("Estudiantes: \n1-"+obj10.principal());
    }
}
