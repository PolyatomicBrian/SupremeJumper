package com.yahoo.brj424;

import java.awt.Color;
import java.awt.Graphics;


public class Enemy {

	private int x;
	private int y;
	private int dx;
	private int dy;

	private int width = 50;
	private int height = 50;
	
	public boolean isSquare = false;
	public boolean isBall = false;
	
	private Color color;

	public Enemy(int x, int y, int dx, int dy, int width, int height) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
		this.width = width;
		this.height = height;
		
		color = randomColor();
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setDX(int dx) {
		this.dx = dx;
	}

	public void setDY(int dy) {
		this.dy = dy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDX() {
		return dx;
	}

	public int getDY() {
		return dy;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void drawEnemy(Graphics g) {
		if (isSquare){
			g.setColor(color);
			g.fillRect(x, y, width, height);
			g.setColor(Color.BLACK);
			g.drawRect(x, y, width, height);
		}else if (isBall){
			g.setColor(color);
			g.fillOval(x, y, width, height);
			g.setColor(Color.BLACK);
			g.drawOval(x, y, width, height);
		}
	}

	public void moveEnemy() {
		x += dx;
		y += dy;
		if (x + width >= Main.resWidth){
			dx = -Math.abs(dx);
		}else if (x <= 0){
			dx = Math.abs(dx);
		}
	}
	
	public void isSquare(){
		isSquare = true; 
	}
	
	public void isBall(){
		isBall = true;
	}
	
	public Color randomColor(){
		Color color = new Color(((int)(256 * Math.random())), ((int)(256 * Math.random())), ((int)(256 * Math.random())));
		return color;
	}
}
