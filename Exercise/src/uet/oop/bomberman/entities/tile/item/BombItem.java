package uet.oop.bomberman.entities.tile.item;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import sound.ItemMusic;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;

public class BombItem extends Item {
	private ItemMusic itemMusic = new ItemMusic();
	
	public BombItem(int x, int y, int level, Sprite sprite) {
		super(x, y, level, sprite);
	}

	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý Bomber ăn Item
		if(e instanceof Bomber) {
			itemMusic.playBombItemMusic();
			((Bomber) e).addItem(this);
			remove();
			return true;
		}
		return false;
	}

	@Override
	public void setValues() {
		// TODO Auto-generated method stub
		_active = true;
		Game.addBombRate(1);
	}
	


}
