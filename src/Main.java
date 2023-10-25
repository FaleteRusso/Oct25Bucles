public class Main {
    public static void main(String[] args) {
        int i =100;
        while (i <=10){
            System.out.println("entra al bucle");
            i++;
        }
        System.out.println("terminó el bucle");


        int contador = 1;

        while (contador <= 5) {
            System.out.println("Iteración " + contador);
            contador++; // Actualiza la condición incrementando el contador
        }

        System.out.println("Fin del bucle.");

        //comparativa con do while
        i= 100;
        do{
            System.out.println("Entra al bucle "+ contador);
            i++;
        }while (contador<=10);
        System.out.println("Terminacion del bucle");

    }
}