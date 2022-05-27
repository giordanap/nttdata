package poo.estructuras;

import poo.Abuelo;

public class Arreglos {

    public static void main(String[] args) {
        arreglos1();
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
        Abuelo listaAbuelos = new Abuelo();


    }


}
