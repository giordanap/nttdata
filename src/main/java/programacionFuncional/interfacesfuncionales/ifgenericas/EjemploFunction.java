package programacionFuncional.interfacesfuncionales.ifgenericas;

import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {

        Function<Integer, String> convertidor = x -> Integer.toString(x);
        System.out.println("Total de caracteres: "+ convertidor.apply(123654998).length());

    }

}
