/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int noBoletins = 17;
        float probasTeoricas, probaPractica, boletins, notaTotal;
        do {
            float pt1 = Float.parseFloat(JOptionPane.showInputDialog("Nota da proba teorica 1: "));
            float pt2 = Float.parseFloat(JOptionPane.showInputDialog("Nota da proba teorica 2: "));
            probasTeoricas = (float) (((pt1 + pt2) / 2) * 0.4);
            float pp = Float.parseFloat(JOptionPane.showInputDialog("Nota da proba practica: "));
            probaPractica = (float) (pp * 0.4);
            float nBol = Float.parseFloat(JOptionPane.showInputDialog("Boletines Realizados "));
            boletins = 0;
            if (nBol > 9) {
                boletins = 2;
            }
            if (nBol <= 9 && nBol >= 7) {
                boletins = 1;
            }
            notaTotal = probasTeoricas + probaPractica + boletins;
            JOptionPane.showMessageDialog(null, "Probas practicas: " + probasTeoricas
                    + "/4\nProba practica: " + probaPractica + "/4\nBoletins: " + boletins
                    + "/2\nNota Final: " + notaTotal);
        } while (JOptionPane.showConfirmDialog(null, "Calcular otra nota?") == JOptionPane.YES_OPTION);
    }

}
