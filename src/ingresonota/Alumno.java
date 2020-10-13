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
        
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getParcialUno() {
        return parcialUno;
    }

    public void setParcialUno(double parcialUno) {
        this.parcialUno = parcialUno;
    }

    public double getParcialDos() {
        return parcialDos;
    }

    public void setParcialDos(double parcialDos) {
        this.parcialDos = parcialDos;
    }

    public double getZona() {
        return zona;
    }

    public void setZona(double zona) {
        this.zona = zona;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
    
    
}


