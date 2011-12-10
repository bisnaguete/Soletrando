/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bisnaguete
 */
class Palavra {
    
    private String grafia;
    private String significado;
    private String frase;
    private String pathSom;
    private Tocador tocador;

    public Palavra(String pathSom){
        this.pathSom = pathSom;
        tocador = new Tocador(pathSom);
    }
    public String getGrafia() {
        return grafia;
    }

    public String getFrase() {
        return frase;
    }

    public String getPathSom() {
        return pathSom;
    }

    public String getSignificado() {
        return significado;
    }

   public void TocarAudio(){
      tocador.start();
   }
    
    
}
