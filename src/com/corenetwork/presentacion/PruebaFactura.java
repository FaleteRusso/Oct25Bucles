package com.corenetwork.presentacion;

import com.corenetwork.modelo.Factura;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        // //En probar cliente crear objeto y solicitar los datos por consola
        // y luego mostrarlos.
        Factura f1 = new Factura();
        Scanner teclado = new Scanner(System.in);
        f1.id = 0;
        f1.cliente= "";
        f1.importe=0;
        f1.direccionEntrega= "";


        System.out.println("introduzca 'id' de la factura");
        f1.id =teclado.nextInt();
        teclado.nextLine();
        System.out.println("introduzca nombre cliente");
        f1.cliente=teclado.nextLine();
        System.out.println("introduzca importe de factura");
        f1.importe=teclado.nextDouble();
        teclado.nextLine();
        System.out.println("introduzca direccion de entrega");
        f1.direccionEntrega=teclado.nextLine();

        System.out.println("ID de factura: "+ f1.id);
        System.out.println("Nombre del cliente: " +f1.cliente);
        System.out.println("Importe de la factura: "+ f1.importe+"€");
        System.out.println("Dirección de entrega del pedido: "+f1.direccionEntrega);

        f1.calcularIva();
        System.out.println("El IVA es: "+f1.calcularIva());
        System.out.println("El IVA es: "+f1.calcularIva(0.04));



    }
}
