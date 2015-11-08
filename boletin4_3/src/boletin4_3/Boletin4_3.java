package boletin4_3;

import javax.swing.JOptionPane;
/**
 *
 * @author Jano
 */
public class Boletin4_3 {
    public static void main(String[] args) {
          //ENTRADA DE PARÁMETROS
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de mes:"));
       
        
        //CONDIOCIONES
        if (mes == 2){
            JOptionPane.showMessageDialog(null, "El mes es especial, tiene 28 días");
        }
        
        else if ((mes%2)==0){
            JOptionPane.showMessageDialog(null, "El mes tiene 30 días");
        }
        else if((mes%2)!=0){
               JOptionPane.showMessageDialog(null, "El mes tiene 31 días");
        }
        
        
    }
    
}
