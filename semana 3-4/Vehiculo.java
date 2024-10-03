class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
class VehiculoMotorizado extends Vehiculo {
    protected double capacidadMotor; // En litros
    public VehiculoMotorizado(String marca, String modelo, double capacidadMotor) {
        super(marca, modelo); 
        this.capacidadMotor = capacidadMotor;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Capacidad del motor: " + capacidadMotor + " L");
    }
}

class Coche extends VehiculoMotorizado {
    private int numeroPuertas;

    public Coche(String marca, String modelo, double capacidadMotor, int numeroPuertas) {
        super(marca, modelo, capacidadMotor); 
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}

class Motocicleta extends VehiculoMotorizado {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, double capacidadMotor, boolean tieneSidecar) {
        super(marca, modelo, capacidadMotor); 
        this.tieneSidecar = tieneSidecar;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }
}

class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 1.8, 4);
        coche.mostrarInformacion();

        System.out.println();

        Motocicleta moto = new Motocicleta("Harley-Davidson", "Sportster", 1.2, true);
        moto.mostrarInformacion();
    }
}

