import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class principal extends JFrame implements ActionListener
{
	
	public static void main(String[] args) 
	{

		/*Selection niveau*/
		JFrame selection_niveau = new JFrame("Selection du niveau");
		principal obj = new principal();
		JPanel panel1 = new JPanel(); 
		JButton btn1 = new JButton("Niveau 1");
		JButton btn2 = new JButton("Niveau 2");
		JButton btn3 = new JButton("Niveau 3");
		btn1.addActionListener(obj); 
		panel1.add(btn1); 
		btn2.addActionListener(obj); 
		panel1.add(btn2);
		btn3.addActionListener(obj); 
		panel1.add(btn3);
		selection_niveau.add(panel1);
		selection_niveau.setSize(300, 300); 
		selection_niveau.show(); 
	}
	public void actionPerformed(ActionEvent e)
	{
		int niveau = 99;
		String s = e.getActionCommand(); 
		if (s.equals("Niveau 1"))
		{
			niveau=1;
		}
		if (s.equals("Niveau 2"))
		{
			niveau=2;
		}
		if (s.equals("Niveau 3"))
		{
			niveau=3;
		}

		Hero notre_heros = new Hero("Nom test",'M',20,20,0,0);


		labyrinthe plateau_mur = new labyrinthe(niveau,notre_heros);
		/*for(int array=0; array<notre_heros.matrice_plateau.length; array++) {
			for(int item=0; item<notre_heros.matrice_plateau[array].length; item++) {
				System.out.print(notre_heros.matrice_plateau[array][item] + "\t");
			}
			System.out.println();			
		}*/
		JFrame f = new JFrame("Labyrinthe");
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().add(new Draw(notre_heros));
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		notre_heros.MoveUp();
		f.getContentPane().add(new Draw(notre_heros));
		notre_heros.MoveRight();
		f.getContentPane().add(new Draw(notre_heros));
		notre_heros.MoveDown();
		f.getContentPane().add(new Draw(notre_heros));
		notre_heros.MoveLeft();
		f.getContentPane().add(new Draw(notre_heros));
		for(int array=0; array<notre_heros.matrice_plateau.length; array++) {
			for(int item=0; item<notre_heros.matrice_plateau[array].length; item++) {
				System.out.print(notre_heros.matrice_plateau[array][item] + "\t");
			}
			System.out.println();			
		}
		
	}
}

