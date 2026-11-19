/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Main {public static void main(String[] args) {
    
        Map<String, Curso> cursos = new HashMap<>();
        cursos.put("PROG3", new Curso("Programación III", "Prof.Magni"));
        cursos.put("BD1", new Curso("Base de Datos I", "Prof.Yacomo"));
        cursos.put("MET1", new Curso("Metodologia I", "Prof.Bertoldo"));

        
        System.out.println("Busqueda de curso en especifico");
        System.out.println("Curso PROG3: " + cursos.get("PROG3"));
        System.out.println("Curso ABC: " + cursos.get("ABC"));

        
        System.out.println("Recorre cursos");
        for (Map.Entry<String, Curso> entrada : cursos.entrySet()) {
            System.out.println(entrada.getKey() + "→" + entrada.getValue());
        }
        
        
    }
    
}
