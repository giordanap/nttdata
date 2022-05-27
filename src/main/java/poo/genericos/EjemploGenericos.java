package poo.genericos;

//Por convencion se puede usar la T, K, U;puede tener el valor que queramos
public class EjemploGenericos <T> {

    private T primerAtributo;

    public EjemploGenericos(T primerAtributo) {
        this.primerAtributo = primerAtributo;
    }

    public T getPrimerAtributo() {
        return primerAtributo;
    }

    public void setPrimerAtributo(T primerAtributo) {
        this.primerAtributo = primerAtributo;
    }
}
