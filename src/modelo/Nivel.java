/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Bisnaguete
 */
public class Nivel {
    private ArrayList<Palavra> palavras;
    private int nivel;
    
    public int getNivel(){
        return nivel;
    }
    
    public Palavra getPalavra(int posicao) {
        return palavras.get(posicao);
    }
}
