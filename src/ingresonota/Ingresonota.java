/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresonota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Edwin Alfonso Mejia Concogua 2000259
 */
public class Ingresonota {

    
   
       public static int id;
   public static String nombre;
   public static double parcialUno;
   public static double parcialDos;
   public static double zona;
   public static double examenFinal;
   public static double total;
   public static  List<Alumno> ListAlumno=new ArrayList();
   public static Scanner leer=new Scanner(System.in);
    
     
     
    public static void main(String[] args) {
     
       
   
    int opcion;
    
    do{
         System.out.println("menu");
         System.out.println("opcion 1 agregar alumno");
         System.out.println("opcion 2 ver datos");
         System.out.println("opcion 3 cambiar datos");
         System.out.println("opcion 4 salir");
         opcion=leer.nextInt();
         
         switch(opcion){
             case 1:
                 ingresodedatos(); 
                 
                 break;
             case 2:
                 mostrardatos();
                 break;
             case 3:
                 
                 modificardatos();
                 
                 break;
                 
                 
            
         }
    
    }while(4 !=opcion);
    
}
    public static void mostrardatos(){
        
        System.out.println("los datos son");
                 System.out.println("numero de alumno \t Nombre.A \t N.carne \t parcialUno \t parcialDos \t zona \t examenFinal \t total");
                 int posicion = 0; 
                 for (Alumno alumno : ListAlumno) {
                     System.out.println(posicion+"\t"+alumno.getId()+"\t"+alumno.getNombre()+"\t"+alumno.getParcialUno()+"\t"+alumno.getParcialDos()+"\t"+alumno.getZona()+"\t"+alumno.getExamenFinal()+"\t"+alumno.getTotal());
                    posicion++; 
                    
                 }
    }
    public static void ingresodedatos( ){
        System.out.println("ingrese su id");
                 id=leer.nextInt();
                 System.out.println("ingrese su nombre");
                 nombre=leer.next();
                 System.out.println("ingrese parcialUno");
                 parcialUno=leer.nextDouble();
                 System.out.println("ingrese parcialDos");
                 parcialDos=leer.nextDouble();
                 System.out.println("ingrese zona");
                 zona=leer.nextDouble();
                 System.out.println("ingrese examenFinal");
                 examenFinal=leer.nextDouble();
                 
                 ListAlumno.add(new Alumno(id,nombre,parcialUno,parcialDos,zona,examenFinal));
                 
    } 
    }
    

