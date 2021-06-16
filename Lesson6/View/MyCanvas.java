package View;

import javax.swing.JPanel;

import Model.GameElement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class MyCanvas extends JPanel {

	private GameBoard gameBoard;
	private ArrayList<GameElement> figures = new ArrayList<>();

	public MyCanvas(GameBoard gameBoard, int width, int heigth){
		this.gameBoard = gameBoard;
		setPreferredSize(new Dimension(width, heigth));
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		for(var f: figures){
			f.render(g2);
		}
	}

	public ArrayList<GameElement> getFigures() {
		return figures;
	}
	
}