package poo.genericos;

import poo.Abuelo;

public class MainGenerico {

    public static void main(String[] args) {

        EjemploGenericos<Abuelo> ejemploGenericos = new EjemploGenericos<>(new Abuelo("Pedro","Masculino",(short) 75,"Loreto" ));

        System.out.println(ejemploGenericos.getPrimerAtributo());


    }

}
