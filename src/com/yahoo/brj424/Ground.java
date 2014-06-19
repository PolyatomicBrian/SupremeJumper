package com.yahoo.brj424;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ground extends JPanel{
	
	public Ground(){
		//setBackground(Color.ORANGE);
		
	}

	public void drawGround(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(0, Main.resHeight-150, Main.resWidth, Main.resHeight);
	}
}
