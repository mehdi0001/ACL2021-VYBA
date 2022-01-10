package VYBA;
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

		//Chargement des images qui vont nous servir
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
		Image case_tp = Toolkit.getDefaultToolkit().getImage("image/Case_tp.png");
		Image case_piege = Toolkit.getDefaultToolkit().getImage("image/case_piege.png"); 
		Image case_magique = Toolkit.getDefaultToolkit().getImage("image/case_magique.png");
		Image fleche_haut = Toolkit.getDefaultToolkit().getImage("image/fleche_haut.png");
		Image fleche_bas = Toolkit.getDefaultToolkit().getImage("image/fleche_bas.png");
		Image fleche_gauche = Toolkit.getDefaultToolkit().getImage("image/fleche_gauche.png");
		Image fleche_droite = Toolkit.getDefaultToolkit().getImage("image/fleche_droite.png");
		Image bouton_espace = Toolkit.getDefaultToolkit().getImage("image/bouton_espace.png");
		g.drawRect(0,0,400,400);

		//Affichage du labyrinthe, en fonction des valeurs de la matrice
		for(int array=0; array<matrice_dessin.length; array++) {
			for(int item=0; item<matrice_dessin[array].length; item++) 
			{
				if (matrice_dessin[item][array]!=2)
				{
					g.drawImage(herbe, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==1 || matrice_dessin[item][array]==11)
				{
					if (genre == 'M')
					{
						g.drawImage(heros_acl_herbe, array*20, item*20, this);
					}
					if (genre == 'F')
					{
						g.drawImage(heros_acl_f_herbe, array*20, item*20, this);
					}
				}

				if (matrice_dessin[item][array]==2)
				{
					g.drawImage(mur, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==3)
				{
					g.drawImage(monstre_herbe, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==4)
				{
					g.drawImage(fantome_herbe, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==5)
				{
					g.drawImage(arrivee, array*20, item*20, this);
				}
				if (matrice_dessin[item][array]==6) //Cas où le fantome traverse le mur
				{
					g.drawImage(fantome_mur, array*20, item*20, this);
				}
				else if (matrice_dessin[item][array]==7)
				{
					g.drawImage(case_piege,array*20,item*20,this);
				}
				else if (matrice_dessin[item][array]==8)
				{
					g.drawImage(case_tp,array*20,item*20,this);
				}
				else if (matrice_dessin[item][array]==9)
				{
					g.drawImage(case_magique,array*20,item*20,this);
				}
			}
		}

		//Affichage d'un menu à droite pour donner les règles au joueur
		if (genre == 'M')
		{
			g.drawImage(heros_acl_m, 450, 25, this);
		}
		if (genre == 'F')
		{
			g.drawImage(heros_acl_f, 450, 25, this);
		}
		g.drawImage(mur, 450, 75, this);
		g.drawImage(monstre, 450, 125, this);
		g.drawImage(fantome, 450, 175, this);
		g.drawImage(arrivee, 450, 225, this);
		g.drawImage(case_piege,450,275,this);
		g.drawImage(case_tp, 450,325,this);
		g.drawImage(case_magique,450,375,this);

		g.drawString("Votre héros",480, 40);
		g.drawString("Mur du labyrinthe",480, 90);
		g.drawString("Monstres : le héros perd 25 points de vie au contact d'un mosntre, et 10 chacun lorsqu'ils se croisent",480, 140);
		g.drawString("Fantomes : le héros perd 25 points de vie au contact d'un fantome, et 10 chacun lorsqu'ils se croisent",480, 190);
		g.drawString("Arrivé : si le héros y arrive, il gagne",480, 240);
		g.drawString ("Case piège : vous perdez 15 points de vie",480,290);
		g.drawString("Case de téléporatation : Vous vous téléportez vers l'autre case du même type",480,340);
		g.drawString("Case magique : Vous pouvez gagner ou perdre des points de vie aléaoirement(plus de chance d'en gagner que d'en perdre)",480,390);
		g.drawString("Nom du joueur : "+nom,50, 425);

		g.setColor(Color.magenta);
		g.drawString("Vie du héros : "+String.valueOf(point_de_vie), 200, 425);
		g.drawRect(200, 430, 100, 10);
		g.fillRect(200, 430, point_de_vie,10);


		//Affichage des commandes
		g.setColor(Color.black);
		g.drawString("Commande : ",50,450);
		g.drawImage(fleche_haut,50,460,this);
		g.drawString("Se déplacer vers le haut",80,470);
		g.drawImage(fleche_bas,50,485,this);
		g.drawString("Se déplacer vers le bas",80,495);
		g.drawImage(fleche_droite,50,510,this);
		g.drawString("Se déplacer vers le droite",80,520);
		g.drawImage(fleche_bas,50,535,this);
		g.drawString("Se déplacer vers le bas",80,545);
		g.drawImage(bouton_espace,50,560,this);
		g.drawString("Attaquer le monstre sur une case adjacente, lui enlève 40 points de vie, et le projette dans la direction opposé",80,570);

		//Affichage des points de vie des monstres et fantomes
		g.setColor(Color.BLUE);
		g.setFont(new Font("impact", Font.BOLD,15));
		for(int k=0;k<liste_monstre.size();k++)
		{
			Monster m = liste_monstre.get(k);
			g.drawString(String.valueOf(m.getPoint_de_vie()),m.pos_b*20,m.pos_a*20);
		}
		for(int k=0;k<liste_fantome.size();k++)
		{
			Fantome f = liste_fantome.get(k);
			g.drawString(String.valueOf(f.getPointVie()),f.pos_b*20,f.pos_a*20);
		}

	}
}
