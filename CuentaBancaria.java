public class CuentaBancaria {
    String titular;
    int numeroCuenta;
    double saldo;
    public CuentaBancaria(String titular, int numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public void consultarSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se ha depositado un monto de: " + cantidad);
        }else{
            System.out.println("La cantida debe ser positiva");
        }
    }
    public void retirar(double cantidad){
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se a retirado un monto de: " + cantidad);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("JHON", 2161985, 10000);
        cuenta.consultarSaldo();
        cuenta.depositar(200);
        cuenta.retirar(9000);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
