package S08.A1;

public class Main {
    public static void main(String[] args) {
        Pelicula p = new Pelicula("Project Hail Mary", 156, "Phil Lord y Christopher Miller");
        Serie s = new Serie("The Chosen", 45, 6);

        System.out.println("=".repeat(60));
        System.out.println("Pelicula de esteno");
        System.out.println("=".repeat(60));
        p.mostrarInfo();
        System.out.println("=".repeat(60));
        System.out.println("Serie favorita");
        System.out.println("=".repeat(60));
        s.mostrarInfo();
        System.out.println("=".repeat(60));

    }
}
