package fr.exia.InsaneGame.Element;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import fr.exia.motionless.Clavier;
import fr.exia.motionless.InsaneVehicle;

public class Scene extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static ImageIcon icoditchleft;
public static Image imgditchleft;
public static ImageIcon icomacadam;
public static Image imgmacadam;
public static ImageIcon icoditchright;
public static Image imgditchright;
public Obstacle obstacle1;
public Obstacle obstacle2;
public Obstacle obstacle3;
public InsaneVehicle voiture;

	//****CONSTRUCTEUR****//
	public Scene() {
		this.setBackground(Color.WHITE);
		int positionsX[]= {256,512,768,1024};
		int i=(int)(Math.random()*4);
		int j=(int)(Math.random()*4);
		int k=(int)(Math.random()*4);
	voiture=new InsaneVehicle(768,0);
	obstacle1=new Obstacle(positionsX[i],768);
	obstacle2=new Obstacle(positionsX[j],768);
	obstacle3=new Obstacle(positionsX[k],768);
	this.setFocusable(true);
	this.requestFocusInWindow(true);
	this.addKeyListener(new Clavier());
	Thread dessin=new Thread(new Dessin());
	dessin.start();
	
	
	}
	
	//****METHODES****//
	public void paintComponent(Graphics g) {
		icoditchleft=new ImageIcon(getClass().getResource("/images/DitchLeft.jpg"));
		imgditchleft=icoditchleft.getImage();
		icomacadam=new ImageIcon(getClass().getResource("/images/Macadam.jpg"));
		imgmacadam=icomacadam.getImage();
		icoditchright=new ImageIcon(getClass().getResource("/images/DitchRight.jpg"));
		imgditchright=icoditchright.getImage();
		Graphics2D g2 = (Graphics2D)g;//on passe aux graphiques 2D
		g2.drawImage(imgditchleft,0,0, null);
		g2.drawImage(imgditchleft,0,256, null);
		g2.drawImage(imgditchleft,0,512, null);
		g2.drawImage(imgditchleft,0,768, null);
		g2.drawImage(imgmacadam,256,0, null);
		g2.drawImage(imgmacadam,256,256, null);
		g2.drawImage(imgmacadam,256,512, null);
		g2.drawImage(imgmacadam,512,0, null);
		g2.drawImage(imgmacadam,512,256, null);
		g2.drawImage(imgmacadam,512,512, null);
		g2.drawImage(imgmacadam,768,0, null);
		g2.drawImage(imgmacadam,768,256, null);
		g2.drawImage(imgmacadam,768,512, null);
		g2.drawImage(imgmacadam,1024,0, null);
		g2.drawImage(imgmacadam,1024,256, null);
		g2.drawImage(imgmacadam,1024,512, null);
		g2.drawImage(imgmacadam,256,768, null);
		g2.drawImage(imgmacadam,512,768, null);
		g2.drawImage(imgmacadam,768,768, null);
		g2.drawImage(imgmacadam,1024,768, null);
		g2.drawImage(imgditchright,1280,0, null);
		g2.drawImage(imgditchright,1280,256, null);
		g2.drawImage(imgditchright,1280,512, null);
		g2.drawImage(imgditchright,1280,768, null);
		if(voiture.contact(obstacle1) || voiture.contact(obstacle2) || voiture.contact(obstacle3) || voiture.getDetruit()==true) {
			g2.drawImage(this.voiture.getImgVehicleDetruit(), voiture.getX(), voiture.getY(),null);
		}else {
		g2.drawImage(this.voiture.getImgVehicle(), voiture.getX(), voiture.getY(),null);
		}
		
		if(obstacle1.getDeplacable()==false) {
		g2.drawImage(this.obstacle1.getImgObstacle(),this.obstacle1.getX(),this.obstacle1.getY(),null);
		}else {
			g2.drawImage(this.obstacle1.getImgObstacle(),this.obstacle1.getX(),this.obstacle1.getY(),null);
		}
		
		if(obstacle2.getDeplacable()==false) {
			g2.drawImage(this.obstacle2.getImgObstacle(),this.obstacle2.getX(),this.obstacle2.getY(),null);
			}else {
				g2.drawImage(this.obstacle2.getImgObstacle(),this.obstacle2.getX(),this.obstacle2.getY(),null);
			}
		
		if(obstacle3.getDeplacable()==false) {
			g2.drawImage(this.obstacle3.getImgObstacle(),this.obstacle3.getX(),this.obstacle3.getY(),null);
			}else {
				g2.drawImage(this.obstacle3.getImgObstacle(),this.obstacle3.getX(),this.obstacle3.getY(),null);
			}
	}
	
}
