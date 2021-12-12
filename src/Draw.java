import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Draw extends JPanel
{
	int [][] matrice_dessin;
	char genre;
	String nom;
	public Draw(Hero heros)
	{
		this.matrice_dessin=heros.matrice_plateau;
		genre = heros.getc();
		nom= heros.getName();

	}
	public void paint(Graphics g)
	{
		for(int array=0; array<matrice_dessin.length; array++) {
			for(int item=0; item<matrice_dessin[array].length; item++) 
			{
				if (matrice_dessin[item][array]!=2)
				{
					g.setColor(Color.green);
					g.fillRect(array*20,item*20,20,20);
				}
				if (matrice_dessin[item][array]==1)
				{
					if (genre == 'M')
					{
						g.setColor(Color.blue);
					}
					if (genre == 'F')
					{
						g.setColor(Color.pink);
					}
					g.fillOval(array*20,item*20,20,20);
				}

				if (matrice_dessin[item][array]==2)
				{
					g.setColor(Color.black);
					g.fillRect(array*20,item*20,20,20);
				}
				if (matrice_dessin[item][array]==3)
				{
					g.setColor(Color.RED);
					g.fillOval(array*20,item*20,20,20);
				}
				if (matrice_dessin[item][array]==4)
				{
					g.setColor(Color.white);
					g.fillOval(array*20,item*20,20,20);
				}
				if (matrice_dessin[item][array]==5)
				{
					g.setColor(Color.yellow);
					g.fillOval(array*20,item*20,20,20);
				}
				if (matrice_dessin[item][array]==6) //Cas où le fantome traverse le mur
				{
					g.setColor(Color.black);
					g.fillRect(array*20,item*20,20,20);
					g.setColor(Color.white);
					g.fillOval(array*20,item*20,20,20);
				}
			}
		}
		if (genre == 'M')
		{
			g.setColor(Color.blue);
		}
		if (genre == 'F')
		{
			g.setColor(Color.pink);
		}
		g.fillOval(450,100,20,20);
		g.setColor(Color.black);
		g.fillRect(450,150,20,20);
		g.setColor(Color.RED);
		g.fillOval(450,200,20,20);
		g.setColor(Color.white);
		g.fillOval(450,250,20,20);
		g.setColor(Color.yellow);
		g.fillOval(450,300,20,20);
		g.setColor(Color.black);
		g.drawString("Votre héros",480, 115);
		g.drawString("Mur du labyrinthe",480, 165);
		g.drawString("Monstres",480, 215);
		g.drawString("Fantomes",480, 265);
		g.drawString("Arrivé",480, 315);
		g.drawString("Nom du joueur : "+nom,50, 450);
	}
}
