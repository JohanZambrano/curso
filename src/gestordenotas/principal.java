/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordenotas;
import java.util.Scanner;
/**
 * programa que calcula el promedio de 10 alumnos en sus respectivas materias del curso, en este caso son tres materias
 * @author Johan Zambrano
 * @version java 1.8.0_161
 */
public class principal {
    private String curso;   //guarda el nombre del curso
    private String materia;     //guarda el nombre de la materia
    private String nombre;      //guarda el nombre tanto del docente como del estudiante
    private int cant;   //guarda la cantidad de notas que se le va asignar
    private int[ ]   docentes = new  int[10];   //arreglo para utilizar los datos de la clase docentes, y alumnos   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int opcion,ma; //variables para los menus
        int c1=0,c2=0,c3=0,cant=0; //contadores
        double notas1[][],notas2[][],notas3[][];    //crea los arreglos para guardar las notas de cada materia
        double notas1F[],notas2F[],notas3F[];       //crea los arreglos para guardar las notas finales de cada estudiante en cada materia
        notas1F=new double [10]; //inicializa los arrelos en 10 que son la cantidad total de los estudiantes, guarda la nota final
        notas2F=new double [10];
        notas3F=new double [10];
        notas1=new double[10][cant];    //inicializa los arrelo en 10 y en la cantidad de notas que el usuario desee
        notas2=new double[10][cant];
        notas3=new double[10][cant];
        do{
        System.out.println("\n\n\tMENU PRINCIPAL");
        System.out.println("1-Docentes");
        System.out.println("2-Estudiantes");
        System.out.println("3-Asignar notas");
        System.out.println("4-Mostrar listado de alumnos por materia con sus respectivas notas");
        System.out.println("5-Mejores promedios");
        System.out.println("6-Salir");
        opcion=leer.nextInt();
        principal[] arreglo= {new docentes(), new alumnos()};   //arreglo que contiene las otras clase, docentes, alumnos
        docentes maestro=(docentes) arreglo[0]; //creo la variable maestro tipo docente en la posicion 0 del arreglo principal
        alumnos estudiantes=(alumnos) arreglo[1];   //creo la variable estudiantes tipo docente en la posicion 1 del arreglo principal
        switch(opcion){
            case 1:
                maestro.docentes();     //llama funcion tipo void de la clase docentes
            break;    
            case 2:
                estudiantes.alumnos();      //llama funcion tipo void de la clase alumnos
            break;    
            case 3:
                int op,nota;
                double acum=0;  //acumulador para sacar el promedio final
                do{
                    do{
                        System.out.println("Desea asignar la nota a: \n1-los estudiantes \n2-Una materia en especifica");
                        op=leer.nextInt();
                    }while(op<1 || op>2);
                    asignarNotas obj1=new asignarNotas();   //Crea el obj1 de la clase asignarNotas
                    cant=obj1.asignarNotas();
                    //la opcion 1 significa que se le va asignar la misma cantidad de notas a todas las materias
                    if(op==1){
                        c1=1;   //guarda el valor de 1 lo que indica que a la primera materia ya se le asigno las notas
                        c2=1;  //guarda el valor de 1 lo que indica que a la segunda materia ya se le asigno las notas
                        c3=1;   //guarda el valor de 1 lo que indica que a la tercera materia ya se le asigno las notas
                        maestro.docentes(); //llama funcion tipo void de la clase docentes
                        estudiantes.alumnos();  //llama funcion tipo void de la clase alumnos
                        notas1=new double[10][cant];    
                        System.out.println("Primera materia\n");
                        for(int x=0;x<10;x++){
                                acum=0;
                                System.out.println("Ingrese las nota del estudiante  "+(x+1)+"\n");
                                for(int y=0;y<cant;y++){
                                    do{//verifica que la nota este entre el rango establecido
                                        System.out.println("Nota "+(y+1));
                                        nota=leer.nextInt();
                                        if(nota<0 || nota>5){
                                            System.out.println("ERROR, el rango de notas va desde 0 a 5");
                                        }
                                    }while(nota<0 || nota>5);
                                    notas1[x][y]=nota;//guarda la nota en la posicion del arreglo
                                    acum=acum+nota;//va acumulando las notas que ingreso
                                }
                                acum=acum/cant; //divide lo que acumulo por la cantidad de notas
                                notas1F[x]=acum;//guarda el valor de la variable acum en el arreglo de nota final en el estudiante de la posicion x
                            }
                        notas2=new double[10][cant];
                        System.out.println("Segunda materia\n");
                        for(int x=0;x<10;x++){
                                acum=0;
                                System.out.println("Ingrese las nota del estudiante  "+(x+1)+"\n");
                                for(int y=0;y<cant;y++){
                                    do{//verifica que la nota este entre el rango establecido
                                        System.out.println("Nota "+(y+1));
                                        nota=leer.nextInt();
                                        if(nota<0 || nota>5){
                                            System.out.println("ERROR, el rango de notas va desde 0 a 5");
                                        }
                                    }while(nota<0 || nota>5);
                                    notas2[x][y]=nota;//guarda la nota en la posicion del arreglo
                                    acum=acum+nota;//va acumulando las notas que ingreso
                                }
                                acum=acum/cant;//divide lo que acumulo por la cantidad de notas
                                notas2F[x]=acum;//guarda el valor de la variable acum en el arreglo de nota final en el estudiante de la posicion x
                        }
                        notas3=new double[10][cant];
                        System.out.println("Tercera materia\n");
                        for(int x=0;x<10;x++){
                            acum=0;
                                System.out.println("Ingrese las nota del estudiante  "+(x+1)+"\n");
                                for(int y=0;y<cant;y++){
                                    do{//verifica que la nota este entre el rango establecido
                                        System.out.println("Nota "+(y+1));
                                        nota=leer.nextInt();
                                        if(nota<0 || nota>5){
                                            System.out.println("ERROR, el rango de notas va desde 0 a 5");
                                        }
                                    }while(nota<0 || nota>5);
                                    notas3[x][y]=nota;//guarda la nota en la posicion del arreglo
                                    acum=acum+nota;//va acumulando las notas que ingreso
                                }
                                acum=acum/cant;//divide lo que acumulo por la cantidad de notas
                                notas3F[x]=acum;//guarda el valor de la variable acum en el arreglo de nota final en el estudiante de la posicion x
                            }
                        
                    }else{
                        do{
                            System.out.println("Seleccione la materia: ");
                            maestro.docentes();
                            ma=leer.nextInt();
                        }while(ma<1 || ma>3);
                        if(ma==1){
                            c1=1;
                            notas1=new double[10][cant];
                            estudiantes.alumnos();
                            for(int x=0;x<10;x++){
                                acum=0;
                                System.out.println("Ingrese las nota del estudiante  "+(x+1)+"\n");
                                for(int y=0;y<cant;y++){
                                    do{//verifica que la nota este entre el rango establecido
                                        System.out.println("Nota "+(y+1));
                                        nota=leer.nextInt();
                                        if(nota<0 || nota>5){
                                            System.out.println("ERROR, el rango de notas va desde 0 a 5");
                                        }
                                    }while(nota<0 || nota>5);
                                    notas1[x][y]=nota;//guarda la nota en la posicion del arreglo
                                    acum=acum+nota;//va acumulando las notas que ingreso
                                }
                                acum=acum/cant;//divide lo que acumulo por la cantidad de notas
                                notas1F[x]=acum;//guarda el valor de la variable acum en el arreglo de nota final en el estudiante de la posicion x
                            }
                        }else{
                            if(ma==2){
                               c2=1;
                               notas2=new double[10][cant];
                               estudiantes.alumnos();
                                for(int x=0;x<10;x++){
                                    acum=0;
                                    System.out.println("Ingrese las nota del estudiante  "+(x+1)+"\n");
                                    for(int y=0;y<cant;y++){
                                        do{//verifica que la nota este entre el rango establecido
                                        System.out.println("Nota "+(y+1));
                                        nota=leer.nextInt();
                                        if(nota<0 || nota>5){
                                            System.out.println("ERROR, el rango de notas va desde 0 a 5");
                                        }
                                    }while(nota<0 || nota>5);
                                        notas2[x][y]=nota;//guarda la nota en la posicion del arreglo
                                        acum=acum+nota;//va acumulando las notas que ingreso
                                }
                                acum=acum/cant;//divide lo que acumulo por la cantidad de notas
                                notas2F[x]=acum;//guarda el valor de la variable acum en el arreglo de nota final en el estudiante de la posicion x
                                }
                            }else{
                                c3=1;
                                notas3=new double[10][cant];    
                                estudiantes.alumnos();
                                for(int x=0;x<10;x++){
                                    acum=0;
                                    System.out.println("Ingrese las nota del estudiante # "+(x+1)+"\n");
                                    for(int y=0;y<cant;y++){
                                        do{//verifica que la nota este entre el rango establecido
                                        System.out.println("Nota "+(y+1));
                                        nota=leer.nextInt();
                                        if(nota<0 || nota>5){
                                            System.out.println("ERROR, el rango de notas va desde 0 a 5");
                                        }
                                    }while(nota<0 || nota>5);
                                        notas3[x][y]=nota;//guarda la nota en la posicion del arreglo
                                        acum=acum+nota;//va acumulando las notas que ingreso
                                    }
                                    acum=acum/cant;//divide lo que acumulo por la cantidad de notas
                                    notas3F[x]=acum;//guarda el valor de la variable acum en el arreglo de nota final en el estudiante de la posicion x
                                }
                            }
                        }
                    }
                    if(c1==0 || c2==0 || c3==0){ //verifica si alguna materia se quedo sin notas asignadas
                        System.out.println("Alguna de las materias no se le ha asignado notas\nNo puede salir hasta asignarle notas a todos las materias");
                    }
                }while(c1==0 || c2==0 || c3==0);//verifica si alguna materia se quedo sin notas asignadas y se repite hasta que todas se hayan registrado
                System.out.println("\n\n");
            break;    
            case 4:
                if(c1!=1 || c2!=1 || c3!=1){
                    System.out.println("Para poder visualizar las notas primero debe asignarlas");
                }else{
                    //imprime la primera materia con cada estudiante y sus respectvias notas
                    maestro.m1();                    
                    for(int x=0;x<10;x++){
                        //imprimer el nombre del estudiante correspondiente a la posicion del for
                        if(x==0){estudiantes.e1();}else{
                            if(x==1){estudiantes.e2();}else{
                                if(x==2){estudiantes.e3();}else{
                                    if(x==3){estudiantes.e4();}else{
                                        if(x==4){estudiantes.e5();}else{
                                            if(x==5){estudiantes.e6();}else{
                                                if(x==6){estudiantes.e7(); }else{
                                                    if(x==7){estudiantes.e8();}else{
                                                        if(x==8){estudiantes.e9();}else{
                                                            if(x==9){estudiantes.e10();
                                                        }       
                                                    }
                                                }
                                            }
                                        }   
                                    }
                                }
                            }
                            }
                        }
                        //imprime las notas del respectivo estudiante
                        for(int y=0;y<cant;y++){
                            System.out.println(" - "+notas1[x][y]);
                        }
                        //imprime la nota final
                        System.out.println("Nota final =  "+notas1F[x]);
                    }
                    //imprime la segunda materia con cada estudiante y sus respectvias notas
                    maestro.m2();                    
                    for(int x=0;x<10;x++){
                        //imprimer el nombre del estudiante correspondiente a la posicion del for
                        if(x==0){estudiantes.e1();}else{
                            if(x==1){estudiantes.e2();}else{
                                if(x==2){estudiantes.e3();}else{
                                    if(x==3){estudiantes.e4();}else{
                                        if(x==4){estudiantes.e5();}else{
                                            if(x==5){estudiantes.e6();}else{
                                                if(x==6){estudiantes.e7(); }else{
                                                    if(x==7){estudiantes.e8();}else{
                                                        if(x==8){estudiantes.e9();}else{
                                                            if(x==9){estudiantes.e10();
                                                        }       
                                                    }
                                                }
                                            }
                                        }   
                                    }
                                }
                            }
                            }
                        }
                        //imprime las notas del respectivo estudiante
                        for(int y=0;y<cant;y++){
                            System.out.println(" - "+notas2[x][y]);
                        }
                        //imprime la nota final
                        System.out.println("Nota final =  "+notas2F[x]);
                    }
                
                    //imprime la tercera materia con cada estudiante y sus respectvias notas
                    maestro.m3();                    
                    for(int x=0;x<10;x++){
                        //imprimer el nombre del estudiante correspondiente a la posicion del for
                        if(x==0){estudiantes.e1();}else{
                            if(x==1){estudiantes.e2();}else{
                                if(x==2){estudiantes.e3();}else{
                                    if(x==3){estudiantes.e4();}else{
                                        if(x==4){estudiantes.e5();}else{
                                            if(x==5){estudiantes.e6();}else{
                                                if(x==6){estudiantes.e7(); }else{
                                                    if(x==7){estudiantes.e8();}else{
                                                        if(x==8){estudiantes.e9();}else{
                                                            if(x==9){estudiantes.e10();
                                                        }       
                                                    }
                                                }
                                            }
                                        }   
                                    }
                                }
                            }
                            }
                        }
                        //imprime las notas del respectivo estudiante
                        for(int y=0;y<cant;y++){
                            System.out.println(" - "+notas3[x][y]);
                        }
                        //imprime la nota final
                        System.out.println("Nota final =  "+notas3F[x]);
                    }                
                }
            break;    
            case 5:
                double may=0,men=0,aux1=0,aux2=0,aux3=0; //inicializa todas en 0 para poder organizarlas
                if(c1!=1 || c2!=1 || c3!=1){
                    System.out.println("Para poder visualizar los promedios primero debe asignar las notas");
                }else{
                    for(int x=0;x<10;x++){
                        if(x==0){   //el primer valor en x 
                            may=notas1F[x]; //le asigna el primer valor a la variable may
                        }
                        if(notas1F[x]>may){   
                            men=aux3;               
                            aux3=aux2;              
                            aux2=aux1;              
                            aux1=may;               
                            may=notas1F[x];         
                        }else{
                            if(notas1F[x]>aux1){      
                                men=aux3;               
                                aux3=aux2;              
                                aux2=aux1;              
                                aux1=notas1F[x];
                            }else{
                                if(notas1F[x]>aux2){    
                                men=aux3;                   
                                aux3=aux2;                  
                                aux2=notas1F[x];            
                                }else{
                                    if(notas1F[x]>aux3){    
                                        men=aux3;
                                        aux3=notas1F[x];
                                    }else{
                                        if(notas1F[x]>men){
                                           men=notas1F[x];
                                        }
                                    }
                                }
                            }
                        }
                    }   
                    System.out.println("Estos son los mejores promedios de la materia: ");
                    maestro.m1();
                    System.out.println("1 - "+may+"\n2 - "+aux1+"\n3 - "+aux2+"\n4 - "+aux3+"\n5 - "+men);
                    may=0;men=0;aux1=0;aux2=0;aux3=0;
                    for(int x=0;x<10;x++){
                        if(x==0){   
                            may=notas2F[x];
                        }
                        if(notas2F[x]>may){   
                            men=aux3;               
                            aux3=aux2;              
                            aux2=aux1;              
                            aux1=may;               
                            may=notas2F[x];         
                        }else{
                            if(notas2F[x]>aux1){      
                                men=aux3;               
                                aux3=aux2;              
                                aux2=aux1;              
                                aux1=notas2F[x];
                            }else{
                                if(notas2F[x]>aux2){    
                                men=aux3;                   
                                aux3=aux2;                  
                                aux2=notas2F[x];            
                                }else{
                                    if(notas2F[x]>aux3){    
                                        men=aux3;
                                        aux3=notas2F[x];
                                    }else{
                                        if(notas2F[x]>men){
                                           men=notas2F[x];
                                        }
                                    }
                                }
                            }
                        }
                    }   
                    System.out.println("Estos son los mejores promedios de la materia: ");
                    maestro.m2();
                    System.out.println("1 - "+may+"\n2 - "+aux1+"\n3 - "+aux2+"\n4 - "+aux3+"\n5 - "+men);
                    may=0;men=0;aux1=0;aux2=0;aux3=0;
                    for(int x=0;x<10;x++){
                        if(x==0){   
                            may=notas3F[x];
                        }
                        if(notas3F[x]>may){   
                            men=aux3;               
                            aux3=aux2;              
                            aux2=aux1;              
                            aux1=may;               
                            may=notas3F[x];         
                        }else{
                            if(notas3F[x]>aux1){      
                                men=aux3;               
                                aux3=aux2;              
                                aux2=aux1;              
                                aux1=notas3F[x];
                            }else{
                                if(notas3F[x]>aux2){    
                                men=aux3;                   
                                aux3=aux2;                  
                                aux2=notas3F[x];            
                                }else{
                                    if(notas3F[x]>aux3){    
                                        men=aux3;
                                        aux3=notas3F[x];
                                    }else{
                                        if(notas3F[x]>men){
                                           men=notas3F[x];
                                        }
                                    }
                                }
                            }
                        }
                    }   
                    System.out.println("Estos son los mejores promedios de la materia: ");
                    maestro.m3();                                        
                    System.out.println("1 - "+may+"\n2 - "+aux1+"\n3 - "+aux2+"\n4 - "+aux3+"\n5 - "+men);
                }
            break;    
        }//switch
        }while(opcion!=6);
    }
    public principal(){
    }
    principal(String nombre1){
        this.nombre=nombre1;
    }
    principal(String curso, String materia){
        this.curso=curso;
        this.materia=materia;
    }
    
    public void setCant(int cant){
        this.cant=cant;
    }
    public int getCant(){
        return this.cant;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
    public String getCurso(){
        return this.curso;
    }
    public void getMateria(String materia){
        this.materia=materia;
    }
    public String setMateria(String materia){
        return this.materia;
    }
    public void setNombre(String nombre1){
        this.nombre=nombre1;
    }
    public String getNombre(){
        return this.nombre;
    }
    protected String principal(){
        String nombre="Nombre: "+this.nombre;
        return nombre;
    }
    protected String curso(){
        String nombre="Curso: "+this.curso;
        nombre+="\t\tMateria: "+this.materia;
        return nombre;
    }
}  