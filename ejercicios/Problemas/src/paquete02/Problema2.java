/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        String[] viviendas = obtenerViviendas();
        double[][] consumos = obtenerConsumos(viviendas);
        System.out.println("Datos registrados correctamente");
    }

    public static String[] obtenerViviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];

        for (int i = 0; i < viviendas.length; i++) {
            System.out.println("Ingrese el nombre de la vivienda " + (i + 1) + ":");
            viviendas[i] = entrada.nextLine();
        }
        return viviendas;
    }

    public static double[][] obtenerConsumos(String[] viviendas) {
        Scanner entrada = new Scanner(System.in);
        double[][] consumos = new double[viviendas.length][12];

        for (int i = 0; i < viviendas.length; i++) {
            System.out.println("Vivienda: " + viviendas[i]);

            for (int j = 0; j < 12; j++) {
                System.out.println("Ingrese el consumo del mes " + (j + 1) + ":");
                consumos[i][j] = entrada.nextDouble();
                entrada.nextLine();
            }
        }
        return consumos;
    }
}
