package ejercicioguia2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Caracteres {

    private String matriz[][];
    private int col, fil;

    public Caracteres(String[][] matriz, int col, int fil) {
        this.matriz = matriz;
        this.col = col;
        this.fil = fil;
    }

    public Caracteres() {
        this.col = 0;
        this.fil = 0;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getFil() {
        return fil;
    }

    public void setFil(int fil) {
        this.fil = fil;
    }

    public void llenarMatriz() {
        setFil(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de filas",
                 "Numero Filas", 1)));
        setCol(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de columnas",
                 "Numero Columnas", 1)));
        
        matriz=new String[getFil()][getCol()];
        
        for (int i = 0; i <getFil() ; i++) {
            for (int j = 0; j < getCol(); j++) {
                matriz[i][j]= JOptionPane.showInputDialog(null, "Ingrese el dato para la posicion "
                        +i+" "+j, "Llenar Matriz", 1);
            }
        }
        
        setMatriz(matriz);
        
       
    }
}
