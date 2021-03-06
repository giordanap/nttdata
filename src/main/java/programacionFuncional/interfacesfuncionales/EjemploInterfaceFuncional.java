package programacionFuncional.interfacesfuncionales;

@FunctionalInterface
public interface EjemploInterfaceFuncional {

    //Sólo debe tener un método abstracto
    void Saludar(String saludo);

    default int sumar(int a, int b){
        return a + b;
    }

    static void imprimir(String aImprimir){
        System.out.println(aImprimir);
    }
}
