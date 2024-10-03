abstract class Forma {
    public abstract double calcularArea();
}
class Triangulo extends Forma {
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    public void mostrarInformacion() {
        System.out.println("Área del triángulo: " + calcularArea());
    }
}

class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public void mostrarInformacion() {
        System.out.println("Área del cuadrado: " + calcularArea());
    }
}

class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.mostrarInformacion();
        Cuadrado cuadrado = new Cuadrado(4);
        cuadrado.mostrarInformacion();
    }
}
