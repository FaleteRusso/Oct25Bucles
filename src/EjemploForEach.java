import java.util.Scanner;

public class EjemploForEach {
    public static void main(String[] args) {
        //declaracion de array
        int[] numeros = {3, 4, 1, 5, 6, 7};
        //recorremos la coleccion del array
        for (int elemento : numeros) {
            System.out.println(elemento);
        }

        String[] palabras = {"casa", "coche", "aula", "ordenador"};
        //recorrer el array
        for (String elemento : palabras) {
            System.out.println(elemento);
        }
        char[] letras = {'a', 'u', 'p', 'a',};
        for (char elemento : letras) {
            System.out.println(elemento);
        }
        double[] sueldos = {1_200.50, 1_450.89, 1_800.25, 2_000.13};
        double suma = 0;
        for (double elemento : sueldos) {
            suma += elemento;
        }
        System.out.println("La suma es: " + suma + "€");

    }
}
