/*
 * Ejercicio 09:
 * Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
 */
package cac.java.tdp;

import java.util.Scanner;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner teclado = new Scanner (System.in);
String x;
System.out.println("QUIEN SOS ?");
x = teclado.nextLine();
System.out.println("HOLA "+ x);




    }
    
}
