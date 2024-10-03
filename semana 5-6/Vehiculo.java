public class Vehiculo {
    protected String marca;
    public Vehiculo(String marca) {
        this.marca = marca;
    }
    public void mostrarInfo() {
        System.out.println("Marca del vehículo: " + marca);
    }
}

class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int numeroDePuertas) {
        super(marca);
        this.numeroDePuertas = numeroDePuertas;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Marca del coche: " + marca + ", Número de puertas: " + numeroDePuertas);
    }
}

class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota");
        vehiculo.mostrarInfo();

        Coche coche = new Coche("Ford", 4);
        coche.mostrarInfo();
    }
}
