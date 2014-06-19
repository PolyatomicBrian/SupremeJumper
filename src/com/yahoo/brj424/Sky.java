package com.yahoo.brj424;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Sky {

	public Sky() {
		//setBackground(Color.CYAN);
	}
	
	public void drawSky(Graphics g){
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, Main.resWidth, Main.resHeight);
	}
}
