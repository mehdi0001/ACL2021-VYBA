
public class labyrinthe 
{
	int nbr_mur;
	public labyrinthe(int niveau, Plateau plateau, int [] arrivee)
	{
		if (niveau==1)
		{
			nbr_mur=50;
			int [][] mur= {{1,1},{2,2},{3,2}s};
			for (int k=0;k<mur.length;k++)
			{
				plateau.matrice_plateau[mur[k][0]][mur[k][1]]=2;
			}
			
		}
		if (niveau==2)
		{
			nbr_mur=100;
		}
		if (niveau==3)
		{
			nbr_mur=150;
		}
		/*for (int i=0;i<nbr_mur;i++)
		{
			int n=(int)(Math.random()*20);
			int m=(int)(Math.random()*20);
			if (plateau.matrice_plateau[n][m]!=1)
			{
				plateau.matrice_plateau[n][m]=2;
			}
		}*/
		plateau.matrice_plateau[arrivee[0]][arrivee[1]]=5;
		plateau.position_arrivee=arrivee;
	}
	
}
