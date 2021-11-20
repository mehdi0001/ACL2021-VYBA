import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class principal extends JFrame implements KeyListener
{
	public Hero notre_heros;
	public int niveau=99;
	public JFrame f;
	public static void main(String[] args) 

	{
		new principal();
	}
	
	principal()
	{
		if (this.niveau==99)
		{
			JFrame selection_niveau = new JFrame("Selection du niveau");
			JPanel panel=new JPanel();
			JLabel label1 = new JLabel("Appuyez sur 1 pour le niveau 1");
			JLabel label2= new JLabel ("Appuyez sur 2 pour le niveau 2");
			JLabel label3= new JLabel ("Appuyez sur 3 pour le niveau 3");
			panel.add(label1);
			panel.add(label2);
			panel.add(label3);
			selection_niveau.add(panel);
			selection_niveau.addKeyListener(this);
			selection_niveau.setSize(300, 300); 
			selection_niveau.show();
		}

	}

	void deplacement_heros()
	{

		notre_heros = new Hero("Nom test",'M',20,20,0,0);
		new labyrinthe(this.niveau,notre_heros);
		notre_heros.Affichage(notre_heros.matrice_plateau);
		f = new JFrame("Labyrinthe");
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().add(new Draw(notre_heros));
		f.addKeyListener(this);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.show();	
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_DOWN) 
		{ 
			notre_heros.MoveDown();
			f.getContentPane().add(new Draw(notre_heros));
			f.show();
		}

		if (e.getKeyCode() == KeyEvent.VK_UP) { 
			notre_heros.MoveUp();
			f.getContentPane().add(new Draw(notre_heros));
			f.show();
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{ 
			notre_heros.MoveLeft();
			f.getContentPane().add(new Draw(notre_heros));
			f.show();
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			notre_heros.MoveRight();
			f.getContentPane().add(new Draw(notre_heros));
			f.show();
		}
	}

	

	@Override
	public void keyTyped(KeyEvent e) 
	{
		if (e.getKeyChar()=='1')
		{
			this.niveau=1;
			deplacement_heros();
		}
		if (e.getKeyChar()=='2')
		{
			this.niveau=2;
			deplacement_heros();
		}
		if (e.getKeyChar()=='3')
		{
			this.niveau=3;
			deplacement_heros();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// pas d'action quand on relache la touche

	}
}


