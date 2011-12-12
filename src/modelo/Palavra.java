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
    private String sinonimo;

    public Palavra(String grafia, String significado, String frase, String sinonimo, String pathSom){
        this.frase = frase;
        this.grafia = grafia;
        this.sinonimo = sinonimo;
        this.significado = significado;
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

   public void tocarAudio(){
      tocador.start();
   }

    public String getSinonimo() {
        return sinonimo;
    }

    public void setSinonimo(String sinonimo) {
        this.sinonimo = sinonimo;
    }
    
}
