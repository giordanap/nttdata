package poo.estructuras;

public class Ciclicas {

    public static void main(String[] args) {

        conFor();
        //conWhile();
        //conDoWhile();

    }

    static void conFor(){
        //multiplos de 5; 0 al 100
        for (int i = 0 ; i<=100 ; i+=5){
            System.out.println(i);
            if(i == 35){
                System.out.println("llego hasta el 35");
                break;
            }
        }
    }

    static void conWhile(){
        //multiplos de 5; 0 al 100
        int i = 0;
        while(i <= 100){
            System.out.println(i);
            i+=5;
        }
    }

    static void conDoWhile(){
        //multiplos de 5; 0 al 100
        int i = 0;
        do {
            System.out.println(i);
            i+=5;
        }while(i <= 100);

    }


}
