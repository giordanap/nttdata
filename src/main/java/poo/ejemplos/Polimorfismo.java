package poo.ejemplos;

import poo.Abuelo;
import poo.Hijo;
import poo.Padre;

public class Polimorfismo {

    public static void main(String[] args) {

        Abuelo abuelo = new Hijo();
        abuelo.devuelvemeInformacion();


    }
}
