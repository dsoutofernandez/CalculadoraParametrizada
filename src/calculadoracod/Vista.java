/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoracod;

import javax.swing.JOptionPane;

/**
 *
 * @author dsoutofernandez
 */
public class Vista {

    
    public static void imprimir(Modelo cont){
    
        JOptionPane.showMessageDialog(null, "El resultado es: " + cont.resultado);
    
    }
    
    
    
}
