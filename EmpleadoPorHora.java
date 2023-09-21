package Practica2;

public class EmpleadoPorHora extends Empleado  {
    private int horasTrabajadas;
    private double valorPorHora;
    public EmpleadoPorHora(String nombre, int horasTrabajadas, double valorPorHora) throws SalarioInvalidoException {
        super(nombre, valorPorHora);
        if(valorPorHora <=0){
            throw new SalarioInvalidoException("El valor por hora no puede ser igual a 0 o un valor negativo");
        }
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public double getValorPorHora() {
        return valorPorHora;
    }
    

    @Override 
    public double calcularSalario(){
        return valorPorHora * horasTrabajadas;
    }
}
