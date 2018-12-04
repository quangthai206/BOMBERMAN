package sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import uet.oop.bomberman.Game;

public class BackMusic {
	private AudioInputStream audioInputStream;
	private	Clip clip;
	
	public void playBackOddMusic() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("/music/back1.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		 } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    }
	}
	
	public void playBackEvenMusic() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("/music/back2.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		 } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    }
	}
	
	public void playEndMusic() {
		try {
			clip.stop();
			audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("/music/gameover.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		 } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    }
	}
	
	public void playCompleteMusic() {
		try {
			clip.stop();
			audioInputStream = AudioSystem.getAudioInputStream(Game.class.getResource("/music/complete.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			
		 } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    }
	}
	
	public void stop() {
		clip.stop();
	}
	
}
