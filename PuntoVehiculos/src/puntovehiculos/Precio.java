package puntovehiculos;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Precio {

    private int precios[][];
    private int cantidad;
    int años[] = new int[5];
    private String arrayVehiculos[];

    public Precio(int[][] precios, int cantidad) {
        this.precios = precios;
        this.cantidad = cantidad;

    }

    public Precio() {

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int[][] getPrecios() {
        return precios;
    }

    public void setPrecios(int[][] precios) {
        this.precios = precios;
    }

    public void asignarPrecio(String[] vehiculos, Precio precio) {

        this.precios = new int[getCantidad()][años.length];
        años[0] = 2019;
        años[1] = 2020;
        años[2] = 2021;
        años[3] = 2022;
        años[4] = 2023;

        arrayVehiculos = new String[getCantidad()];
        arrayVehiculos = vehiculos;

        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < años.length; j++) {
                precios[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del vehiculo " + vehiculos[i] + " para"
                        + " el año " + años[j]));

            }
        }

        PuntoVehiculos menu = new PuntoVehiculos();
        menu.menuPrincipal(precio);

    }

    public void leerPrecio() {

        String resultado = "";
        /*
        for (int i = 0; i < getCantidad(); i++) {
            resultado+= arrayVehiculos[i];
            resultado += "    ";
        }
            resultado += "\n";
         */

        for (int i = 0; i < getCantidad(); i++) {
            resultado += arrayVehiculos[i] + ": ";
            for (int j = 0; j < años.length; j++) {
                resultado += años[j] + " - ";
                resultado += precios[i][j];
                resultado += "$,    ";

            }
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
    
    
    public void precioMenor(){
        int precioMenor=precios[0][0];
        int carrosBaratos[]= new int [años.length];
        
        for (int j = 0; j < años.length; j++) {
            for (int i = 0; i < getCantidad(); i++) {
                if (precios[j][i]<precioMenor) {
                    precioMenor=precios[j][j];
                    carrosBaratos[i]=precioMenor;
                }
                
            }
            
        }
        
        String resultado="";
        for (int i = 0; i < años.length; i++) {
            resultado+=carrosBaratos[i];
            
        }
       JOptionPane.showInputDialog(resultado);
    
    }

}
