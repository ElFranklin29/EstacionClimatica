package ejercicioguia2;

import javax.swing.JOptionPane;

public class Enteros {

    private int enteros[];
    private int cantidadEnteros;

    public Enteros(int[] enteros, int cantidadEnteros) {
        this.enteros = enteros;
        this.cantidadEnteros = cantidadEnteros;
    }
    
    public Enteros() {
        
        this.cantidadEnteros = 0;
    }

    public int getCantidadEnteros() {
        return cantidadEnteros;
    }

    public void setCantidadEnteros(int cantidadEnteros) {
        this.cantidadEnteros = cantidadEnteros;
    }

    public int[] getEnteros() {
        return enteros;
    }

    public void setEnteros(int[] enteros) {
        this.enteros = enteros;
    }

    public void llenarArreglo() {
        
        int contador=1;
        setCantidadEnteros(Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos enteros quiere ingresar?"
                , "Cantidad Enteros", 1)));
        
        enteros= new int[getCantidadEnteros()];
        
        for (int i = 0; i < enteros.length; i++) {
            enteros[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el entero "+(contador++), "LLenar Arreglo", 1));
        
        }
        setEnteros(enteros);
    }

}
