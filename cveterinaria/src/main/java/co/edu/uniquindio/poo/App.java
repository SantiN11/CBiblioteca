package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
         
         Perro perro = new Perro("Roco",2 , 12.5, "Husky", "Santi");
         Gato gato = new Gato("Niña", 2, 4.0, "Gris con amarillo");
         Aguila aguila = new Aguila("Águila Calva", 5, 6.0, 2.1);
         Leon leon = new Leon("Simba", 7, 190.0, "Grande");
 

         System.out.println("La raza del perro es: " + perro.getRaza());
         System.out.println("El dueño del perro es: " + perro.getDueño());
         System.out.println("El color del pelaje del gato es: " + gato.getColorPelaje());
         System.out.println("La envergadura de alas del águila es: " + aguila.getEnvergaduraAlas() + " metros.");
         System.out.println("La melena del león es: " + leon.getMelena());
    }
}
