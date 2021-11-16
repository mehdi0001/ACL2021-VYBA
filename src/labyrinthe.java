
public class labyrinthe 
{
	int nbr_mur;
	public labyrinthe(int niveau, Plateau plateau)
	{
		if (niveau==1)
		{
			nbr_mur=50;
		}
		if (niveau==2)
		{
			nbr_mur=100;
		}
		if (niveau==3)
		{
			nbr_mur=150;
		}
		for (int i=0;i<nbr_mur;i++)
		{
			int n=(int)(Math.random()*20);
			int m=(int)(Math.random()*20);
			if (plateau.matrice_plateau[n][m]!=1)
			{
				plateau.matrice_plateau[n][m]=2;
			}
		}
	}
}
