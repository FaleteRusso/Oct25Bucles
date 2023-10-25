package com.corenetwork.modelo;

public class Cliente {
    public String nombre;
    public int cantidadEmpleados;
    public int numeroDepartamentos;
    public double facturacion;

    public double calcularImpuestos (){
        return facturacion*0.30;

    }
}
