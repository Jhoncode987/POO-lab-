public class Calculadora {
    public int suma (int a, int b){
        return a + b;
    }
    public int suma (int a, int b, int c){
        return a+b+c;
    }
    public double suma(double a, double b){
        return a +b;
    }
    public double suma(double a, double b, double c){
        return a+b+c;
    }
    public int resta (int a, int b){
        return a-b;
    }
    public int resta(int a, int  b, int c){
        return a-b-c;
    }
    public double resta( double a, double b){
        return a - b;
    }
    public double resta(double a, double b, double c){
        return a-b-c;
    }
    public int multiplicacion(int a, int b){
        return a*b;
    }
    public int multiplicacion(int a , int  b, int c){
       return a*b*c;
    }
    public double multiplicacion(double a, double b){
        return a*b;
    }
    public double multiplicacion(double a, double b, double c){
        return a*b*c;
    }
    public int division( int a, int b){
        if (b == 0) {
            throw new ArithmeticException("division en cero");
        }
        return a/b;
    }
    public int division(int a, int b, int c){
        if (b==0||c==0) {
            throw new ArithmeticException("division en cero");
        }
        return a/b/c;
    }
    public double division(double a, double b){
        if (b==0.0) {
            throw new ArithmeticException("division en cero");
        }
        return a/b;
    }
    public double division( double a, double b, double c){
        if (b==0.0 || c==0.0) {
            throw new ArithmeticException("division en cero");
        }
        return a/b/c;
    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("suma de 2 enteros: " + calc.suma(1,2));
        System.out.println("suma de 3 enteros: " + calc.suma(1,2,3));
        System.out.println("suma de 2 decimales: " + calc.suma(1.1,2.6));
        System.out.println("suma de 3 decimales: " + calc.suma(1.1,2.6, 3.5));
        System.out.println("resta de 2 enteros: " + calc.resta(1,2));
        System.out.println("resta de 3 enteros: " + calc.resta(1,2,6));
        System.out.println("resta de 2 decimales: " + calc.resta(1.5,2.9));
        System.out.println("resta de 3 decimales: " + calc.resta(1.5,2.9,6.8));
        System.out.println("multiplicacion de 2 enteros: " + calc.multiplicacion(1,2));
        System.out.println("multiplicacion de 3 enteros: " + calc.multiplicacion(1,2,5));
        System.out.println("multiplicacion de 2 decimales: " + calc.multiplicacion(1.8,2.7));
        System.out.println("multiplicacion de 3 decimales: " + calc.multiplicacion(1.8,2.7,9.8));
        try{
            System.out.println("division de 2 enteros: " + calc.division(8,2));
            System.out.println("division de 3 enteros: " + calc.division(8,2,4));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("division de 2 decimales: " + calc.division(8.6,2.4));
            System.out.println("division de 3 decimales: " + calc.division(8.4,2.9,3.7));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
