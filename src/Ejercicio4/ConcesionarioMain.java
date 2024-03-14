package Ejercicio4;

import javax.swing.*;

public class ConcesionarioMain {
    public static void main(String[] args) {
        // Crear un concesionario
        IConcesionario concesionario = new Concesionario("Berlina motors", "Cr 18 # 70/20");
        ConcesionarioDAO concesionarioDAO = new ConcesionarioDAO(concesionario);

        while (true) {
            String opcion = JOptionPane.showInputDialog("Por favor, elige una opción:\n"
                    + "1. Agregar carro\n"
                    + "2. Borrar carro\n"
                    + "3. Obtener información sobre el concesionario\n"
                    + "4. Vender carro\n"
                    + "5. Mostrar los carros disponibles\n"
                    + "6. Salir");

            switch (opcion) {
                case "1":
                    String modelo = JOptionPane.showInputDialog("Introduce el modelo del carro:");
                    String marca = JOptionPane.showInputDialog("Introduce la marca del carro:");
                    String año = JOptionPane.showInputDialog("Introduce el año del carro:");
                    ICar carroNuevo = new Car(modelo, marca, Integer.parseInt(año));
                    concesionarioDAO.addCar(carroNuevo);
                    break;
                case "2":
                    String modeloBorrar = JOptionPane.showInputDialog("Introduce el modelo del carro que quieres borrar:");
                    ICar carroABorrar = new Car(modeloBorrar, "", 0);
                    concesionarioDAO.deleteCar(carroABorrar);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, concesionarioDAO.getInfo());
                    break;
                case "4":
                    String modeloVender = JOptionPane.showInputDialog("Introduce el modelo del carro que quieres vender:");
                    ICar carroAVender = new Car(modeloVender, "", 0);
                    concesionarioDAO.sellCar(carroAVender);
                    break;
                case "5":
                    concesionarioDAO.showCars();
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "¡Gracias por usar el sistema del concesionario!");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elige una opción del 1 al 6.");
            }
        }
    }
}
