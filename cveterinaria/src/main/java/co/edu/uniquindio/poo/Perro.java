package co.edu.uniquindio.poo;

public class Perro extends Animal {
    private String raza;
    private String dueño;

    public Perro(String nombre, int edad, double peso, String raza, String dueño) {
        super(nombre, edad, peso);
        this.raza = raza;
        this.dueño = dueño;
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public String getRaza() {
        return raza;
    }

    public String getDueño() {
        return dueño;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
}

