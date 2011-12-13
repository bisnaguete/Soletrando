/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import rede.JogadaSoletrando;

/**
 *
 * @author Bisnaguete
 */
public class Partida {

    private Jogador jogadorEu;
    private Jogador jogadorOponente;
    private boolean conectado;
    private Nivel nivelAtual;
    private Vez vez;
    private int contadorRodada;
    private int vencedor;

    public Partida() {
        jogadorEu = new Jogador();
        jogadorOponente = new Jogador();
        conectado = false;
        nivelAtual = new Nivel(1);
        vez = new Vez(null);
    }

    public boolean ouvirPalavra() {
        boolean podeOuvir = vez.podeOuvir();
        if(podeOuvir) {
            vez.ouvirPalavra();
            vez.decrementarPodeOuvir();
        }
        return podeOuvir;
    }
    
    public void adicionarLetra(char letra) {
        vez.adicionarLetra(letra);
    }
    
    public boolean verificarGrafia() {
        return vez.verificaGrafia();
    }
    
    public boolean isPrimeiroDaRodada() {
        return jogadorEu.isPrimeiroDaRodada();
    }
    
    public boolean comparaEstadoJogadores() {
        return jogadorEu.getAcertou() == jogadorOponente.getAcertou();
    }
    
    public void verificaVencedor() {
        if(comparaEstadoJogadores()) {
            setVencedor(0);
        } else {
            if(jogadorEu.getAcertou()) {
                setVencedor(-1);
            } else { 
                setVencedor(1);
            }        
        }
    }
    
    public void iniciarVez(){
        incrementarContadorRodada();
        if(contadorRodada > 10) {
            proximoNivel();
            if(isPrimeiroDaRodada()) {
                setContadorRodada(1);
            } else {
                setContadorRodada(2);
            }
        }
        Palavra palavra = getProximaPalavra();
        setVez(new Vez(palavra));
    }
    
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
    
    //REVISAR : Diagrama de sequencia, como atribuir o contadorRodda = 1?
    public Palavra getProximaPalavra() {
        return nivelAtual.getPalavra(contadorRodada);
    }

    public void setNome(String nome) {
        jogadorEu.setNome(nome);
    }
    
    public void setNomeAdversario(String nome) {
        jogadorOponente.setNome(nome);
    }

    private void incrementarContadorRodada() {
        contadorRodada = contadorRodada+2;
    }

    private void proximoNivel() {
        nivelAtual = new Nivel(nivelAtual.getNivel()+1);
    }

    public int getContadorRodada() {
        return contadorRodada;
    }

    public void setContadorRodada(int contadorRodada) {
        this.contadorRodada = contadorRodada;
    }

    public void setVez(Vez vez) {
        this.vez = vez;
    }

    public JogadaSoletrando instanciarJogada() {
        JogadaSoletrando jogada = new JogadaSoletrando();
        jogada.setAcertou(jogadorEu.getAcertou());
        jogada.setConfirmouPalavra(vez.getPalavraConfirmada());
        jogada.setCaractere(vez.getUltimoCaractere());
        jogada.setVencedor(getVencedor());
        return jogada;
    }

    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }

    public String getSinonimo() {
        return vez.getSinonimo();
    }

    public String getSignificado() {
        return vez.getSignificado();
    }

    public String getFrase() {
        return vez.getFrase();
    }

    public void setAcertouOponente(boolean acertou) {
        jogadorOponente.setAcertou(acertou);
    }

    public void setAcerteiPalavra(boolean acertou) {
        jogadorEu.setAcertou(acertou);
    }
    
    public String getNivelAtual() {
        return String.valueOf(nivelAtual.getNivel());
    }
    
    public String getRodadaAtual() {
        return String.valueOf(contadorRodada);
    }
}
