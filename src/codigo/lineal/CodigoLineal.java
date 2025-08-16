/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo.lineal;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class CodigoLineal {
public static void main(String[] args) {
        // Crear un objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el primer número
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        // Solicitar el segundo número
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        // Calcular la suma
        int suma = numero1 + numero2;
        
        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        // Cerrar el scanner
        scanner.close();
    }
}
