package puntovehiculos;

import javax.swing.JOptionPane;

public class Vehiculo {

    private String[] vehiculos;
    private int cantidad;

    public Vehiculo(String[] vehiculos, int cantidad) {
        this.vehiculos = vehiculos;
        this.cantidad = cantidad;
    }

    public Vehiculo() {
        this.cantidad = 0;

    }

    public String[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(String[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresarVehiculos() {

        setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehiculos que quiere ingresar")));
        
        
        this.vehiculos = new String[getCantidad()];
        for (int i = 0; i < getCantidad(); i++) {
            vehiculos[i] = JOptionPane.showInputDialog("Ingrese el nombre del vehiculo " + (i + 1));
            
            setVehiculos(vehiculos);
        }
        Precio precio = new Precio();
        precio.setCantidad(getCantidad());
        precio.asignarPrecio(vehiculos, precio);
        
       

    }

    public void leerVehiculos() {

        for (int i = 0; i < vehiculos.length; i++) {

            System.out.println(vehiculos[i]);

        }
    }

}
