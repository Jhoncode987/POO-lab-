public class Empleado {
    private String nombre;
    private double salario;
    private String departamento;


    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
        }


    public double getSalario() {
        return this.salario;
        }


    public void setSalario(double nuevoSalario) {
        if (nuevoSalario > 0) {
            this.salario = nuevoSalario;
        } else {
            System.out.println("El salario debe ser mayor que 0.");
        }
    }


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: $" + salario);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Perez", 50000, "Recursos Humanos");

        // Mostrar información del empleado
        empleado.mostrarInformacion();

        // Intentar cambiar el salario a un valor negativo
        empleado.setSalario(-1000);

        // Actualizar salario a un valor válido
        empleado.setSalario(55000);

        // Mostrar información actualizada del empleado
        empleado.mostrarInformacion();
    }
}