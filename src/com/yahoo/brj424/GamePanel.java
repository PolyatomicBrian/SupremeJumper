package com.yahoo.brj424;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	public static ArrayList<Enemy> listEnemy;

	private javax.swing.Timer timer;

	public Sky sky;
	public Ground ground;
	public Player player;

	public GamePanel() {
		setLayout(new BorderLayout());
		// add(new Sky(), BorderLayout.CENTER);
		// Ground gr = new Ground();
		// gr.setPreferredSize(new Dimension(500, 100));
		// add(gr, BorderLayout.SOUTH);

		sky = new Sky();
		ground = new Ground();
		player = new Player(10, 300, 0, 0);

		timer = new javax.swing.Timer(100, new MoveObjects());
		timer.start();

		listEnemy = new ArrayList<Enemy>();
		createEnemies();

		setFocusable(true);
		addKeyListener(new MovePlayer());
	}

	private void createEnemies() {
		for (int n = 0; n <= 3; n++) {
			Square e;
			Ball f;
			if (n % 2 == 0) {
				e = new Square((n + n) * 100, 350, -8, 0, 50, 50);
				listEnemy.add(e);
			} else {
				f = new Ball((n + n) * 100, 350, -8, 0, 50, 50);
				listEnemy.add(f);
			}
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		sky.drawSky(g);
		ground.drawGround(g);
		drawEnemy(g);
		player.drawPlayer(g);
	}

	public void drawEnemy(Graphics g) {
		for (int e = 0; e < listEnemy.size(); e++) {
			listEnemy.get(e).drawEnemy(g);
		}
	}

	private class MoveObjects implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			moveEnemy();
			player.movePlayer();
			repaint();
		}
	}

	private class MovePlayer implements KeyListener {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				if (!player.up) {
					player.up = true;
					player.setDY(-1 * player.getSpeed());
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				Player.left = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				Player.right = true;
			}
			repaint();
		}

		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				Player.left = false;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				Player.right = false;
			}
			repaint();
		}

		public void keyTyped(KeyEvent e) {
			// Leave method blank
		}
	}

	public void moveEnemy() {
		for (int e = 0; e < listEnemy.size(); e++) {
			listEnemy.get(e).moveEnemy();
		}
	}

}
