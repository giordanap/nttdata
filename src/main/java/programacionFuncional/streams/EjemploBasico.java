package programacionFuncional.streams;

import java.util.stream.IntStream;

public class EjemploBasico {

    public static void main(String[] args) {

        int sumOfElements = IntStream.range(2, 10)
                .filter(num -> num % 3 == 0)
                .sum();

        System.out.println(sumOfElements);

    }

}
