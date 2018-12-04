package uet.oop.bomberman.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Tiếp nhận và xử lý các sự kiện nhập từ bàn phím
 */
public class Keyboard implements KeyListener {
	
	private boolean[] keys = new boolean[120]; //120 is enough to this game
	public boolean up, down, left, right, enter, A, S, D, W, space;
	
	public void update() {
                up = keys[KeyEvent.VK_UP];
		W =  keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_DOWN];
		S = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_LEFT];
		A = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_RIGHT];
		D = keys[KeyEvent.VK_D];
		space = keys[KeyEvent.VK_SPACE];
		enter = keys[KeyEvent.VK_ENTER];
                boolean kt=keys[KeyEvent.VK_F5];
                if(kt)
                {
                    
                }
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		
	}

}
