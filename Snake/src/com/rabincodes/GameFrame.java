package com.rabincodes;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
		this.add(new GamePanel());//getting rid of instanc and this will work the same
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); // is actually going to take our JFrame and fit it snugly around all of the components that we add to the frame
		this .setVisible(true);
		this .setLocationRelativeTo(null);//window to appear in the middle of the screen
	}
}
