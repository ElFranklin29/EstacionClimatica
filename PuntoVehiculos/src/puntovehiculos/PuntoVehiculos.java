package puntovehiculos;

import javax.swing.JOptionPane;

public class PuntoVehiculos {

    public PuntoVehiculos() {

    }

    public void menuPrincipal(Precio precio) {

        int opc = 0;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n\n"
                    + "1. Ver lista de autos\n"
                    + "2. Autos mas baratos de cada año\n"
                    + "3. Promedio\n\n"
                    + "4. Salir"));

            switch (opc) {
                case 1:
                    precio.leerPrecio();
                    break;
                case 2:
                    precio.precioMenor();
                    break;

            }

        } while (opc != 4);

    }

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        v.ingresarVehiculos();

    }

}
