import java.util.ArrayList;

public class labyrinthe 
{
	int nbr_mur;
	public labyrinthe(int niveau, Plateau plateau)
	{
		plateau.liste_fantome= new ArrayList<Fantome>();
		plateau.liste_monstre= new ArrayList<Monster>();
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
		}
	}

}
