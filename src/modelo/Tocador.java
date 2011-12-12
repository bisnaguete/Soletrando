package modelo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Tocador extends Thread {

    private Player player;

    public Tocador(String path) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File(path));
            BufferedInputStream bis = new BufferedInputStream(fis);
            this.player = new Player(bis);
        } catch (JavaLayerException ex) {
            Logger.getLogger(Tocador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tocador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Tocador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {
        try {
            this.player.play();
        } catch (JavaLayerException ex) {
            Logger.getLogger(Tocador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
