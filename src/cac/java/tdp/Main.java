/*
 * EJERCICIO 07: Programa Java quE:
 * declare una variable C de tipo entero y asígnale un valor.
 * A continuación muestra un mensaje indicando si el valor de C es positivo o negativo,
 * si es par o impar, si es múltiplo de 5,
 * si es múltiplo de 10
 * y si es mayor o menor que 100.
 * Consideraremos el 0 como positivo.
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 */
package cac.java.tdp;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int C = 9;
    if (C >=0){
    System.out.println("El numero es positvo");
    
    }
    else {
    System.err.println("el numero es negativo");
    
    } 

    
    if (C%2==0) {
    System.out.println("el numero es par");
    
   }
    else {
    System.out.println("el numero es impar");
    }
    
    
    if (C%5==0){
    System.out.println("el numero es multiplo de 5");
    }
    
    else {
        System.out.println("el numero no es multiplo de 5");
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}







