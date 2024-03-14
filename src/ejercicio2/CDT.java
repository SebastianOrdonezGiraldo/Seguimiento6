package ejercicio2;

public class CDT implements ProductoFinanciero{
    private double saldo;
    private double interesMensual;

    public CDT(double inversion, double interesMensual) {
        this.saldo = inversion;
        this.interesMensual = interesMensual;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void cerrar(CuentaCorriente cuentaCorriente) {
        cuentaCorriente.depositar(this.saldo);
        this.saldo = 0;
    }

    public void invertir(int cantidad) {

        this.saldo += cantidad;
    }
}
