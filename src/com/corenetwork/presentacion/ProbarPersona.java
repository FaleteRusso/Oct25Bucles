package com.corenetwork.presentacion;

import com.corenetwork.modelo.Persona;

public class ProbarPersona {
    public static void main(String[] args) {
        Persona human1 = new Persona();
        human1.nombre="Jazz";
        human1.genero='F';
        human1.dni = "51759324";
        human1.estadoCivil= 'S';
        human1.altura= 153;
        human1.colorPelo= "castaño";
        human1.peso= 50.2;

        Persona human2= new Persona();
        human2.nombre= "Jose";
        human2.genero= 'M';
        human2.dni= "51985898";
        human2.estadoCivil= 'S';
        human2.altura= 178;
        human2.colorPelo= "negro";
        human2.peso=101.8;
    }
}
