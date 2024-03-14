package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(5000000);
        CuentaAhorros cuentaAhorros = new CuentaAhorros(1000000);
        CDT cdt = new CDT(0, 0);

        cliente.agregarProducto(cuentaCorriente);
        cliente.agregarProducto(cuentaAhorros);
        cliente.agregarProducto(cdt);

        System.out.println("Saldo inicial de la cuenta corriente: " + cuentaCorriente.getSaldo());
        System.out.println("Saldo inicial de la cuenta de ahorros: " + cuentaAhorros.getSaldo());
        System.out.println("Saldo inicial del CDT: " + cdt.getSaldo());

        cuentaCorriente.depositar(100000);
        cuentaAhorros.retirar(50000);
        cdt.cerrar(cuentaCorriente);

        System.out.println("Saldo final de la cuenta corriente: " + cuentaCorriente.getSaldo());
        System.out.println("Saldo final de la cuenta de ahorros: " + cuentaAhorros.getSaldo());
        System.out.println("Saldo final del CDT: " + cdt.getSaldo());

        System.out.println("Saldo total del cliente: " + cliente.getSaldoTotal());
    }}
