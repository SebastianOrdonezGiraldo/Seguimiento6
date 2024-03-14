package ejercicio2;

import javax.swing.*;

public class Cuenta implements ProductoFinanciero{
    protected double saldo;

    public Cuenta(double saldoInicial){
        this.saldo= saldoInicial;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
        } else {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        }
    }
}
