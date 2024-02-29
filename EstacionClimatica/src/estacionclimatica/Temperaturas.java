package estacionclimatica;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Temperaturas {

    private float tempMaxima[][];
    private float tempMinima[][];
    private int paresTemp;
    private String dias[];
    private String matrizGeneral[][];
    //private float calcularTemp[];
    private String calcularDia[];

    public Temperaturas(float[][] tempMaxima, float[][] tempMinima, int paresTemp, String[] dias, String[][] matrizGeneral, 
            float[] calcularTemp, String[] calcularDia) {
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.paresTemp = paresTemp;
        this.dias = dias;
        this.matrizGeneral = matrizGeneral;
        //this.calcularTemp = calcularTemp;
        this.calcularDia = calcularDia;
    }

    public Temperaturas() {

    }
/*
    public float[] getCalcularTemp() {
        return calcularTemp;
    }

    public void setCalcularTemp(float[] calcularTemp) {
        this.calcularTemp = calcularTemp;
    }
*/
    public String[] getCalcularDia() {
        return calcularDia;
    }

    public void setCalcularDia(String[] calcularDia) {
        this.calcularDia = calcularDia;
    }

    public String[][] getMatrizGeneral() {
        return matrizGeneral;
    }

    public void setMatrizGeneral(String[][] matrizGeneral) {
        this.matrizGeneral = matrizGeneral;
    }

    public String[] getDias() {
        return dias;
    }

    public void setDias(String[] dias) {
        this.dias = dias;
    }

    public float[][] getTempMaxima() {
        return tempMaxima;
    }

    public void setTempMaxima(float[][] tempMaxima) {
        this.tempMaxima = tempMaxima;
    }

    public float[][] getTempMinima() {
        return tempMinima;
    }

    public void setTempMinima(float[][] tempMinima) {
        this.tempMinima = tempMinima;
    }

    public int getParesTemp() {
        return paresTemp;
    }

    public void setParesTemp(int paresTemp) {
        this.paresTemp = paresTemp;
    }

    public void llenarMatriz() {
        setParesTemp(Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos pares de temperaturas diarias desea ingresar?",
                "Pares de Temperaturas", 1)));

        dias = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        tempMinima = new float[getParesTemp()][7];
        tempMaxima = new float[getParesTemp()][7];

        for (int i = 0; i < getParesTemp(); i++) {
            for (int j = 0; j < 7; j++) {
                tempMinima[i][j] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la temperatura minima del"
                        + " dia " + dias[j] + ", para el par " + (i + 1), "Temperaturas Minimas", 1));
            }
        }

        for (int i = 0; i < getParesTemp(); i++) {
            for (int j = 0; j < 7; j++) {
                tempMaxima[i][j] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la temperatura maxima para"
                        + "el dia " + dias[j] + ", par " + (i + 1), "Temperaturas Maximas", 1));
            }
        }

    }

    public void matrizGeneral() {

        matrizGeneral = new String[getParesTemp()][7];

        for (int i = 0; i < getParesTemp(); i++) {
            for (int j = 0; j < 7; j++) {
                matrizGeneral[i][j] = ("Min" + Float.toString(tempMinima[i][j])) + " - " + ("Max" + Float.toString(tempMaxima[i][j]));
            }
        }

    }
    
    //Metodo para calcular dia y temperatura, cuyas temperaturas máximas estén entre 15 y 20 grados
    public void calcularTemperaturas(){
        String calcularTemp[];
        calcularTemp= new String[tempMaxima.length];
        
        for (int i = 0; i < getParesTemp(); i++) {
            for (int j = 0; j < 7; j++) {
                if (tempMaxima[i][j]>=15&&tempMaxima[i][j]<=20) {
                    calcularTemp[i]=dias[i]+""+Float.toHexString(tempMaxima[i][j]);
                }
            }
        }
        
        
        System.out.println(Arrays.toString(calcularTemp));
    }

}
