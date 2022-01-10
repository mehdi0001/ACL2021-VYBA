package VYBA;
import java.util.ArrayList;

public class labyrinthe 
{
	int nbr_mur;
	public labyrinthe(int niveau, Plateau plateau)
	{
		plateau.liste_fantome= new ArrayList<Fantome>();
		plateau.liste_monstre= new ArrayList<Monster>();
		//R�cup�ration de la position des murs dans les fichiers
		mur1 m1 = new mur1();
		mur1_2 m2 = new mur1_2();
		mur2_1 m3 = new mur2_1();
		mur2_2 m4 = new mur2_2();
		mur3_1 m5 = new mur3_1();
		mur3_2 m6 = new mur3_2();
		if (niveau==1)
		{

			for (int k=0;k<51;k++)
			{
				int i=Integer.parseInt(m1.mur11().get(k));
				int j=Integer.parseInt(m2.mur12().get(k));  
				plateau.matrice_plateau[i][j]=2;
			}
			int [] arrivee= {0,19};
			plateau.matrice_plateau[arrivee[0]][arrivee[1]]=5;
			plateau.position_arrivee=arrivee;

			int a=(int)(Math.random()*20);
			int b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_monstre.add(new Monster (1,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=3;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_monstre.add(new Monster (2,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=3;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_fantome.add(new Fantome (1,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=4;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_fantome.add(new Fantome (2,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=4;

			//Generation des cases sp�ciales
			plateau.matrice_plateau[7][4]=8;
			plateau.matrice_plateau[19][17]=8;
			plateau.matrice_plateau[5][3]=7;
			plateau.matrice_plateau[14][16]=7;// 7 piege
			plateau.matrice_plateau[3][17]=7;
			plateau.matrice_plateau[6][5]=7;
			plateau.matrice_plateau[7][8]=9; // 9 magique
			plateau.matrice_plateau[2][8]=9;
			plateau.matrice_plateau[8][13]=9;
			plateau.matrice_plateau[11][19]=9;

		}
		if (niveau==2)
		{
			for (int k=0;k<102;k++)
			{
				int i=Integer.parseInt(m3.mur21().get(k));
				int j=Integer.parseInt(m4.mur22().get(k));  
				plateau.matrice_plateau[i][j]=2;
			}
			int [] arrivee= {0,19};
			plateau.matrice_plateau[arrivee[0]][arrivee[1]]=5;
			plateau.position_arrivee=arrivee;
			int a=(int)(Math.random()*20);
			int b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_monstre.add (new Monster (1,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=3;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_monstre.add(new Monster (2,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=3;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_fantome.add(new Fantome (1,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=4;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_fantome.add(new Fantome (2,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=4;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_monstre.add(new Monster (3,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=3;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_fantome.add(new Fantome (3,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=4;

			//Generation des cases sp�ciales
			plateau.matrice_plateau[1][4]=8;
			plateau.matrice_plateau[17][17]=8;
			plateau.matrice_plateau[9][3]=7;
			plateau.matrice_plateau[15][16]=7;
			plateau.matrice_plateau[8][10]=7;
			plateau.matrice_plateau[13][5]=7;
			plateau.matrice_plateau[10][8]=9;
			plateau.matrice_plateau[15][18]=9;
			plateau.matrice_plateau[9][1]=9;
			plateau.matrice_plateau[2][17]=9;
		}
		if (niveau==3)
		{
			for (int k=0;k<175;k++)
			{
				int i=Integer.parseInt(m5.mur31().get(k));
				int j=Integer.parseInt(m6.mur32().get(k));  
				plateau.matrice_plateau[i][j]=2;
			}
			int [] arrivee= {12,19};
			plateau.matrice_plateau[arrivee[0]][arrivee[1]]=5;
			plateau.position_arrivee= arrivee;
			int a=(int)(Math.random()*20);
			int b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_monstre.add(new Monster (1,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=3;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_monstre.add(new Monster (2,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=3;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_fantome.add(new Fantome (1,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=4;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_fantome.add(new Fantome (2,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=4;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_monstre.add(new Monster (3,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=3;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_monstre.add( new Monster (4,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=3;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_fantome.add(new Fantome (3,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=4;
			a=(int)(Math.random()*20);
			b=(int)(Math.random()*20);
			while (plateau.matrice_plateau[a][b]!=0)
			{
				a=(int)(Math.random()*20);
				b=(int)(Math.random()*20);
			}
			plateau.liste_fantome.add(new Fantome (4,100,a,b,plateau));
			plateau.matrice_plateau[a][b]=4;

			//Generation des cases sp�ciales
			plateau.matrice_plateau[2][6]=8;
			plateau.matrice_plateau[6][16]=8;
			plateau.matrice_plateau[4][18]=7;
			plateau.matrice_plateau[7][3]=7;
			plateau.matrice_plateau[5][14]=9;
			plateau.matrice_plateau[11][10]=7;
			plateau.matrice_plateau[13][15]=7;
			plateau.matrice_plateau[15][19]=9;
			plateau.matrice_plateau[13][4]=9;
			plateau.matrice_plateau[7][9]=9;

		}
	}

}
