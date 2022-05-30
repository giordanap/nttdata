package programacionFuncional.interfacesfuncionales.ifgenericas;

import java.util.function.BinaryOperator;

public class EjemploBinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<Integer> operadora = (num1, num2) -> num1 * num2;
        int resultado = operadora.apply(5, 6);
        System.out.println(resultado);

    }
}
