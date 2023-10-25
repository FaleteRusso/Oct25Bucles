package com.corenetwork.presentacion;

import com.corenetwork.modelo.Coche;

import java.util.Scanner;

public class ProbarCoche {
    public static void main(String[] args) {
        Coche c1 = new Coche();
        c1.color ="amarillo";
        c1.electrico = false;
        c1.modelo = "Auris";
        c1.tipoMotor = "gasolina";
        c1.numPuertas = 5;
        //esto de abajo es un metodo, creado en el modelo
        c1.acelerar();
        c1.frenar();

        Coche c2 = new Coche();
        c2.color= "rojo";
        c2.tipoMotor = "hibrido";
        c2.modelo = "Corolla TS";
        c2.numPuertas = 5;
        c2.electrico = false;
        c2.acelerar();
        c2.frenar();


    }
}
