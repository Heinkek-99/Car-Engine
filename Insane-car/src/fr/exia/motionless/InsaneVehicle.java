package fr.exia.motionless;

import java.awt.Image;

import javax.swing.ImageIcon;

import fr.exia.InsaneGame.Element.Obstacle;

public class InsaneVehicle {

	private int x,y;
	private ImageIcon icoVehicle;
	private Image imgVehicle;
	private boolean detruit;
	private ImageIcon icoVehicleDetruit;	
	private Image imgVehicleDetruit;
	//****CONSTRUCTEUR****//
	public InsaneVehicle(int x,int y) {
		this.x=x;
		this.y=y;
		this.detruit=false;
		this.icoVehicle=new ImageIcon(getClass().getResource("/images/MyVehicle.png"));
		this.imgVehicle=icoVehicle.getImage();
		this.icoVehicleDetruit=new ImageIcon(getClass().getResource("/images/vehicule_death.png"));
		this.imgVehicleDetruit=icoVehicleDetruit.getImage();
	}
	
	//****GETTERS****//
	public int getX() {
		return x;
	}
	public Image getImgVehicle() {
		return imgVehicle;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean getDetruit() {
		return detruit;
	}
	public Image getImgVehicleDetruit() {
		return imgVehicleDetruit;
	}
	//****SETTERS****//
	public void setDetruit(boolean detruit) {
		this.detruit = detruit;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	//****METHODES****//
	public boolean contact(Obstacle obstacle) {
		if((this.y<=obstacle.getY()&& this.y+256>obstacle.getY())  && (this.x<=obstacle.getX() && this.x+256>obstacle.getX())) {
			this.detruit=true;
			return true;
		}else {
			return false;
		}
	}
	
}
