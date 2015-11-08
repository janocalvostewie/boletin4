
package boletin4_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin4_2 {
    public static void main(String[] args) {
        
        //ENTRADA DE PARÁMETROS
        float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca el precio:"));
        int numVenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de ventas:"));
        float descuento=0;
        float pFinal=0;
        
        //CONDIOCIONES
        if (numVenta<0){
            JOptionPane.showMessageDialog(null, "No puede haber ventas negativas");
        }
        if((numVenta>=100)&&(numVenta<200)){
           if (precio>4000){
               descuento=(float)(precio*0.05);
           }
           else{
               descuento=(float)(precio*0.02);
           }
        }
        if(numVenta>=200){
            if (precio>4000){
               descuento=(float)(precio*0.1);
           }
           else{
               descuento=(float)(precio*0.08);
           }
        }
        
        //MUESTRA DE DATOS
        pFinal=precio-descuento;
        JOptionPane.showMessageDialog(null, "Precio unitario: "+precio+"\nNúmero de ventas: "+numVenta+"\nDescuento: "+descuento+"\nPrecio final: "+pFinal);
        
    }
    
}
