package com.yahoo.brj424;

public class Ball extends Enemy{

	public Ball(int x, int y, int dx, int dy, int width, int height){
		super(x, y, dx, dy, width, height);
		super.isBall();
	}
	
}
