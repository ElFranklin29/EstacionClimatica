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

       
        
        setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos vehiculos desea ingresar?", 
                "Cantidad De Vehiculos",1)));
        
        
        this.vehiculos = new String[getCantidad()];
        for (int i = 0; i < getCantidad(); i++) {
            vehiculos[i] = JOptionPane.showInputDialog(null,"Ingrese el nombre del vehiculo " + (i + 1), "Nombre Del Vehiculo", 1);
            
            setVehiculos(vehiculos);
        }
        Precio precio = new Precio();
        precio.setCantidad(getCantidad());
        precio.asignarPrecio(vehiculos, precio);
        
       

    }

   

}
