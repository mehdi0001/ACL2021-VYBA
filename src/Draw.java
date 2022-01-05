import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Draw extends JPanel
{
	int [][] matrice_dessin;
	char genre;
	String nom;
	int point_de_vie;
	ArrayList<Monster> liste_monstre;
	ArrayList<Fantome> liste_fantome;
	public Draw(Hero heros)
	{
		this.matrice_dessin=heros.matrice_plateau;
		genre = heros.getc();
		nom= heros.getName();
		this.point_de_vie = heros.getPointVie();
		liste_monstre=heros.liste_monstre;
		liste_fantome=heros.liste_fantome;
		

	}
	public void paint(Graphics g)
	{
		g.clearRect(0,0, 600, 600);
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
		
		g.setColor(Color.magenta);
		g.drawString("Vie du héros : "+String.valueOf(point_de_vie), 200, 450);
		g.drawRect(200, 455, 100, 10);
		g.fillRect(200, 455, point_de_vie,10);
		g.setColor(Color.BLUE);
		g.setFont(new Font("impact", Font.BOLD,15));
		for(int k=0;k<liste_monstre.size();k++)
		{
			Monster m = liste_monstre.get(k);
			System.out.println("mx : "+m.pos_a);
			System.out.println("my : "+m.pos_b);

			g.drawString(String.valueOf(m.getPoint_de_vie()),m.pos_b*20,m.pos_a*20);
		}
		for(int k=0;k<liste_fantome.size();k++)
		{
			Fantome f = liste_fantome.get(k);
			System.out.println("fx : "+f.pos_a);
			System.out.println("fy : "+f.pos_b);
			g.drawString(String.valueOf(f.getPointVie()),f.pos_b*20,f.pos_a*20);
		}
	}
}
