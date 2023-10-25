package com.corenetwork.presentacion;

import com.corenetwork.modelo.Cliente;

import java.util.Scanner;

public class ProbarCliente {
    public static void main(String[] args) {
        Cliente c1 =new Cliente();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba el nombre del cliente:");
        c1.nombre=teclado.nextLine();

        System.out.println("Escriba el numero de empleados:");
        c1.cantidadEmpleados=teclado.nextInt();

        System.out.println("Escariba la cantidad de departamentos:");
        c1.numeroDepartamentos=teclado.nextInt();

        System.out.println("Escriba la facturación:");
        c1.facturacion= teclado.nextDouble();

        System.out.println("El impuesto es: "+ c1.calcularImpuestos());

    }
}
