package Practica2;

public class Main {
    public static void main(String[] args) {
        
        try {
            

            Empleado empleado1 = new EmpleadoPorHora("Melisa",60 , 30);
            double salarioPorHora = empleado1.calcularSalario();
            System.out.println("Salario: " + salarioPorHora);

            Empleado empleado2 = new EmpleadoAsalariado("Guillermo", 1000, 12);
            double salarioPorMes = empleado2.calcularSalario();
            System.out.println("Salario: " + salarioPorMes);

            if (empleado2 instanceof Bonificacion){
                double bono = ((Bonificacion)empleado2).calcularBonificacion();

                System.out.println("Bonificacion: " + bono);
            }


        } catch (SalarioInvalidoException e) {
            System.out.println("Error " + e);
        }
    }
}
