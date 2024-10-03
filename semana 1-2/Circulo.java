class Circulo {
    final double PI = 3.14; // Constante PI
    final double radio;     // Constante radio

    // Constructor que inicializa el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return PI * (radio * radio);
    }

    // Método toString para imprimir el círculo
    @Override
    public String toString() {
        return "El área del círculo con radio " + radio + " es: " + calcularArea();
    }

    public static void main(String[] args) {
        // Crear un objeto Circulo con un radio de 6
        Circulo myObj = new Circulo(6);
        // Imprimir la información del círculo, incluyendo el área
        System.out.println(myObj);
    }
}
