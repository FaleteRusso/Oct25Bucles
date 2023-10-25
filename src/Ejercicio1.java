import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //sumar los numeros que se pidán por la consola
        //salir del bucle cuando se escriba un numero negativo
        //1.definir variales
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma=0;
        //hacer esto
        do{
            System.out.println("escriba el numero: (para salir introduzca un negativo)");
            numero= teclado.nextInt();
            if (numero>00){
            suma+=numero;}
        //mientras se cumpla esto
        }while(numero >=0);
        System.out.println("Suma ->"+ suma);
    }
}
