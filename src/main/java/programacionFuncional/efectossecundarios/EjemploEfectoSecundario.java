package programacionFuncional.efectossecundarios;

//Mala practica, con efectos secundarios
public class EjemploEfectoSecundario {

    public static int x;
    public static int f(int n) {
        x = x * 2;
        return x + n;
    }
    public static void main(String[] args) {
        x = 5;
        //int result = f(x) + f(x);	// comparar las 2 llamadas
        int result = 2 * f(x);
        System.out.println(result);
    }



}
