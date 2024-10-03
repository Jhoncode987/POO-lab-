public interface Movible {
    void moverse();
}
class Coche implements Movible {
    private String modelo;
    private int velocidad;

    public Coche(String modelo, int velocidad) {
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    @Override
    public void moverse() {
        System.out.println("El coche " + modelo + " se mueve a " + velocidad + " km/h sobre el asfalto.");
    }
}

class Avion implements Movible {
    private String aerolinea;
    private int alturaVuelo;

    public Avion(String aerolinea, int alturaVuelo) {
        this.aerolinea = aerolinea;
        this.alturaVuelo = alturaVuelo;
    }
    @Override
    public void moverse() {
        System.out.println("El avión de " + aerolinea + " vuela a una altura de " + alturaVuelo + " metros.");
    }
}

class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", 120);
        coche.moverse();
        Avion avion = new Avion("Aeroméxico", 10000);
        avion.moverse();
    }
}