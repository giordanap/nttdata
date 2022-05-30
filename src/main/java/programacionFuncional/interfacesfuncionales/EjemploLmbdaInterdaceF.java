package programacionFuncional.interfacesfuncionales;

public class EjemploLmbdaInterdaceF {


    public static void main(String[] args) {

        //1era forma clasica
        EjemploInterfaceFuncional interfaceFuncional = new EjemploInterfaceFuncional() {
            @Override
            public void Saludar(String saludo) {
                System.out.println(saludo);
            }
        };
        interfaceFuncional.Saludar("Hola NttData");

        //2da forma usando lambda
        EjemploInterfaceFuncional inFun = saludo -> System.out.println(saludo);
        inFun.Saludar("Hola NttData con usa lambda");

        //3era forma pasar por parametro la interface funcional
        ejemploInterLambda("Hola NttData pasando parametro IE", saludo -> System.out.println(saludo));

    }

    public static void ejemploInterLambda(String saludo,  EjemploInterfaceFuncional interFuncionalParametro){
        interFuncionalParametro.Saludar(saludo);
    }


}
