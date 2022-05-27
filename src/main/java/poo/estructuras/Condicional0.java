package poo.estructuras;

public class Condicional0 {

    public static void main(String[] args) {

        int horasTrabajadas = 50;
        int pagoHora = 25;
        int sueldo = horasTrabajadas * pagoHora;

        if(horasTrabajadas <= 40){
            System.out.println("Sueldo seria " + sueldo);
        }else if(horasTrabajadas <= 20) {
            System.out.println("Sueldo seria " + sueldo);
        }

    }
}
