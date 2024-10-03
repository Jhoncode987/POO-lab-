class Empleado {
    protected String nombre;
    protected double salario;
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public double calcularBono() {
        return salario * 0.10;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Bono: " + calcularBono());
    }
}

class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, salario); 
    }
    @Override
    public double calcularBono() {
        return salario * 0.15;
    }
}

class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", 2000);
        empleado1.mostrarInformacion();
        System.out.println();
        Gerente gerente1 = new Gerente("Laura", 5000);
        gerente1.mostrarInformacion();
    }
}
