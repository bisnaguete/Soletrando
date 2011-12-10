/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rede;

import br.ufsc.inf.leobr.cliente.Jogada;

/**
 *
 * @author Bisnaguete
 */
public class JogadaSoletrando implements Jogada {
    
    private boolean acertou;
    private boolean confirmouPalavra;
    private char caractere;
    private int vencedor;

    public boolean isAcertou() {
        return acertou;
    }

    public void setAcertou(boolean acertou) {
        this.acertou = acertou;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    public boolean isConfirmouPalavra() {
        return confirmouPalavra;
    }

    public void setConfirmouPalavra(boolean confirmouPalavra) {
        this.confirmouPalavra = confirmouPalavra;
    }

    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }
    
    
}
