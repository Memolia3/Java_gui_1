package mainPack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	BorderLayout layout = new BorderLayout();
	
	MenuBar menuBar;
	FieldPanel fieldPanel;
	GamePanel gamePanel;
	
	MyKeyListener myKeyListener;
	
	GamePanel(){
		this.setLayout(layout);
		this.setBackground(Color.yellow);
		this.setOpaque(false);
		menuBar = new MenuBar();
		fieldPanel = new FieldPanel();
		this.add(menuBar, BorderLayout.NORTH);
		this.add(fieldPanel, BorderLayout.CENTER);
	}
	
	public void prepareComponents() {
		menuBar.prepareComponents();
		fieldPanel.prepareComponents();
		myKeyListener = new MyKeyListener(this);
	}
	
	private class MyKeyListener implements KeyListener {
		JPanel panel;
		
		MyKeyListener(JPanel p){
			super();
			panel = p;
			panel.addKeyListener(this);
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			//do nothing
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			//do nothing
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_H:
				Main.mainWindow.setFrontScreenAndFocus(ScreenMode.TITLE);
				break;
			}
		}
	}
	
}

