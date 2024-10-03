class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

// Excepción personalizada para límite de sobregiro excedido
class LimiteSobregiroExcedidoException extends Exception {
    public LimiteSobregiroExcedidoException(String mensaje) {
        super(mensaje);
    }
}
public class CuentaBan {
    
}
