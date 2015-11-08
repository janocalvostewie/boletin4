package boletin4_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin4_1 {
    public static void main(String[] args) {
        
        //INTRODUCCIÓN DE LA CANTIDAD
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca una cantidad:"));
        int cFinal;
        int incremento=0;
        //CONDICIONES
        if(cantidad<500){
            incremento=(int)(cantidad*0.5);
        }
        else if((cantidad>500)&&(cantidad<=1000)){
            incremento=(int)(cantidad*0.07);
        }
        else if ((cantidad>1000)&&(cantidad<=5000)){
            incremento=(int)(cantidad*0.15);
        }
        else if(cantidad>5000){
            incremento=(int)(cantidad*(-0.03));
        }
        else{JOptionPane.showMessageDialog(null, "Algo ha ido mal");}
        
        //RESULTADO POR PANTALLA
        cFinal=cantidad+incremento;
        JOptionPane.showMessageDialog(null, "Cantidad: "+cantidad+"\nIncremento: "+incremento+"\nCantidad final: "+cFinal);
    }
}
