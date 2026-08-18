package S06B;

public class Vendedor extends Empleado {
    private double porcentajeComision;
    private int ventasExitosas;

    public Vendedor(String nombre, String numEmpleado, double salario_Base, double porcentajeComision) {

    // Constructor de Empleado
    super(nombre, numEmpleado, salario_Base);
    this.porcentajeComision = porcentajeComision;
    this.ventasExitosas = 0;
    }
    
    //Método propio
    public void registrarVentaExitosa() {
    this.ventasExitosas++;
    System.out.println(" -> [Vendedor] " + getNombre() + " registró una venta. Ventas realizadas: " + this.ventasExitosas);
    }

    public double getPorcentajeComision() {
    return porcentajeComision;
    }
}
