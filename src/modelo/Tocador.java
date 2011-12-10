package modelo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Tocador extends Thread {

    private File mp3;
    private Player player;

    public Tocador(String path) {
        this.mp3 = new File(path);
    }

    @Override
    public void run() {
        try {
            FileInputStream fis = new FileInputStream(mp3);
            BufferedInputStream bis = new BufferedInputStream(fis);
            this.player = new Player(bis);
            System.out.println("Tocando!");
            this.player.play();
            System.out.println("Terminado!");
        } catch (Exception e) {
            System.out.println("Problema ao tocar " + mp3);
            e.printStackTrace();
        }
    }
}
