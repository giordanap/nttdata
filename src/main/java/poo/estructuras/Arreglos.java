package poo.estructuras;

import poo.Abuelo;

import java.util.ArrayList;

public class Arreglos {

    public static void main(String[] args) {
        //arreglos1();
        //listarAbuelos();
        listarAbuelosArrayList();
    }

    static void arreglos1(){
        int[] num = new int[5];
        num[0] = 39;
        num[1] = -2;
        num[2] = -5;
        num[3] = 3;
        num[4] = 9;
        for (int i= 0; i < num.length ; i++){
            System.out.printf("num[%2d]: %d\n", i, num[i]);
        }
        for(int numeros : num){
            System.out.println(numeros);
        }
    }

    static void listarAbuelos(){
        Abuelo listaAbuelos[] = new Abuelo[4];

        listaAbuelos[0] = new Abuelo("Pedro","Masculino",(short) 75,"Loreto");
        listaAbuelos[1] = new Abuelo("Juan","Masculino",(short) 75,"Loreto");
        listaAbuelos[2] = new Abuelo("Rosa","F",(short) 85,"Loreto");
        listaAbuelos[3] = new Abuelo("Maria","F",(short) 75,"Loreto");
        listaAbuelos[4] = new Abuelo("Flor","F",(short) 75,"Loreto");

        for(Abuelo abuelos : listaAbuelos){
            System.out.println(abuelos);
        }
    }

    static void listarAbuelosArrayList(){

        ArrayList<Abuelo> listarAbuelos = new ArrayList<>();

        listarAbuelos.add(new Abuelo("Pedro","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Juan","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Rosa","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Maria","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Flor","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Robert","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("TEST","Masculino",(short) 75,"Loreto"));

        for(Abuelo abuelos : listarAbuelos){
            System.out.println(abuelos);
        }

    }


}
