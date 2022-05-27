package poo.ejemplos;

import poo.Abuelo;
import poo.Hijo;
import poo.Padre;

public class Herencia {

    public static void main(String[] args) {

        Abuelo abuelito = new Abuelo("Pedro","Masculino",(short) 75,"Loreto");
        Padre papa = new Padre("Juan", "Masculino",(short) 40,"Cuzco",(float)1.75,"Casado");
        Hijo hijito = new Hijo("Manuel", "Masculino",(short)15, "Lima",(float)1.60,"Soltero","manu",150);

        System.out.println( "Abuelo: " + abuelito);
        System.out.println( "Padre: " + papa);
        System.out.println( "Hijo: " + hijito);



    }
}
