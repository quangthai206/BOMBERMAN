package sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import uet.oop.bomberman.Game;

public class ItemMusic {
	private AudioInputStream audioInputStream;
	private	Clip clip;
	
	public void playBombItemMusic() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("/music/bomb.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		 } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    }
	}
	
	public void playSpeedItemMusic() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("/music/speed.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		 } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    }
	}
	
	public void playFlameItemMusic() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("/music/flame.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		 } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    }
	}
}
