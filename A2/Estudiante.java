package A2;

public class Estudiante {
   
    // Atributos
    String nombre;
    String carrera;
    double promedio;

    // Constructor
    public Estudiante(String nombre, String carrera, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Método 01
    void mostrarDatos() {
        System.out.println(
            "Soy " + nombre + " estudio " + carrera + " y mi promedio es de " + promedio + "."
        );
    }

    // Método 02
    void evaluarRendimiento() {
        if (promedio >= 9) {
            System.out.println("Excelente rendimiento.");
        } else if (promedio >= 7 && promedio <= 8.9) {
            System.out.println("Buen rendimiento.");
        } else {
            System.out.println("Necesitas mejorar.");
        }
    }
}
