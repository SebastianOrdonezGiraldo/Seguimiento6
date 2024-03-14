package ejercicio2;

public class CuentaAhorros extends Cuenta{
    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }
    public void calcularInteres() {
        this.saldo += this.saldo * 0.006;
    }
}
