/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Trabajo Practico N°1 Unidad 6 Colecciones");
        List<Alumno> alumnos = new ArrayList<>();
            alumnos.add(new Alumno("PILAR",8));
            alumnos.add(new Alumno("MATI",9));
            alumnos.add(new Alumno("JULI",10));
            alumnos.add(new Alumno("PABLO",8));
            alumnos.add(new Alumno("ANDRES",7));
            
        for (Alumno a : alumnos) {
        System.out.println(a);
        }
    }
    
}
