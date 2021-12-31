import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

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
		Image heros_acl_f_herbe = Toolkit.getDefaultToolkit().getImage("image/heros_acl_f_herbe.png");
	    Image heros_acl_herbe = Toolkit.getDefaultToolkit().getImage("image/heros_acl_herbe.png");
	    Image arrivee = Toolkit.getDefaultToolkit().getImage("image/arrivee.png");
	    Image monstre_herbe = Toolkit.getDefaultToolkit().getImage("image/monstre_herbe.png");
	    Image fantome_herbe = Toolkit.getDefaultToolkit().getImage("image/fantome_herbe.png");
	    Image fantome_mur = Toolkit.getDefaultToolkit().getImage("image/fantome_mur.png");
	    Image fantome = Toolkit.getDefaultToolkit().getImage("image/frantome.png");
	    Image herbe = Toolkit.getDefaultToolkit().getImage("image/herbe.png");
	    Image heros_acl_f = Toolkit.getDefaultToolkit().getImage("image/heros_acl_f.png");
	    Image heros_acl_m = Toolkit.getDefaultToolkit().getImage("image/heros_acl_m.png");
	    Image monstre = Toolkit.getDefaultToolkit().getImage("image/monstre.png");
	    Image mur = Toolkit.getDefaultToolkit().getImage("image/mur.png");
	    
		for(int array=0; array<matrice_dessin.length; array++) {
			for(int item=0; item<matrice_dessin[array].length; item++) 
			{
				if (matrice_dessin[item][array]!=2)
				{
					/*g.setColor(Color.green);
					g.fillRect(array*20,item*20,20,20);*/
					g.drawImage(herbe, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==1)
				{
					if (genre == 'M')
					{
						//g.setColor(Color.blue);
						g.drawImage(heros_acl_herbe, array*20, item*20, this);
					}
					if (genre == 'F')
					{
						//g.setColor(Color.pink);
						g.drawImage(heros_acl_f_herbe, array*20, item*20, this);
					}
					//g.fillOval(array*20,item*20,20,20);
				}

				if (matrice_dessin[item][array]==2)
				{
					/*g.setColor(Color.black);
					g.fillRect(array*20,item*20,20,20);*/
					g.drawImage(mur, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==3)
				{
					/*g.setColor(Color.RED);
					g.fillOval(array*20,item*20,20,20);*/
					g.drawImage(monstre_herbe, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==4)
				{
					/*g.setColor(Color.white);
					g.fillOval(array*20,item*20,20,20);*/
					g.drawImage(fantome_herbe, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==5)
				{
					/*g.setColor(Color.yellow);
					g.fillOval(array*20,item*20,20,20);*/
					g.drawImage(arrivee, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==6) //Cas où le fantome traverse le mur
				{
					/*g.setColor(Color.black);
					g.fillRect(array*20,item*20,20,20);
					g.setColor(Color.white);
					g.fillOval(array*20,item*20,20,20);*/
					g.drawImage(fantome_mur, array*20, item*20, this);
				}
			}
		}
		if (genre == 'M')
		{
			//g.setColor(Color.blue);
			g.drawImage(heros_acl_m, 450, 100, this);
		}
		if (genre == 'F')
		{
			//g.setColor(Color.pink);
			g.drawImage(heros_acl_f, 450, 100, this);
		}
		g.drawImage(mur, 450, 150, this);
		g.drawImage(monstre, 450, 200, this);
		g.drawImage(fantome, 450, 250, this);
		g.drawImage(arrivee, 450, 300, this);



		/*g.fillOval(450,100,20,20);
		g.setColor(Color.black);
		g.fillRect(450,150,20,20);
		g.setColor(Color.RED);
		g.fillOval(450,200,20,20);
		g.setColor(Color.white);
		g.fillOval(450,250,20,20);
		g.setColor(Color.yellow);
		g.fillOval(450,300,20,20);
		g.setColor(Color.black);*/
		g.drawString("Votre héros",480, 115);
		g.drawString("Mur du labyrinthe",480, 165);
		g.drawString("Monstres",480, 215);
		g.drawString("Fantomes",480, 265);
		g.drawString("Arrivé",480, 315);
		g.drawString("Nom du joueur : "+nom,50, 450);
	}
}
