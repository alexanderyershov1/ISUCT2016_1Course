package SYP.BeatBox;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by maxim-mac on 18/03/2017.
 */
public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Успешно получили синтезатор");
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
    }

    public static void main(String[]args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
