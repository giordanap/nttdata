package poo;

public class Padre extends Abuelo {

    private float altura;
    private String estadoCivil;

    @Override
    public String toString() {
        return "Padre{" +
                "nombre='" + getNombre() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", edad=" + getEdad() +
                ", lugarResidencia='" + getLugarResidencia() + '\'' +
                "altura=" + altura +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }

    public Padre() {
    }

    public Padre(String nombre, String genero, short edad, String lugarResidencia, float altura, String estadoCivil) {
        super(nombre, genero, edad, lugarResidencia);
        this.altura = altura;
        this.estadoCivil = estadoCivil;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void devuelvemeInformacion(){
        System.out.println("Yo soy  el padre y estoy trabajando");
    }

}
