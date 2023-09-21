package Practica2;

public class EmpleadoAsalariado extends Empleado implements Bonificacion  {
    private int diasTrabajados;
    private double sueldoMensual;

    public EmpleadoAsalariado(String nombre, double sueldoMensual, int diasTrabajados) throws SalarioInvalidoException {
        super(nombre, sueldoMensual);
        if (sueldoMensual <=0){
            throw new SalarioInvalidoException("El sueldo mensual no puede ser negativo o = 0");
        }
        this.diasTrabajados = diasTrabajados;
    }
    

    public int getDiasTrabajados() {
        return diasTrabajados;
    }


    public double getSueldoMensual() {
        return sueldoMensual;
    }


    @Override
    public double calcularSalario() {
        return (sueldoMensual / 30 )* diasTrabajados;
    }
    @Override 
    public double calcularBonificacion(){
        return 0;
    }
    
}
