public class Persona {
    public void saludar() {
        System.out.println("Hola, soy una persona.");
    }
}
class Estudiante extends Persona {
    private String nombre;
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y soy estudiante.");
    }

    public void saludar(String otraPersona) {
        System.out.println("Hola, " + otraPersona + ". Soy " + nombre + " y soy estudiante.");
    }
}
class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.saludar();

        Estudiante estudiante = new Estudiante("Juan");
        estudiante.saludar();  
        estudiante.saludar("María");  
    }
}

