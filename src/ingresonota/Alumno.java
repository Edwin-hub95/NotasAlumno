/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresonota;

/**
 *
 * @author Nohemi Aguilar
 */
public class Alumno {
    int id;
    String nombre;
    double parcialUno;
    double parcialDos;
    double zona;
    double examenFinal;
    double total;

    public Alumno() {
    }

    public Alumno(int id, String nombre, double parcialUno, double parcialDos, double zona, double examenFinal ) {
        this.id = id;
        this.nombre = nombre;
        this.parcialUno = parcialUno;
        this.parcialDos = parcialDos;
        this.zona = zona;
        this.examenFinal = examenFinal;
        this.total = parcialUno+parcialDos+examenFinal+zona;
    }

    Alumno(int id, String nombre, double parcialUno, double parcialDos, double zona, double examenFinal, double total) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
}
