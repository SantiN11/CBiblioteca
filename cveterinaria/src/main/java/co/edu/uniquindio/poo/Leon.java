package co.edu.uniquindio.poo;

public class Leon extends Animal {
    private String melena;

    public Leon(String nombre, int edad, double peso, String melena) {
        super(nombre, edad, peso);
        this.melena = melena;
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está cazando y comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo bajo un árbol.");
    }

    public String getMelena() {
        return melena;
    }
}
