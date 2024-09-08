/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioestructuracondicionales;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class EjercicioEstructuraCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ******   ***   Ejercicio1   ***   ******
        
        /*
        Según la edad de una persona mostraremos los siguientes mensajes:
        *-  Menos de 12 años: "eres un niño"
        *.- Entre 12 de 17 años: "eres un adolescente"
        *.- Entre 18 y 39 años: "eres joven" 
        *.- Entre 40 y 70: "eres maduro"
        *.- 71 para arriba: "eres anciano"
        */
        
        System.out.println("\n***   Ejercicio 1   ***");
        System.out.print("Por favor ingrese su edad: ");
        
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();        
        
            if (edad < 12) System.out.println("Eres un niño/a!");
            if (edad >= 12 && edad < 18) System.out.println("Eres un Adolescente!");
            if (edad >= 18 && edad < 40) System.out.println("Eres Joven!");
            if (edad >= 40 && edad < 71) System.out.println("Eres Maduro/a!");
            if (edad >= 71) System.out.println("Eres Anciano/a!");
            
        
        // *******   ***   Ejercicio 2:  ***   ******
        
        /*
        Dada la siguiente tabla del tiempo, hacer un programa que indique qué puede hacer una
        persona con dicho pronóstico:
        
        Temperatura     Tiempo      Sugerencia
        > 25°           Soleado     Caminar y tomar sol
        > 15° y <=25°   Soleado     Caminar
        <=15°           Soleado     Caminar con campera
        <10°            Lluvia      Quedarse en casa o salir con paraguas y campera
        <10°            Nieve       Esquiar
        
        Luego pedirle al usuario que ingrese una temperatura y una condición
        del tiempo válida (Soleado, lluvia o nieve) e indicarle la sugerencia.
        */        
        
        System.out.println("\n***   Ejercicio 2   ***");
        System.out.print("Por favor ingrese la temperatura: ");
        
        Scanner keyboard = new Scanner(System.in);
        int temperatura = keyboard.nextInt();  
        
        String clima = "Soleado";
        String clima1 = "Lluvioso";
        String clima2 = "Nevando";
                
            if (temperatura > 25) System.out.println("El tiempo/clima esta: " + clima + "\nSugerencia: Caminar y tomar Sol");
            if (temperatura > 15 && temperatura <= 25) System.out.println("El tiempo/clima esta: " + clima + "\nSugerencia: Caminar");
            if (temperatura <= 15 && temperatura >= 10) System.out.println("El tiempo/clima esta: " + clima + "\nSugerencia: Caminar con Campera");
            if (temperatura < 10) System.out.println("El tiempo/clima esta: " + clima1 + "\nSugerencia: Quedarse en casa o salir con paraguas y campera");
            if (temperatura < 0) System.out.println("El tiempo/clima esta: " + clima2 + "\nSugerencia: Esquiar");
            System.out.println("");    
        
                
        // *******   ***   Ejercicio 3   ***   ******
        
        /*
        Solicitar al usuario que ingrese 3 números. 2 positivos y 1 negativo (en cualquier orden).
        Luego, informar por pantalla la multiplicación de los números que son positivos
        */
        
        System.out.println("\n***   Ejercicio 3   ***");
        System.out.println("Por favor ingrese 3 numeros 2 positivos y 1 negativo (en cualquier orden)");
        
        System.out.print("\nIngrese el pirmer numero: ");        
        Scanner keyboardNum1 = new Scanner(System.in);
        int numero1 = keyboardNum1.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        Scanner keyboardNum2 = new Scanner(System.in);
        int numero2 = keyboardNum2.nextInt();
        
        System.out.print("Ingrese el tercer numero: ");
        Scanner keyboardNum3 = new Scanner(System.in);
        int numero3 = keyboardNum3.nextInt();
        
            if(numero1 < 0 && numero2 >= 1 && numero3 >= 1){
                int result = numero2 * numero3;                
                System.out.println("\nEl resultado de la MULTIPLICACION de los números positivos es: " + result);
                
            }else if(numero1 >= 1 && numero2 < 0 && numero3 >= 1){
                int result1 =  numero1 * numero3;
                System.out.println("\nEl resultado de la MULTIPLICACION de los números postivos es: " + result1);
            }else{
                int result2 = numero1 * numero2;
                System.out.println("\nEl resultado de la MULTIPLICACION de los números postivos es: " + result2);             }            
            System.out.println("");
    }
    
}
