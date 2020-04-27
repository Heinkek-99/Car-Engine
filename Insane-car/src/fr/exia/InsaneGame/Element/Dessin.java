package fr.exia.InsaneGame.Element;

import fr.exia.InsaneGame.Main;

public class Dessin implements Runnable{

	private final int PAUSE=3;

	@Override
	public void run() {
		while(true) {
			Main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
  }
	
}
