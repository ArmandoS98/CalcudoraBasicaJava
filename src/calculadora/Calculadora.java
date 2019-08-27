/**
 * Desarrollado por: Armando Santos
 * 26.08.2019-20:38
 * Version 1.0
 * 
 * Problema No.1
 * Escriba un programa que permita al usuario, ingresar dos valores y mostrar un menú con las 4 operaciones
 * básicas, al seleccionar la operación debe mostrar el resultado del procesamiento de los valores
 * previamente ingresados
 * 
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author asantos
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String operacion;
        String numermosEnteros = "[+/*-]";
        String operadores = "[^+-/*,..]";
        String digits;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dato correcto a ingresar [85 * 3] o [2 + 3] etc");
        System.out.print("Ingrese la operacion a realizar -> ");
        operacion = input.nextLine();
        
        digits = operacion.replaceAll(operadores, "");
        String[] tokens = operacion.split(numermosEnteros);
        
        if (digits.length() != 1)
            System.out.println(operacion + " = " +  operacion(tokens[0].trim(),tokens[1].trim(),digits.substring(1,2)));
        else
            System.out.println(operacion + " = " +  operacion(tokens[0].trim(),tokens[1].trim(),digits));
        
    }
    
    
    private static double operacion(String... args){
        double respuesta = 0.0;
        double numero1 = Double.parseDouble(args[0]);
        double numero2 = Double.parseDouble(args[1]);
        
        switch(args[2]){
            case "+":
                respuesta = (numero1+numero2);
                break;
            case "-":
                respuesta = (numero1-numero2);
                break;
            case "/":
                respuesta = (numero1/numero2);
                break;
            case "*":
                respuesta = (numero1*numero2);
                break;
        }
        
        return Math.round(respuesta);
    }
}
