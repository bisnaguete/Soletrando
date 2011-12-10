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
        contadorAudio = 0;
        palavraDigitada = "";
        this.palavra = palavra;
        palavraConfirmada = false;
    }
    
    public boolean podeOuvir() {
        return contadorAudio < 3;
    }
    
    public Palavra getPalavra() {
        return palavra;
    }
    
    public void adicionarLetra(char letra) {
        this.palavraDigitada += letra;
    }
    
    public char getUltimoCaractere() {
        return palavraDigitada.charAt(palavraDigitada.length()-1);
    }
    
    public boolean verificarGrafia() {
        return palavraDigitada.equalsIgnoreCase(palavra.getGrafia());
    }
    
    public boolean getPalavraConfirmada() {
        return palavraConfirmada;
    }
    
    public void setPalavraConfirmada(boolean valor) {
        this.palavraConfirmada = valor;
    }
}
