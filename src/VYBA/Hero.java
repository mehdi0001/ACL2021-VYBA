package VYBA;
public class Hero extends Plateau{
	private String name;
	private char c;
	public static int poit_de_vie_intial = 100;
	public int pointVie;
	public Hero(String name, char c, int n, int m, int a, int b ){
		super(n, m, a, b);
		this.name = name;
		this.c = c;
		pointVie = 100;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getc() {
		return c;
	}
	public void setGender(char c) {
		this.c = c;
	}
	public int[] getPosition(){
		int[] d = {0,0};
		for(int i=0; i<this.matrice_plateau.length;i++){
			for(int j=0; j<this.matrice_plateau[0].length;j++){
				if (this.matrice_plateau[i][j]==1 ||this.matrice_plateau[i][j]==11 ){
					d[0] = i;
					d[1] = j;
				}
			}
		}
		System.out.println("Position hï¿½ros : "+d[0]+","+d[1]);
		return d;
	}

	public void MoveRight()
	{
		int i = this.getA();
		int j = this.getB();
		if(j!= this.matrice_plateau[0].length-1 ) {
			//On test si sur la case de droite, il n'y a pas de mosntres/murs/fantomes
			if(this.matrice_plateau[i][j+1]!=2&& this.matrice_plateau[i][j+1]!=3&& this.matrice_plateau[i][j+1]!=4&& this.matrice_plateau[i][j+1]!=6)
			{
				//On test s'il y a une case spéciale
				if(this.matrice_plateau[i][j+1]==8)
				{
					this.setB(j+1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i][j+1]=1;
					teleportation();
				}
				else if (this.matrice_plateau[i][j+1]==7)
				{
					this.setB(j+1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i][j+1]=1;
					case_piege();
				}
				else if (this.matrice_plateau[i][j+1]==9)
				{
					this.setB(j+1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i][j+1]=1;
					case_magique();
				}
				else {
					if (this.matrice_plateau[i][j]==11)
					{
						this.setB(j+1);
						this.matrice_plateau[i][j]=8;
						this.matrice_plateau[i][j+1]=1;
					}
					//cas du croisement avec un monstre
					else if (this.matrice_plateau[i][j]== 3)
					{
						this.setB(j+1);
						this.matrice_plateau[i][j]=3;
						this.matrice_plateau[i][j+1]=1;

					}
					//cas du croisement avec un fantome
					else if (this.matrice_plateau[i][j]== 4)
					{
						this.setB(j+1);
						this.matrice_plateau[i][j]=4;
						this.matrice_plateau[i][j+1]=1;
					}
					else
					{
						this.setB(j+1);
						this.matrice_plateau[i][j]=0;
						this.matrice_plateau[i][j+1]=1;
					}
				}
			}
			//Cas où on arrive sur la même case qu'un monstre/fantome
			if(this.matrice_plateau[i][j+1]==3 || this.matrice_plateau[i][j+1]==4)
			{
				this.pointVie=this.pointVie - 25;
				this.setA(0);
				this.setB(0);
				this.matrice_plateau[i][j]=0;
				this.matrice_plateau[this.getA()][this.getB()]=1;
			}
		}

	}
	//Même fonctionnement pour toutes les méthodes Move, seul la direction change
	public void MoveLeft()
	{
		int i = this.getA();
		int j = this.getB();
		if(j!=0) {
			if(this.matrice_plateau[i][j-1]!=3&& this.matrice_plateau[i][j-1]!=4 && this.matrice_plateau[i][j-1]!=2&& this.matrice_plateau[i][j-1]!=6)
			{
				if(this.matrice_plateau[i][j-1]==8)
				{
					this.setB(j-1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i][j-1]=1;
					teleportation();
				}
				else if (this.matrice_plateau[i][j-1]==7)
				{
					this.setB(j-1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i][j-1]=1;
					case_piege();
				}
				else if (this.matrice_plateau[i][j-1]==9)
				{
					this.setB(j-1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i][j-1]=1;
					case_magique();
				}
				else {
					if (this.matrice_plateau[i][j]==11)
					{
						this.setB(j-1);
						this.matrice_plateau[i][j]=8;
						this.matrice_plateau[i][j-1]=1;
					}
					else if (this.matrice_plateau[i][j]== 3)
					{
						this.setB(j-1);
						this.matrice_plateau[i][j]=3;
						this.matrice_plateau[i][j-1]=1;
					}
					else if (this.matrice_plateau[i][j]== 4)
					{
						this.setB(j-1);
						this.matrice_plateau[i][j]=4;
						this.matrice_plateau[i][j-1]=1;
					}
					else
					{
						this.setB(j-1);
						this.matrice_plateau[i][j]=0;
						this.matrice_plateau[i][j-1]=1;
					}
				}
			}

			if(this.matrice_plateau[i][j-1]==3 || this.matrice_plateau[i][j-1]==4)
			{
				this.pointVie=this.pointVie - 25;
				this.setA(0);
				this.setB(0);
				this.matrice_plateau[i][j]=0;
				this.matrice_plateau[this.getA()][this.getB()]=1;
			}
		}
	}
	public void MoveUp()
	{
		int i = this.getA();
		int j = this.getB();
		if(i!=0 ) {
			if(this.matrice_plateau[i-1][j]!=2&& this.matrice_plateau[i-1][j]!=3&& this.matrice_plateau[i-1][j]!=4&& this.matrice_plateau[i-1][j]!=6)
			{
				if(this.matrice_plateau[i-1][j]==8)
				{
					this.setA(i-1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i-1][j]=1;
					teleportation();
				}
				else if (this.matrice_plateau[i-1][j]==7)
				{
					this.setA(i-1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i-1][j]=1;
					case_piege();
				}
				else if (this.matrice_plateau[i-1][j]==9)
				{
					this.setA(i-1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i-1][j]=1;
					case_magique();
				}
				else {
					if (this.matrice_plateau[i][j]==11)
					{
						this.setA(i-1);
						this.matrice_plateau[i][j]=8;
						this.matrice_plateau[i-1][j]=1;
					}
					else if (this.matrice_plateau[i][j]== 3)
					{
						this.setA(i-1);
						this.matrice_plateau[i][j]=3;
						this.matrice_plateau[i-1][j]=1;
					}
					else if (this.matrice_plateau[i][j]== 4)
					{
						this.setA(i-1);
						this.matrice_plateau[i][j]=4;
						this.matrice_plateau[i-1][j]=1;
					}
					else
					{
						this.setA(i-1);
						this.matrice_plateau[i][j]=0;
						this.matrice_plateau[i-1][j]=1;
					}
				}
			}

			if(this.matrice_plateau[i-1][j]==3 || this.matrice_plateau[i-1][j]==4)
			{
				this.pointVie=this.pointVie - 25;
				this.setA(0);
				this.setB(0);
				this.matrice_plateau[i][j]=0;
				this.matrice_plateau[this.getA()][this.getB()]=1;
			}
		}
	}

	public void MoveDown()
	{
		int i = this.getA();
		int j = this.getB();

		if(i!= gettableau().length-1) {
			if(this.matrice_plateau[i+1][j]!=2 && this.matrice_plateau[i+1][j]!=3&& this.matrice_plateau[i+1][j]!=4&& this.matrice_plateau[i+1][j]!=6)
			{
				if(this.matrice_plateau[i+1][j]==8)
				{
					this.setA(i+1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i+1][j]=1;
					teleportation();
				}
				else if (this.matrice_plateau[i+1][j]==7)
				{
					this.setA(i+1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i+1][j]=1;
					case_piege();
				}
				else if (this.matrice_plateau[i+1][j]==9)
				{
					this.setA(i+1);
					this.matrice_plateau[i][j]=0;
					this.matrice_plateau[i+1][j]=1;
					case_magique();
				}
				else {
					if (this.matrice_plateau[i][j]==11)
					{
						this.setA(i+1);
						this.matrice_plateau[i][j]=8;
						this.matrice_plateau[i+1][j]=1;
					}
					else if (this.matrice_plateau[i][j]== 3)
					{
						this.setA(i+1);
						this.matrice_plateau[i][j]=3;
						this.matrice_plateau[i+1][j]=1;
					}
					else if (this.matrice_plateau[i][j]== 4)
					{
						this.setA(i+1);
						this.matrice_plateau[i][j]=4;
						this.matrice_plateau[i+1][j]=1;
					}
					else
					{
						this.setA(i+1);
						this.matrice_plateau[i][j]=0;
						this.matrice_plateau[i+1][j]=1;
					}
				}
			}

			if(this.matrice_plateau[i+1][j]==3 || this.matrice_plateau[i+1][j]==4)
			{
				this.pointVie=this.pointVie - 25;
				this.setA(0);
				this.setB(0);
				this.matrice_plateau[i][j]=0;
				this.matrice_plateau[this.getA()][this.getB()]=1;
			}
		}
	}
	public int getPointVie() {
		return pointVie;
	}
	public void setPointVie(int pointVie) {
		this.pointVie = pointVie;
	}
	public void attaque_hero() {
		int[] pos = getPosition();
		int i = pos[0];
		int j = pos[1];
		if (i!=matrice_plateau.length)
		{
			//On vérifier si un monstre/fantome est présent sur la case adjacente
			if (this.matrice_plateau[i+1][j]==3 ) {
				//On cherche le monstre,on lui enlève des points de vie, et on le projette
				for (int k=0;k<liste_monstre.size();k++)
				{
					Monster m = liste_monstre.get(k);
					if (m.pos_a==i+1 && m.pos_b==j)
					{
						m.setPoint_de_vie(m.getPoint_de_vie()-40);
						m.MoveDownMon();
					}
					if (m.getPoint_de_vie()<=0)
					{
						matrice_plateau[m.pos_a][m.pos_b]=0;
						liste_monstre.remove(k);

					}
				}
			}
			else if (this.matrice_plateau[i+1][j]==4) {
				for (int k=0;k<liste_fantome.size();k++)
				{
					Fantome f = liste_fantome.get(k);
					if (f.pos_a==i+1 && f.pos_b==j)
					{
						f.setPointVie(f.getPointVie()-40);
						f.MoveDownFan();
					}
					if (f.getPointVie()<=0)
					{
						matrice_plateau[f.pos_a][f.pos_b]=0;
						liste_fantome.remove(k);

					}
				}
			}
		}
		if (j != matrice_plateau.length)
		{
			if (this.matrice_plateau[i][j+1]==3) {
				for (int k=0;k<liste_monstre.size();k++)
				{
					Monster m = liste_monstre.get(k);
					if (m.pos_a==i && m.pos_b==j+1)
					{
						m.setPoint_de_vie(m.getPoint_de_vie()-40);
						m.MoveRightMon();
					}
					if (m.getPoint_de_vie()<=0)
					{
						matrice_plateau[m.pos_a][m.pos_b]=0;
						liste_monstre.remove(k);

					}
				}
			}
			else if (this.matrice_plateau[i][j+1]==4) {
				for (int k=0;k<liste_fantome.size();k++)
				{
					Fantome f = liste_fantome.get(k);
					if (f.pos_a==i && f.pos_b==j+1)
					{
						f.setPointVie(f.getPointVie()-40);
						f.MoveRightFan();
					}
					if (f.getPointVie()<=0)
					{
						matrice_plateau[f.pos_a][f.pos_b]=0;
						liste_fantome.remove(k);

					}
				}		
			}
		}
		if (i!=0)
		{
			if (this.matrice_plateau[i-1][j]==3 ) {
				for (int k=0;k<liste_monstre.size();k++)
				{
					Monster m = liste_monstre.get(k);
					if (m.pos_a==i-1 && m.pos_b==j)
					{
						m.setPoint_de_vie(m.getPoint_de_vie()-40);
						m.MoveUpMon();
					}
					if (m.getPoint_de_vie()<=0)
					{
						matrice_plateau[m.pos_a][m.pos_b]=0;
						liste_monstre.remove(k);

					}
				}
			}
			else if (this.matrice_plateau[i-1][j]==4) {
				for (int k=0;k<liste_fantome.size();k++)
				{
					Fantome f = liste_fantome.get(k);
					if (f.pos_a==i-1 && f.pos_b==j)
					{
						f.setPointVie(f.getPointVie()-40);
						f.MoveUpFan();
					}
					if (f.getPointVie()<=0)
					{
						matrice_plateau[f.pos_a][f.pos_b]=0;
						liste_fantome.remove(k);

					}
				}
			}
		}
		if (j!=0)
		{
			if (this.matrice_plateau[i][j-1]==3) {
				for (int k=0;k<liste_monstre.size();k++)
				{
					Monster m = liste_monstre.get(k);
					if (m.pos_a==i && m.pos_b==j+1)
					{
						m.setPoint_de_vie(m.getPoint_de_vie()-40);
						m.MoveLeftMon();
					}
					if (m.getPoint_de_vie()<=0)
					{
						matrice_plateau[m.pos_a][m.pos_b]=0;
						liste_monstre.remove(k);
					}
				}
			}
			else if (this.matrice_plateau[i][j-1]==4) {
				for (int k=0;k<liste_fantome.size();k++)
				{
					Fantome f = liste_fantome.get(k);
					if (f.pos_a==i && f.pos_b==j-1)
					{
						f.setPointVie(f.getPointVie()-40);
						f.MoveLeftFan();
					}
					if (f.getPointVie()<=0)
					{
						matrice_plateau[f.pos_a][f.pos_b]=0;
						liste_fantome.remove(k);

					}
				}		
			}
		}
	}
	public void teleportation() {
		//On cherche la case de tp sur laquelle est le héros, et on l'envoie su rl'autre du même niveau
		int[] pos = getPosition();
		int i = pos[0];
		int j = pos[1];
		if(i==19 &&j==17) {
			this.setA(7);
			this.setB(4);
			this.matrice_plateau[7][4]=11;
			this.matrice_plateau[19][17]=8;
		}
		else if(i==7 &&j==4) {
			this.setA(19);
			this.setB(17);
			this.matrice_plateau[19][17]=11;
			this.matrice_plateau[7][4]=8;
		}
		else if(i==17 &&j==17) {
			this.setA(1);
			this.setB(4);
			this.matrice_plateau[1][4]=11;
			this.matrice_plateau[17][17]=8;
		}
		else if(i==1 &&j==4) {
			this.setA(17);
			this.setB(17);
			this.matrice_plateau[17][17]=11;
			this.matrice_plateau[1][4]=8;
		}
		else if(i==2 &&j==6) {
			this.setA(6);
			this.setB(16);
			this.matrice_plateau[6][16]=11;
			this.matrice_plateau[2][6]=8;
		}
		else if(i==6 &&j==16) {
			this.setA(2);
			this.setB(6);
			this.matrice_plateau[2][6]=11;
			this.matrice_plateau[6][16]=8;
		}
	}	


	public void case_piege()
	{
		//On enlève des points de vie au héros
		this.setPointVie(getPointVie()-15);
	}


	public void case_magique()
	{
		//On génère un nombre aléatoire, qui va permettre d'nelever ou ajouter des points de vie
		double r = Math.random();
		if (r<0.2)
		{
			this.setPointVie(getPointVie()+10);
		}
		if (r<0.4 && r>=0.2)
		{
			this.setPointVie(getPointVie()+15);
		}
		if (r<0.55 && r>=0.4)
		{
			this.setPointVie(getPointVie()+20);
		}
		if (r<0.6 && r>=0.55)
		{
			this.setPointVie(getPointVie()+50);
		}
		if (r<0.75 && r>=0.6)
		{
			this.setPointVie(getPointVie()-10);
		}
		if (r<0.85 && r>=0.75)
		{
			this.setPointVie(getPointVie()-15);
		}
		if (r<0.95 && r>=0.85)
		{
			this.setPointVie(getPointVie()-20);
		}
		if (r>=0.95)
		{
			this.setPointVie(getPointVie()-50);
		}
	}


}