/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import gui.InterfaceSoletrando;
import modelo.Contador;
import modelo.Partida;
import rede.AtorNetGames;
import rede.JogadaSoletrando;

/**
 *
 * @author Bisnaguete
 */
public class AtorJogador {

    private InterfaceSoletrando janela;
    private AtorNetGames netGames;
    private Partida partida;
    private Contador contador;

    public static void main(String[] args) {
        new AtorJogador();
    }

    public boolean conectar() {
        boolean exito = false;
        if (!partida.getConectado()) {
            String idUsuario = janela.obterUsuario();
            String servidor = janela.obterServidor();
            
            exito = netGames.conectar(servidor, idUsuario);

            if (exito) {
                partida.setConectado(true);
            }
            netGames.solicitarInicio();
        }
        if(exito) {
            janela.desabilitarConectar();
            janela.habilitarDesistir();
            janela.notificar("Conexão estabelecida com sucesso!");
            return true;
        } else {
            janela.notificar("Conexão falhou!");
            return false;
        }
    }

    public void atualizarContador(int tempo) {
        janela.atualizarContador(tempo);
    }

    public void confirmaPalavra() {
        contador.interromper();
        partida.setConfirmouPalavra();
        boolean acertou = partida.verificarGrafia();
        if(acertou) {
            janela.notificar("Você acertou a palavra!");
        } else {
            janela.notificar("Você errou a palavra!");
        }
        boolean primeiro = partida.isPrimeiroDaRodada();
        if(!primeiro) {
            partida.verificaVencedor();
        }
        enviarJogada();
        janela.iniciarInterfaceEspera();
        janela.limparTela();
        if(!primeiro) {
            int venci = partida.getVencedor();
            if (venci != 0) {
                if(venci == -1) {
                    janela.notificar("Você venceu!");
                } else {
                    janela.notificar("Você perdeu!");
                }
                finalizarJogo();
            }
        }
    }

    public AtorJogador() {
        janela = new InterfaceSoletrando(this);
        netGames = new AtorNetGames(this);
        partida = new Partida();
        contador = new Contador(this);
        janela.setVisible(true);
    }

    public void ouvirPalavra() {
        boolean podeOuvir = partida.ouvirPalavra();
        if(!podeOuvir) {
            janela.notificar("Você já ouviu a palavra 3 vezes!");
        }
    }

    public void receberSolicitacaoDeInicio(int posicao) {
        partida.setPrimeiroDaRodada(posicao);
        String nome = netGames.obterNomeAdversario(posicao);
        partida.setNome(nome);
        if(posicao == 1) {
            nome = netGames.obterNomeAdversario(2);
            janela.setNomeAdversario(nome);
        } else {
            nome = netGames.obterNomeAdversario(1);
            janela.setNomeAdversario(nome);
        }
        partida.setNomeAdversario(nome);
        if(posicao == 1) {
            partida.setContadorRodada(-1);
            iniciarVez();
            contador.start();
            janela.notificar("Sua vez começou!");
        } else {
            partida.setContadorRodada(0);
            janela.iniciarInterfaceEspera();
            janela.notificar("Sua vez de esperar!");
        }
    }

    private void iniciarVez() {
        partida.iniciarVez();
        String sinonimo = partida.getSinonimo();
        String significado = partida.getSignificado();
        String frase = partida.getFrase();
        janela.iniciarInterfaceJogador(sinonimo, significado, frase);
        
    }

    public void finalizarJogo() {
        boolean exito = netGames.desconectar();
        if(exito) {
            partida.setConectado(false);
            janela.desabilitarControles();
            janela.limparTela();
        } else {
            janela.notificar("Não foi possível finalizar o jogo!");
        }
    }

    public void digitarLetra(char letra) {
        partida.adicionarLetra(letra);
        enviarJogada();
    }

    private void enviarJogada() {
        JogadaSoletrando jogada = instanciarJogada();
        netGames.enviarJogada(jogada);
    }

    private JogadaSoletrando instanciarJogada() {
        return partida.instanciarJogada();
    }
    
    public void desistir() {
        finalizarJogo();
    }

    public void receberJogada(JogadaSoletrando jogada) {
        boolean confirmou = jogada.isConfirmouPalavra();
        if(!confirmou) {
            char caractere = jogada.getCaractere();
            janela.addCaractereOponente(caractere);
            
        } else {
            int vencedor = jogada.getVencedor();
            if(vencedor == 0) {
                iniciarVez();
                contador.start();
            } else {
                if(vencedor == 1) {
                    janela.notificar("Voce vendeu!");
                } else {
                    janela.notificar("Você perdeu!");
                }
                finalizarJogo();
            }
        }
    }
}
