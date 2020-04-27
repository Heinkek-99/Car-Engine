package fr.exia.InsaneGame.Element;

import java.awt.Image;

import javax.swing.ImageIcon;

import fr.exia.InsaneGame.Main;

public class Obstacle implements Runnable{
	private int x,y;
	private final int PAUSE=1000;
	private ImageIcon icoObstacle;
	private Image imgObstacle;
	private boolean deplacable;
	public Obstacle(int x,int y) {
		this.x=x;
		this.y=y;
		icoObstacle=new ImageIcon(getClass().getResource("/images/Obstacle.jpg"));
		imgObstacle= icoObstacle.getImage();
		this.deplacable=false;
		
	}
//****GETTERS****//
	public int getX() {
		int positionsX[]= {256,512,768,1024};
		int i=(int)(Math.random()*4);
		if(this.y<0) {
		this.x=positionsX[i];
		return x;
		}else {
			return x;
		}
		
	}
	public int getY() {
		if(Main.scene.voiture.getDetruit()==false) {
		if(this.y==768 || (this.y <768 && this.y>=0)) {
			y=y-1;
			return y;
		}else if(y<0){
			
			int positionsY[]={256,512,768};
			
			int j=(int)(Math.random()*3);
			y=768;
			return y;
		}else {
		return y;
		}	
		}else {
			y=y-256;
			return y;
		}
		}
	
	public ImageIcon getIcoObstacle() {
		return icoObstacle;
	}
	public Image getImgObstacle() {
		return imgObstacle;
	}
	
	public boolean getDeplacable() {
		return deplacable;
	}
	
	//****SETTERS****//
	public void setY(int y) {
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setIcoObstacle(ImageIcon icoObstacle) {
		this.icoObstacle = icoObstacle;
	}
	public void setDeplacable(boolean deplacable) {
		this.deplacable = deplacable;
	}
	public void setImgObstacle(Image imgObstacle) {
		this.imgObstacle = imgObstacle;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			this.getY();
			this.getX();
		try {
			Thread.sleep(PAUSE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	}
}

