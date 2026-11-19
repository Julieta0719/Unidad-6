/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_1;

/**
 *
 * @author Usuario
 */
public class Alumno {
    
    private String nombre;
    private double nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "----- ALUMNO -----" + "\n" 
                + "Nombre: " + nombre + " | "+ "Nota= " + nota ;
    }
    
}
