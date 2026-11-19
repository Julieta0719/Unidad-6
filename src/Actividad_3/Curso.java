/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_3;

/**
 *
 * @author Usuario
 */
public class Curso {
    
    private String nombre;
    private String docente;

    public Curso(String nombre, String docente) {
        this.nombre = nombre;
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "-----Curso-----" + "\n"
               +"Nombre:" + nombre + " | "+"Docente:" + docente;
    }
    
}
