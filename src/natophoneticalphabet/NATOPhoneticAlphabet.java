/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natophoneticalphabet;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author jakkarinwebmaster
 */
public class NATOPhoneticAlphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            char[] charArray = args[0].toUpperCase().toCharArray();
            for(char x : charArray)
                playSound(x);
        } catch(ArrayIndexOutOfBoundsException e) {
            
        }
    }
    
    public static void playSound(char fileName) {
        File sound = new File("sounds/" + fileName + ".wav");
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch(LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            
        } catch (InterruptedException ex) {
            
        }
    }
    
}
