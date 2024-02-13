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
        int valor = 1;
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

                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio del vehiculo "
                        + "" + vehiculos[i] + " para el año " + años[j], "Ingresar precio", 1));
                precios[i][j] = valor;

            }

        }

        PuntoVehiculos menu = new PuntoVehiculos();
        menu.menuPrincipal(precio);

    }

    public void leerPrecio() {

        String resultado = "";

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

    public void minimosPorColumna() {

        String[] vehiculosMinimos = new String[años.length];

        int[] minimosPorColumna = new int[años.length];
        Arrays.fill(minimosPorColumna, Integer.MAX_VALUE);

        // Encuentra el valor mínimo para cada columna
        for (int j = 0; j < años.length; j++) {
            for (int i = 0; i < getCantidad(); i++) {
                if (precios[i][j] < minimosPorColumna[j]) {
                    minimosPorColumna[j] = precios[i][j];
                    vehiculosMinimos[j] = arrayVehiculos[i];
                }
            }
        }

        String resultado = "";
        for (int i = 0; i < años.length; i++) {
            resultado += años[i] + ": " + vehiculosMinimos[i] + " - " + minimosPorColumna[i] + "$\n";

        }
        JOptionPane.showMessageDialog(null, resultado, "Vehiculos Mas Baratos Por Año", 1);

    }

    public void promedioPorAño() {

        int añoSeleccionado;
        float promedio;
        float sumatoria = 0;
        int tamaño = 0;
        int[] arrayPromedio = new int[getCantidad()];
        String[] opciones = {"2019", "2020", "2021", "2022", "2023"};
        añoSeleccionado = JOptionPane.showOptionDialog(null, "Seleccione un año para obtener el promedio de los autos que cuestan "
                + "entre 30 y 50 millones", "Promedio Por Año",
                0, 1, null, opciones, null);

        for (int i = 0; i < getCantidad(); i++) {
            for (int j = 0; j < años.length; j++) {
                if (precios[i][añoSeleccionado] >= 30 && precios[i][añoSeleccionado] <= 50) {
                    arrayPromedio[i] = precios[i][añoSeleccionado];

                }
            }
        }

        for (int i = 0; i < arrayPromedio.length; i++) {

            if (arrayPromedio[i] != 0) {
                tamaño++;
            }
            sumatoria += (arrayPromedio[i]);
        }
        promedio = sumatoria / tamaño;

        if (sumatoria == 0) {
            JOptionPane.showMessageDialog(null, "No hay vehiculos entre 30 y 50 millones para el año seleccionado",
                    "Promedio Por Año", 0);
        } else {
            JOptionPane.showMessageDialog(null, "El promedio de los autos que costaron entre 30 y 50 millones para"
                    + "el año 2019 es: " + promedio, "Promedio Por Año", 1);
        }

    }

}
