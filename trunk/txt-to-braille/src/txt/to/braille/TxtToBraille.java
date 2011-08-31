/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package txt.to.braille;

import Modelo.caracter;
import Modelo.converte_Caracter;

/**
 *
 * @author Heitor
 */
public class TxtToBraille {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println (System.getProperty ("java.library.path"));
        //OperandoMotor vai=new OperandoMotor();
        //vai.desloca_Motor_Mesa();
        //System.out.println(Character.toLowerCase('P'));
        caracter ai=new caracter();
        converte_Caracter oi=new converte_Caracter();
        ai=oi.ativa_colunas('a');
        System.out.println(ai.toString());
    }
}
