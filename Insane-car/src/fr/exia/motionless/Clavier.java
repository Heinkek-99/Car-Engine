package fr.exia.motionless;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import fr.exia.InsaneGame.Main;
import fr.exia.InsaneGame.Element.*;
public class Clavier implements KeyListener{

	

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		if(Main.scene.voiture.getDetruit()==false) {
			if(Main.scene.voiture.getX()<1024) {
				Main.scene.voiture.setX(Main.scene.voiture.getX()+256);	
			}else {
				
			}
		}
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			if(Main.scene.voiture.getDetruit()==false) {
			if(Main.scene.voiture.getX()>256) {	
				Main.scene.voiture.setX(Main.scene.voiture.getX()-256);
			}else {
				
			}
			}
		}else if(e.getKeyCode()==KeyEvent.VK_UP) {
			if(Main.scene.voiture.getDetruit()==false) {
			if(Main.scene.voiture.getY()>0) {
				Main.scene.voiture.setY(Main.scene.voiture.getY()-256);
			}else {
				
			}
			}
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			if(Main.scene.voiture.getDetruit()==false) {
			if(Main.scene.voiture.getY()<512) {
				Main.scene.voiture.setY(Main.scene.voiture.getY()+256);
			}else {
				
			}
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
