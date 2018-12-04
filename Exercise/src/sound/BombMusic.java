package sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import uet.oop.bomberman.Game;

public class BombMusic {
	private AudioInputStream audioInputStream;
	private	Clip clip;
	
	public void playExplodeMusic() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("/music/explosion.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		 } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    }
	}
	
	public void playPlantBombMusic() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("/music/bombplant.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		 } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    }
	}
}
