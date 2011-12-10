/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import gui.InterfaceSoletrando;

/**
 *
 * @author Bisnaguete
 */
public class AtorJogador {
    
    InterfaceSoletrando janela;
    
    public static void main(String[] args) {
        new AtorJogador();
    }
    
    public void atualizarContador(int tempo) {
        
    }

    public void confirmaPalavra() {
        
    }
    
    public AtorJogador() {
        janela = new InterfaceSoletrando(this);
        janela.setVisible(true);
    }
}
