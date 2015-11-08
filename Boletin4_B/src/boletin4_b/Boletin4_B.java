package boletin4_b;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin4_B {

    public static void main(String[] args) {
        //Primer Objeto
        Consumo primerConsumo= new Consumo();
        primerConsumo.setLitros(50);
        primerConsumo.setpGas(1.57F);
        
        //Segundo objeto
        Consumo segundoConsumo= new Consumo(Float.parseFloat(JOptionPane.showInputDialog("Teclea los kilómetros:")),Float.parseFloat(JOptionPane.showInputDialog("Teclea los litros:")),Float.parseFloat(JOptionPane.showInputDialog("Teclea la velocidad:")), Float.parseFloat(JOptionPane.showInputDialog("Teclea el precio: ")));
        JOptionPane.showMessageDialog(null, "El consumo medio del 2º es : "+segundoConsumo.consumoMedio());
        segundoConsumo.setLitros(90);
        JOptionPane.showMessageDialog(null, "La velocidad media del 2º es : "+segundoConsumo.getvMed());
    }
    
}
