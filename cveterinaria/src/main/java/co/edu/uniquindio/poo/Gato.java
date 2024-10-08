package co.edu.uniquindio.poo;

public class Gato extends Animal {
    private String colorPelaje;

    public Gato(String nombre, int edad, double peso, String colorPelaje) {
        super(nombre, edad, peso);
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
}
