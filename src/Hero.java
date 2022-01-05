public class Hero extends Plateau{
	private String name;
	private char c;
	//public Plateau p;
	public static int poit_de_vie_intial = 100;
	public int pointVie;
	public Hero(String name, char c, int n, int m, int a, int b/*, Plateau p*/ ){
		super(n, m, a, b);
		this.name = name;
		this.c = c;
		//this.p = p;
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
				if (this.matrice_plateau[i][j]==1){
					d[0] = i;
					d[1] = j;
				}
			}
		}
		System.out.println("Position h�ros : "+d[0]+","+d[1]);
		return d;
	}

	public void MoveRight()
	{
		int[] pos = getPosition();
		int i =pos[0];
		int j = pos[1];
		if(j!= this.matrice_plateau[0].length-1 ) {
			if(this.matrice_plateau[i][j+1]!=2&& this.matrice_plateau[i][j+1]!=3&& this.matrice_plateau[i][j+1]!=4&& this.matrice_plateau[i][j+1]!=6)
			{
				this.setB(j+1);
				this.matrice_plateau[i][j]=0;
				this.matrice_plateau[i][j+1]=1;
			}

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

	public void MoveLeft()
	{
		int[] pos = getPosition();
		int i = pos[0];
		int j = pos[1];
		if(j!=0) {
			if(this.matrice_plateau[i][j-1]!=3&& this.matrice_plateau[i][j-1]!=4 && this.matrice_plateau[i][j-1]!=2&& this.matrice_plateau[i][j-1]!=6)
			{
				this.setB(j-1);
				this.matrice_plateau[i][j]=0;
				this.matrice_plateau[i][j-1]=1;
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
		int[] pos = getPosition();
		int i = pos[0];
		int j = pos[1];
		if(i!=0 ) {
			if(this.matrice_plateau[i-1][j]!=2&& this.matrice_plateau[i-1][j]!=3&& this.matrice_plateau[i-1][j]!=4&& this.matrice_plateau[i-1][j]!=6)
			{
				this.setA(i-1);
				this.matrice_plateau[i][j]=0;
				this.matrice_plateau[i-1][j]=1;
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
		int[] pos = getPosition();
		int i = pos[0];
		int j = pos[1];
		if(i!= gettableau().length-1) {
			if(this.matrice_plateau[i+1][j]!=2 && this.matrice_plateau[i+1][j]!=3&& this.matrice_plateau[i+1][j]!=4&& this.matrice_plateau[i+1][j]!=6)
			{
				this.setA(i+1);
				this.matrice_plateau[i][j]=0;
				this.matrice_plateau[i+1][j]=1;
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
			if (this.matrice_plateau[i+1][j]==3 ) {
				for (int k=0;k<liste_monstre.size();k++)
				{
					Monster m = liste_monstre.get(k);
					if (m.pos_a==i+1 && m.pos_b==j)
					{
						m.setPoint_de_vie(m.getPoint_de_vie()-40);
						this.setPointVie(this.getPointVie()-10);
						m.MoveDownMon();
					}
					if (m.getPoint_de_vie()<=0)
					{
						liste_monstre.remove(k);
						matrice_plateau[i+1][j]=0;
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
						this.setPointVie(this.getPointVie()-10);
						f.MoveDownFan();
					}
					if (f.getPointVie()<=0)
					{
						liste_fantome.remove(k);
						matrice_plateau[i+1][j]=0;
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
						this.setPointVie(this.getPointVie()-10);
						m.MoveRightMon();
					}
					if (m.getPoint_de_vie()<=0)
					{
						liste_monstre.remove(k);
						matrice_plateau[i][j+1]=0;
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
						this.setPointVie(this.getPointVie()-10);
						f.MoveRightFan();
					}
					if (f.getPointVie()<=0)
					{
						liste_fantome.remove(k);
						matrice_plateau[i][j-1]=0;
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
					if (m.pos_a==i+1 && m.pos_b==j)
					{
						m.setPoint_de_vie(m.getPoint_de_vie()-40);
						this.setPointVie(this.getPointVie()-10);
						m.MoveUpMon();
					}
					if (m.getPoint_de_vie()<=0)
					{
						liste_monstre.remove(k);
						matrice_plateau[i-1][j]=0;
					}
				}
			}
			else if (this.matrice_plateau[i-1][j]==4) {
				for (int k=0;k<liste_fantome.size();k++)
				{
					Fantome f = liste_fantome.get(k);
					if (f.pos_a==i+1 && f.pos_b==j)
					{
						f.setPointVie(f.getPointVie()-40);
						this.setPointVie(this.getPointVie()-10);
						f.MoveUpFan();
					}
					if (f.getPointVie()<=0)
					{
						liste_fantome.remove(k);
						matrice_plateau[i-1][j]=0;
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
						this.setPointVie(this.getPointVie()-10);
						m.MoveLeftMon();
					}
					if (m.getPoint_de_vie()<=0)
					{
						liste_monstre.remove(k);
						matrice_plateau[i-1][j]=0;
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
						this.setPointVie(this.getPointVie()-10);
						f.MoveLeftFan();
					}
					if (f.getPointVie()<=0)
					{
						liste_fantome.remove(k);
						matrice_plateau[i][j-1]=0;
					}
				}		
			}
		}
	}
}