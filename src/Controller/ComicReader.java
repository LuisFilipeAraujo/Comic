/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import jaco.mp3.player.MP3Player;
import java.io.File;
import view.TelaInicial;

/**
 *
 * @author Luis Araujo
 */
public class ComicReader {

    public static TelaInicial tela_ini = new TelaInicial();
    public static final String musica = "D:\\1_2_sem\\POO-sostenes\\ComicReader\\dontmean.mp3";
     MP3Player mp3player = new MP3Player(new File(musica));
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tela_ini.setVisible(true);
        

    }
    
    public static void PlayMP3(){
      
        MP3Player mp3player = new MP3Player();
        mp3player.play();
        
    }
    
    public static void PauseMP3(){
        
        MP3Player pauseMP3 = new MP3Player();
        pauseMP3.pause();
        
    }
    
    public static void RepeatMP3(){
        MP3Player mp3player = new MP3Player(new File(musica));
        mp3player.setRepeat(true);
        
    }

    public static TelaInicial getTela_ini() {
        return tela_ini;
    }

    public static void setTela_ini(TelaInicial tela_ini) {
        ComicReader.tela_ini = tela_ini;
    }
}
