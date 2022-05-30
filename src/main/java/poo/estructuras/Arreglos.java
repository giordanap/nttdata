package poo.estructuras;

import poo.Abuelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arreglos {

    public static void main(String[] args) {
        //arreglos1();
        //listarAbuelos();
        //listarAbuelosArrayList();
        listarAbuelosLambda();
        //listarAbuelosOrdenado();
        listarAbuelosOrdenadaLambda();

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

    static void listarAbuelosLambda(){
        ArrayList<Abuelo> listarAbuelos = new ArrayList<>();
        listarAbuelos.add(new Abuelo("Pedro","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Juan","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Rosa","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Zoila","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Maria","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Flor","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Angel","M",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Robert","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("TEST","Masculino",(short) 75,"Loreto"));

        listarAbuelos.forEach(data -> System.out.println(data));
    }

    static void listarAbuelosOrdenado(){
        System.out.println("Listado de Forma Ordenada por el Nombre");

        ArrayList<Abuelo> listarAbuelos = new ArrayList<>();
        listarAbuelos.add(new Abuelo("Pedro","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Juan","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Rosa","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Zoila","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Maria","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Flor","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Angel","M",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Robert","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("TEST","Masculino",(short) 75,"Loreto"));

        Collections.sort(listarAbuelos, new Comparator<Abuelo>() {
            @Override
            public int compare(Abuelo o1, Abuelo o2) {
                return o1.getNombre().compareToIgnoreCase(o2.getNombre());
            }
        });

        for(Abuelo abuelos : listarAbuelos){
            System.out.println(abuelos);
        }
    }

    static void listarAbuelosOrdenadaLambda(){
        System.out.println("Listado de Forma Ordenada por el Nombre con Lambdas");

        ArrayList<Abuelo> listarAbuelos = new ArrayList<>();
        listarAbuelos.add(new Abuelo("Pedro","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Juan","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Rosa","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Zoila","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Maria","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Flor","F",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Angel","M",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Robert","Masculino",(short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("TEST","Masculino",(short) 75,"Loreto"));

        listarAbuelos.sort((a1, a2) -> a1.getNombre().compareToIgnoreCase(a2.getNombre()));
        listarAbuelos.forEach(data -> System.out.println(data));
    }

}
