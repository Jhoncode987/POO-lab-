public class Vehiculo {
    protected String marca;
    protected String modelo;
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarInformacion(){
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
    }
}
class VehiculoMotorizado extends Vehiculo{
    protected int motor;
    public VehiculoMotorizado(String marca, String modelo, int motor){
        super(marca, modelo);
        this.motor = motor;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("motor: " + motor);
    }
}
class Coche extends VehiculoMotorizado{
    private int numeroPuertas;
    public Coche(String marca, String modelo, int motor, int numeroPuertas){
        super(marca, modelo, motor);
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("numero de puertas: " + numeroPuertas);
    }
}
class Motocicleta extends VehiculoMotorizado{
    private boolean tieneSidecar;
    public Motocicleta(String marca, String modelo, int motor, boolean tieneSidecar){
        super(marca, modelo, motor);
        this.tieneSidecar = tieneSidecar;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("tiene sidecar?: " + (tieneSidecar? "Si":"No"));
    }
}
class Main{
    public static void main(String[] args) {
        Coche coche = new Coche("toyota", "5ysp", 600, 4);
        coche.mostrarInformacion();
        System.out.println();
        Motocicleta motocicleta = new Motocicleta("ronco", "primun", 200, false);
        motocicleta.mostrarInformacion();
        System.out.println();
    }
}
