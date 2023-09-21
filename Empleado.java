package Practica2;

public abstract class Empleado {
    private String nombre;
    private double salario;
    public Empleado(String nombre, double salario) throws SalarioInvalidoException  {
        if (salario <=0){
            throw new SalarioInvalidoException("El salario no puede ser 0 o negativo");
        }
        this.nombre = nombre;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public abstract double calcularSalario();
    }

