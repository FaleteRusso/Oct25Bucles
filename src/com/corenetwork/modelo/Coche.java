package com.corenetwork.modelo;

public class Coche {
    //atributos (modos de acceso)
    public String color;
    public String tipoMotor;
    public int numPuertas;
    public String modelo;
    public boolean electrico;

    public void  acelerar(){
        System.out.println("el coche está acelerando");
    }
    public void frenar(){
        System.out.println("el coche está frenando");
    }

}
