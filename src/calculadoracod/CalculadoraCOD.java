/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoracod;

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
        
        
        
        
        
    }
    
    public float realizaOperacion(Modelo cont){
    
        float resultado=0;
        
        if ( cont.operacion.equals("suma")){
        
            cont.resultado = cont.num1 + cont.num2;
        
        }else if( cont.operacion.equals("resta")){
        
        
        }else if(cont.operacion.equals("multiplicacion")){
        
        
        }else if (cont.operacion.equals("division")){
        
        
        }
        
        
    
        return resultado;
    }
    
}
