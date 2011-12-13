/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bisnaguete
 */
public class Vez {

    private int contadorAudio;
    private Palavra palavra;
    private String palavraDigitada;
    private boolean palavraConfirmada;

    public Vez(Palavra palavra) {
        contadorAudio = 3;
        palavraDigitada = "";
        this.palavra = palavra;
        palavraConfirmada = false;
    }

    public boolean podeOuvir() {
        return contadorAudio > 0;
    }

    public Palavra getPalavra() {
        return palavra;
    }

    public void adicionarLetra(char letra) {
        this.palavraDigitada += letra;
    }

    public char getUltimoCaractere() {
        return palavraDigitada.length() == 0 ? ' ' : palavraDigitada.charAt(palavraDigitada.length() - 1);
    }

    public boolean verificaGrafia() {
        return palavraDigitada.equalsIgnoreCase(palavra.getGrafia());
    }

    public boolean getPalavraConfirmada() {
        return palavraConfirmada;
    }

    public void setPalavraConfirmada(boolean valor) {
        this.palavraConfirmada = valor;
    }

    public void setPalavra(Palavra palavra) {
        this.palavra = palavra;
    }

    public void ouvirPalavra() {
        palavra.tocarAudio();
    }

    public void decrementarPodeOuvir() {
        contadorAudio--;
    }

    public String getSinonimo() {
        return palavra.getSinonimo();
    }

    String getSignificado() {
        return palavra.getSignificado();
    }

    String getFrase() {
        return palavra.getFrase();
    }
}
