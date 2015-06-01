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
public class CalculadoraCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modelo mod = new Modelo();
     
        String num1 = JOptionPane.showInputDialog("Itroduzca el primer operando:");
        String num2  =JOptionPane.showInputDialog("Introduzca el segunda operando:");
        
        mod.setNum1(Float.parseFloat(num1));
        mod.setNum2(Float.parseFloat(num2));
        String op = JOptionPane.showInputDialog("Introduzca la operacion que desea realizar: \n suma | resta | multiplicacion | division");
        
        if ( op.equals("suma")){
        
            mod.setOperacion("suma");

        
        }else if( op.equals("resta")){
        
            mod.setOperacion("resta");

        
        }else if(op.equals("multiplicacion")){

            mod.setOperacion("multiplicacion");

        
        }else if (op.equals("division")){

             mod.setOperacion("division");
        
        }else{
        
            JOptionPane.showMessageDialog(null, "Introduzca solo: \n suma | resta | multiplicacion | division");
            
        }
        

        
        realizaOperacion(mod);
        Vista.imprimir(mod);
        
    }
    
    public static double realizaOperacion(Modelo cont){
    
        
        if ( cont.operacion.equals("suma")){
        
            cont.resultado = cont.num1 + cont.num2;
            return cont.resultado;
        
        }else if( cont.operacion.equals("resta")){
        
            cont.resultado = cont.num1 - cont.num2;
            return cont.resultado;

        }else if(cont.operacion.equals("multiplicacion")){
        
            cont.resultado = cont.num1 * cont.num2;
            return cont.resultado;
        
        }else if (cont.operacion.equals("division")){
        
            cont.resultado = cont.num1 / cont.num2;
            return cont.resultado;

        }else{
        
            JOptionPane.showMessageDialog(null, "Introduzca solo: \n suma | resta | multiplicacion | division");
            return cont.resultado =0;
        }
    
        
    }
    
}
