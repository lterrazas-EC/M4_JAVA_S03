package A2;

public class Main {
    public static void main(String[] args) {
       
        Estudiante e1 = new Estudiante("Priscilla", "Lic. en Terapia física", 9.2);
        Estudiante e2 = new Estudiante("Lizeth", "Lic. en Comercio Exterior", 8.5);
        Estudiante e3 = new Estudiante("Laura", "Ing. en Sistemas Computacionales", 7);
        Estudiante e4 = new Estudiante("Rosy", "Lic. en Relaciones Publicas", 6.8);
   
        System.out.println("==================================================");
        e1.mostrarDatos();
        e1.evaluarRendimiento();
        System.out.println("==================================================");
        e2.mostrarDatos();
        e2.evaluarRendimiento();
        System.out.println("==================================================");
        e3.mostrarDatos();
        e3.evaluarRendimiento();
        System.out.println("==================================================");
        e4.mostrarDatos();
        e4.evaluarRendimiento();
        System.out.println("==================================================");
    }
}
