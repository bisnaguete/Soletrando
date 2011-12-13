/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controle.AtorJogador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bisnaguete
 */
public class Contador extends Thread {

    private AtorJogador controle;
    private boolean interromper;
    private int tempo;

    public Contador(AtorJogador controle) {
        this.controle = controle;
    }

    public void run() {
        interromper = false;
        tempo = 60;
        while (!interromper) {
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (tempo > 0) {
                tempo--;
                controle.atualizarContador(tempo);
            } else {
                controle.confirmarPalavra();
                interromper();
            }
        }
    }
    
    public void interromper() {
        interromper = true;
    }
}
