/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Área del cuadrado");
        System.out.println("2. Área del triángulo");
        System.out.println("3. Área del rectángulo");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    // Procedimiento para el área del cuadrado
    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = entrada.nextDouble();

        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    // Procedimiento para el área del triángulo
    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    // Procedimiento para el área del rectángulo
    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
