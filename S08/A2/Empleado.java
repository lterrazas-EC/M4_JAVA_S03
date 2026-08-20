package S08.A2;

public class Empleado {
    private String nombre;
    private double salarioBase;
    
    //Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    //Método
    public String calcularPago(){
        return "Nombre del empleado: " + this.nombre + "Salario Base: " + this.salarioBase; 
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase(){
        return salarioBase;
    }
}
