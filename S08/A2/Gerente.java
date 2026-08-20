package S08.A2;

public class Gerente extends Empleado {
    private double bonoFijo;

    public Gerente (String nombre, double salarioBase, double bonoFijo){
        //Constructor de Empleado
        super(nombre, salarioBase);
        this.bonoFijo = bonoFijo;
    }

    //Método propio
    public double getbonoFijo(){
        return bonoFijo;
    }
    
    @Override 
    void calcularPago(){
        System.out.println("Nombre del empleado: "+ nombre + "$" + salario)

    }
}
