package com.yahoo.brj424;

import javax.swing.*;

import java.awt.*;

public class Main {
	
	private static final String name = "Supreme Jumper";
	public static final int resWidth = 700;
	public static final int resHeight = 550;
	
	public static void main(String[]args){
		
		JFrame f = new JFrame();
		f.setTitle(name);
		f.setSize(resWidth, resHeight);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = f.getContentPane();
		
		GamePanel gp = new GamePanel();
		pane.add(gp);
		
		f.setVisible(true);
		
	}
}
