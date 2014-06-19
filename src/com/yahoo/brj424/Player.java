package com.yahoo.brj424;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	public static boolean up = false;
	public static boolean left = false;
	public static boolean right = false;

	private int x;
	private int y;
	private int dx;
	private int dy;

	public static final int GRAVITY = 4;
	public static int speed = 25;

	private int width = 50;
	private int height = 100;

	public Player(int x, int y, int dx, int dy) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
	}

	public void movePlayer() {
		checkDXDY();
		x += dx;
		y += dy;
		if (x + width >= Main.resWidth) {
			dx = -Math.abs(dx);
		} else if (x <= 0) {
			dx = Math.abs(dx);
		}
	}

	public void checkDXDY() {
		if (up) {
			/*
			 * if (dy >= 0){ up = false; dy = 0; }
			 */
			if (y + height > Main.resHeight - 150) {
				up = false;
				y = Main.resHeight - 150 - height;
				dy = 0;
			} else
				dy += GRAVITY;
		}
		if (left && !right) {
			dx = -speed;
		}
		if (right && !left) {
			dx = speed;
		}
		if (!left && !right) {
			dx = 0;
		}
	}

	public void drawPlayer(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
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

	public int getSpeed() {
		return speed;
	}
}
