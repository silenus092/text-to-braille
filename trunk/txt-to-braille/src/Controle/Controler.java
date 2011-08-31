/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

/**
 *
 * @author Heitor
 */
public class Controler {


    // A classe controler vai controlar o fluxo de
    //palavras que serão enviadas para o dispositivo
    private String str[] = null;
    int inicial, terminal;
    
    public Controler(String tenta){
        str = tenta.split(" ");
        inicial = terminal = 0;
    }

    //private


}
