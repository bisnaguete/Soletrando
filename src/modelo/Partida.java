/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bisnaguete
 */
public class Partida {

    private Jogador jogadorEu;
    private Jogador jogadorOponente;
    private boolean partidaEmAndamento;
    private boolean conectado;
    private Nivel nivelAtual;
    private Vez vez;
    private int contadorRodada;

    public boolean getPartidaEmAndamento() {
        return partidaEmAndamento;
    }

    public void setPartidaEmAndamento(boolean valor) {
        this.partidaEmAndamento = valor;
    }

    public void ouvirPalavra() {
        if (vez.podeOuvir()) {
            vez.getPalavra().TocarAudio();
        }
    }
    
    public void adicionarLetra(char letra) {
        vez.adicionarLetra(letra);
    }
    
    public boolean verificarGrafia() {
        return vez.verificarGrafia();
    }
    
    public boolean isPrimeiroDaRodada() {
        return jogadorEu.isPrimeiroDaRodada();
    }
    
    public boolean comparaEstadoJogadores() {
        return jogadorEu.isAcertou() == jogadorOponente.isAcertou();
    }
    
    public int verificaVencedor() {
        if(jogadorEu.isAcertou() && !jogadorOponente.isAcertou())
            return -1;
        if(!jogadorEu.isAcertou() && jogadorOponente.isAcertou())
            return 1;
        return 0;
    }
    
//    public boolean isDaVez() {
//        return jogadorEu.isDaVez();
//    }
//    
//    public boolean setDaVez(boolean daVez) {
//        return jogadorEu.setDaVez(daVez);
//    }
    
    public void setConfirmouPalavra() {
        vez.setPalavraConfirmada(true);
    }
    
    public boolean getConectado() {
        return conectado;
    }
    
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    
    public void setPrimeiroDaRodada(int posicao) {
        if(posicao == 1)
            jogadorEu.setPrimeiroDaRodada(true);
        else
            jogadorEu.setPrimeiroDaRodada(false);
    }
    
    public Palavra getProximaPalavra() {
        return nivelAtual.getPalavra(contadorRodada);
    }
}
