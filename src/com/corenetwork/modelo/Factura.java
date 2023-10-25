package com.corenetwork.modelo;

public class Factura {

    //Atributos -> id(entero), importe (double), direccionEntrega (String),
    // Cliente (String).
   public int id;
   public  double importe;
   public  String direccionEntrega;
   public String cliente;

   public double calcularIva(){
       return importe* 0.21;
   }
   public double calcularIva(double porcentaje){
       return importe*porcentaje;

   }
}
