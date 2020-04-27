package fr.exia.InsaneGame;

import javax.swing.JFrame;

import fr.exia.InsaneGame.Element.Scene;



public class Main {

	public static Scene scene;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame fenetre = new JFrame("Insane Vehicule");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1530,1024);
		//fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		//creation de la scene
		scene=new Scene();
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);
		
	}

}
