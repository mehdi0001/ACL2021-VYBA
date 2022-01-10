package VYBA;
public class Fantome{ //extends Plateau {
	private int nbr_fantome;
	private int id_fantome;
	public static int poit_de_vie_intial = 100;
	private int pointVie;
	public int pos_a,pos_b;
	private Plateau plat;
	public Fantome(int id_fantome,int pointVie, int a, int b,Plateau p) {
		this.id_fantome = id_fantome;
		this.pointVie = pointVie;
		this.pos_a=a;
		this.pos_b=b;
		this.plat=p;
	}
	public int getNbr_fantome() {
		return nbr_fantome;
	}
	public void setNbr_fantome(int nbr_fantome) {
		this.nbr_fantome = nbr_fantome;
	}
	public int getId_fantome() {
		return id_fantome;
	}
	public void setId_fantome(int id_fantome) {
		this.id_fantome = id_fantome;
	}
	public int getPointVie() {
		return pointVie;
	}
	public void setPointVie(int pointVie) {
		this.pointVie = pointVie;
	}
	public int[] getPosition(){
		int[] d = {0,0};
		for(int i=0; i<this.plat.matrice_plateau.length;i++){
			for(int j=0; j<this.plat.matrice_plateau[0].length;j++){
				if (this.plat.matrice_plateau[i][j]==4){
					d[0] = i;
					d[1] = j;
				}
			}
		}
		return d;
	}
	public void MoveRightFan()
	{
		int i =pos_a;
		int j = pos_b;
		//Déplacement des fantomes, en vérifiant qu'il n'y a pas d'autres monstres/fantomes, de case spéciale ou qu'il ne sorte pas du plateau

		if (this.plat.matrice_plateau[i][j]!=6 )
		{

			if(j!= this.plat.matrice_plateau.length-1) {
				if(this.plat.matrice_plateau[i][j+1]!=3 && this.plat.matrice_plateau[i][j+1]!=4&& this.plat.matrice_plateau[i][j+1]!=5 && this.plat.matrice_plateau[i][j+1]!=8&& this.plat.matrice_plateau[i][j+1]!=7&& this.plat.matrice_plateau[i][j+1]!=9&& this.plat.matrice_plateau[i][j+1]!=6)
				{
					if (this.plat.matrice_plateau[i][j+1]==2)
					{
						this.plat.matrice_plateau[i][j]=0;
						this.plat.matrice_plateau[i][j+1]=6;
						pos_b=pos_b+1;
					}
					else
					{
						this.plat.matrice_plateau[i][j]=0;
						this.plat.matrice_plateau[i][j+1]=4;
						pos_b=pos_b+1;
					}
				}
			}
		}
		else
		{
			//Déplacement des fantomes, en vérifiant qu'il n'y a pas d'autres monstres/fantomes, de case spéciale ou qu'il ne sorte pas du plateau
			if(j!= this.plat.matrice_plateau.length-1) {
				if(this.plat.matrice_plateau[i][j+1]!=3 && this.plat.matrice_plateau[i][j+1]!=4&& this.plat.matrice_plateau[i][j+1]!=5 && this.plat.matrice_plateau[i][j+1]!=8&& this.plat.matrice_plateau[i][j+1]!=7&& this.plat.matrice_plateau[i][j+1]!=9&& this.plat.matrice_plateau[i][j+1]!=8&& this.plat.matrice_plateau[i][j+1]!=7&& this.plat.matrice_plateau[i][j+1]!=6)
				{
					if (this.plat.matrice_plateau[i][j+1]==2)
					{
						this.plat.matrice_plateau[i][j]=2;
						this.plat.matrice_plateau[i][j+1]=6;
						pos_b=pos_b+1;
					}
					else
					{
						this.plat.matrice_plateau[i][j]=2;
						this.plat.matrice_plateau[i][j+1]=4;
						pos_b=pos_b+1;
					}
				}
			}
		}
	}
	public void MoveUpFan()
	{
		int i =pos_a;
		int j = pos_b;
		//Déplacement des fantomes, en vérifiant qu'il n'y a pas d'autres monstres/fantomes, de case spéciale ou qu'il ne sorte pas du plateau
		if (this.plat.matrice_plateau[i][j]!=6 )
		{
			if(i!= 0) {
				if (this.plat.matrice_plateau[i-1][j]!=3 && this.plat.matrice_plateau[i-1][j]!=4&& this.plat.matrice_plateau[i-1][j]!=5 && this.plat.matrice_plateau[i-1][j]!=8&& this.plat.matrice_plateau[i-1][j]!=7&& this.plat.matrice_plateau[i-1][j]!=9&& this.plat.matrice_plateau[i-1][j]!=6)
				{
					if (this.plat.matrice_plateau[i-1][j]==2)
					{
						this.plat.matrice_plateau[i][j]=0;
						this.plat.matrice_plateau[i-1][j]=6;
						pos_a=pos_a-1;
					}
					else
					{
						this.plat.matrice_plateau[i][j]=0;
						this.plat.matrice_plateau[i-1][j]=4;
						pos_a=pos_a-1;
					}
				}
			}
		}
		else
		{
			if(i!= 0) {
				if (this.plat.matrice_plateau[i-1][j]!=3 && this.plat.matrice_plateau[i-1][j]!=4&& this.plat.matrice_plateau[i-1][j]!=5 && this.plat.matrice_plateau[i-1][j]!=8&& this.plat.matrice_plateau[i-1][j]!=7&& this.plat.matrice_plateau[i-1][j]!=9&& this.plat.matrice_plateau[i-1][j]!=6)
				{
					if (this.plat.matrice_plateau[i-1][j]==2)
					{
						this.plat.matrice_plateau[i][j]=2;
						this.plat.matrice_plateau[i-1][j]=6;
						pos_a=pos_a-1;
					}
					else
					{
						this.plat.matrice_plateau[i][j]=2;
						this.plat.matrice_plateau[i-1][j]=4;
						pos_a=pos_a-1;
					}
				}
			}
		}
	}
	public void MoveLeftFan()
	{
		int i =pos_a;
		int j = pos_b;
		//Déplacement des fantomes, en vérifiant qu'il n'y a pas d'autres monstres/fantomes, de case spéciale ou qu'il ne sorte pas du plateau
		if (this.plat.matrice_plateau[i][j]!=6 )
		{
			if(j!=0) {
				if(this.plat.matrice_plateau[i][j-1]!=3 && this.plat.matrice_plateau[i][j-1]!=4&& this.plat.matrice_plateau[i][j-1]!=5 && this.plat.matrice_plateau[i][j-1]!=8&& this.plat.matrice_plateau[i][j-1]!=6 && this.plat.matrice_plateau[i][j-1]!=7 && this.plat.matrice_plateau[i][j-1]!=9 )
				{
					if (this.plat.matrice_plateau[i][j-1]==2)
					{
						this.plat.matrice_plateau[i][j]=0;
						this.plat.matrice_plateau[i][j-1]=6;
						pos_b=pos_b-1;
					}
					else
					{
						this.plat.matrice_plateau[i][j]=0;
						this.plat.matrice_plateau[i][j-1]=4;
						pos_b=pos_b-1;
					}
				}
			}
		}
		else
		{
			if(j!=0) {
				if(this.plat.matrice_plateau[i][j-1]!=3 && this.plat.matrice_plateau[i][j-1]!=4&& this.plat.matrice_plateau[i][j-1]!=5 && this.plat.matrice_plateau[i][j-1]!=8&& this.plat.matrice_plateau[i][j-1]!=6 && this.plat.matrice_plateau[i][j-1]!=7 && this.plat.matrice_plateau[i][j-1]!=9)
				{
					if (this.plat.matrice_plateau[i][j-1]==2)
					{
						this.plat.matrice_plateau[i][j]=2;
						this.plat.matrice_plateau[i][j-1]=6;
						pos_b=pos_b-1;
					}
					else
					{
						this.plat.matrice_plateau[i][j]=2;
						this.plat.matrice_plateau[i][j-1]=4;
						pos_b=pos_b-1;
					}
				}
			}
		}
	}
	public void MoveDownFan()
	{
		int i =pos_a;
		int j = pos_b;
		//Déplacement des fantomes, en vérifiant qu'il n'y a pas d'autres monstres/fantomes, de case spéciale ou qu'il ne sorte pas du plateau
		if (this.plat.matrice_plateau[i][j]!=6)
		{
			if(i!= this.plat.matrice_plateau.length-1) {
				if (this.plat.matrice_plateau[i+1][j]!=3 && this.plat.matrice_plateau[i+1][j]!=4&& this.plat.matrice_plateau[i+1][j]!=5 && this.plat.matrice_plateau[i+1][j]!=8&& this.plat.matrice_plateau[i+1][j]!=6 && this.plat.matrice_plateau[i+1][j]!=7 && this.plat.matrice_plateau[i+1][j]!=9)
				{
					if (this.plat.matrice_plateau[i+1][j]==2)
					{
						this.plat.matrice_plateau[i][j]=0;
						this.plat.matrice_plateau[i+1][j]=6;
						pos_a=pos_a+1;
					}
					else
					{
						this.plat.matrice_plateau[i][j]=0;
						this.plat.matrice_plateau[i+1][j]=4;
						pos_a=pos_a+1;
					}
				}
			}
		}
		else
		{
			if(i!= this.plat.matrice_plateau.length-1) {
				if (this.plat.matrice_plateau[i+1][j]!=3 && this.plat.matrice_plateau[i+1][j]!=4&& this.plat.matrice_plateau[i+1][j]!=5 && this.plat.matrice_plateau[i+1][j]!=8&& this.plat.matrice_plateau[i+1][j]!=6 && this.plat.matrice_plateau[i+1][j]!=7 && this.plat.matrice_plateau[i+1][j]!=9)
				{
					if (this.plat.matrice_plateau[i+1][j]==2)
					{
						this.plat.matrice_plateau[i][j]=2;
						this.plat.matrice_plateau[i+1][j]=6;
						pos_a=pos_a+1;
					}
					else
					{
						this.plat.matrice_plateau[i][j]=2;
						this.plat.matrice_plateau[i+1][j]=4;
						pos_a=pos_a+1;
					}
				}
			}
		}

	}


}


