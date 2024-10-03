class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}


class LimiteSobregiroExcedidoException extends Exception {
    public LimiteSobregiroExcedidoException(String mensaje) {
        super(mensaje);
    }
}
public class CuentaBan {
    protected double saldo;
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Error: Saldo insuficiente para realizar el retiro.");
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
    }
    public double consultarSaldo() {
        return saldo;
    }
}
class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;
    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial); 
        this.limiteSobregiro = limiteSobregiro;
    }
    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > saldo + limiteSobregiro) {
            throw new LimiteSobregiroExcedidoException("Error: El retiro excede el límite de sobregiro permitido.");
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
    }
    public double consultarLimiteSobregiro() {
        return limiteSobregiro;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            CuentaBancaria cuenta = new CuentaBancaria(500);
            System.out.println("Saldo inicial en cuenta bancaria: $" + cuenta.consultarSaldo());
            cuenta.retirar(600); 
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            CuentaCorriente cuentaCorriente = new CuentaCorriente(500, 200);
            System.out.println("\nSaldo inicial en cuenta corriente: $" + cuentaCorriente.consultarSaldo());
            cuentaCorriente.retirar(650); 
            cuentaCorriente.retirar(100); 

        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}

