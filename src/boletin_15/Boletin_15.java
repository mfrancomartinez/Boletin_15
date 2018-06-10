/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_15;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Boletin_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        float probescrit;
        float probpract;
        float bol;
        String pregunta;
        
        do {
            System.out.print("Escribe a nota teorica ");
            probescrit = sc.nextFloat();
            
            System.out.print("Escribe a nota practica ");
            probpract = sc.nextFloat();
            
            System.out.print("Escribe o porcentaje de boletins ");
            bol = sc.nextFloat();
            
            Evaluacion ev = new Evaluacion(probescrit,probpract,bol);
            ev.calcularNota();
            
            System.out.print("¿Queres calcular otra nota?");
            pregunta = sc.next();
            
        } while (pregunta=="No");
        
    }
    }
    
