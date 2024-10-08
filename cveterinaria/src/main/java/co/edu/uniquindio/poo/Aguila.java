package co.edu.uniquindio.poo;

public class Aguila extends Animal {
    private double envergaduraAlas;

    public Aguila(String nombre, int edad, double peso, double envergaduraAlas) {
        super(nombre, edad, peso);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está cazando y comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo en su nido.");
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

   
}
