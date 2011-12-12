/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bisnaguete
 */
public class Jogador {
    
    private String nome;
    private boolean daVez;
    private boolean primeiroDaRodada;
    private boolean acertou;

    public boolean getAcertou() {
        return acertou;
    }

    public void setAcertou(boolean acertou) {
        this.acertou = acertou;
    }

    public boolean getDaVez() {
        return daVez;
    }

    public void setDaVez(boolean daVez) {
        this.daVez = daVez;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPrimeiroDaRodada() {
        return primeiroDaRodada;
    }

    public void setPrimeiroDaRodada(boolean primeiroDaRodada) {
        this.primeiroDaRodada = primeiroDaRodada;
    }
    
}
