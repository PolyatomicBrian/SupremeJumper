package com.yahoo.brj424;

public class Square extends Enemy{
	
	public Square(int x, int y, int dx, int dy, int width, int height){
		super(x, y, dx, dy, width, height);
		super.isSquare();
	}
}
