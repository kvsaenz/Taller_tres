import java.util.Scanner;

public class Main {

    /**
     * DETALLE DEL EJERCICIO
     * permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.
     * El algoritmo debe imprimir cual es el mayor y cual es el menor.
     * Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos.
     * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA;
        int valorB;
        int valorC;
        System.out.println("ingresa valor uno");
        valorA = scanner.nextInt();
        System.out.println("ingresa valor dos");
        valorB = scanner.nextInt();
        System.out.println("ingresa valor tres");
        valorC = scanner.nextInt();
        if (valorA == valorB || valorB == valorC || valorA == valorC) {
            System.out.println("Los valores deben ser diferentes");

        } else if (valorA > valorB && valorA > valorC) {
            System.out.println("este valor es mayor " + valorA);
        } else if (valorB > valorA && valorB > valorC) {
            System.out.println("este valor es mayor " + valorB);
        } else {
            System.out.println("este valor es mayor " + valorC);
        }


        if (valorA < valorB && valorA < valorC) {
            System.out.println("este valor es menor " + valorA);
        } else if (valorB < valorA && valorB < valorC) {
            System.out.println("este valor es menor " + valorB);
        } else {
            System.out.println("este valor es menor " + valorC);
        }

    }

}