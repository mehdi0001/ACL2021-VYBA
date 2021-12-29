public class Monster{ //extends Plateau{
	private int nbr_monster;
	private int id_monster;
	public static int point_de_vie_initiale = 100;
	private int point_de_vie;
	public int pos_a,pos_b;
	private Plateau plat;
	public int[] d;
	public Monster(/*int nbr_monster,*/ int id_monster, int point_de_vie, /*int n, int m,*/ int a, int b, Plateau p) {
		//super(n, m, a, b);
		//this.nbr_monster = nbr_monster;
		this.id_monster = id_monster;
		this.point_de_vie = point_de_vie;
		this.pos_a=a;
		this.pos_b=b;
		this.plat=p;
	}
	public int getNbr_monster() {
		return nbr_monster;
	}
	public void setNbr_monster(int nbr_monster) {
		this.nbr_monster = nbr_monster;
	}
	public int getId_monster() {
		return id_monster;
	}
	public void setId_monster(int id_monster) {
		this.id_monster = id_monster;
	}
	public int getPoint_de_vie() {
		return point_de_vie;
	}
	public void setPoint_de_vie(int point_de_vie) {
		this.point_de_vie = point_de_vie;
	}
	public int[] getPosition_monster(){
		int[] d = {0,0};
		for(int i=0; i<this.plat.matrice_plateau.length;i++){
			for(int j=0; j<this.plat.matrice_plateau[0].length;j++){
				if (this.plat.matrice_plateau[i][j]==3){
					d[0] = i;
					d[1] = j;
				}
			}
		}
		return d;
	}
	public void MoveRightMon()
	{
		int i =pos_a;
		int j = pos_b;
		if(j!= this.plat.matrice_plateau[0].length-1 && this.plat.matrice_plateau[i][j+1]!=2 && this.plat.matrice_plateau[i][j+1]!=3 && this.plat.matrice_plateau[i][j+1]!=4) 
		{
			this.plat.matrice_plateau[i][j]=0;
			this.plat.matrice_plateau[i][j+1]=3;
			pos_b=pos_b+1;
		}
	}
	public void MoveUpMon()
	{
		int i =pos_a;
		int j = pos_b;
		if(i!=0 && this.plat.matrice_plateau[i-1][j]!=2 && this.plat.matrice_plateau[i][j-1]!=3 && this.plat.matrice_plateau[i][j-1]!=4) {
			this.plat.matrice_plateau[i][j]=0;
			this.plat.matrice_plateau[i-1][j]=3;
			pos_a=pos_a-1;
		}
	}
	public void MoveLeftMon()
	{
		int i =pos_a;
		int j = pos_b;
		if(j!= 0 && this.plat.matrice_plateau[i][j-1]!=2 && this.plat.matrice_plateau[i][j-1]!=3 && this.plat.matrice_plateau[i][j-1]!=4) {
			this.plat.matrice_plateau[i][j]=0;
			this.plat.matrice_plateau[i][j-1]=3;
			pos_b=pos_b-1;
		}
	}
	public void MoveDownMon()
	{
		int i =pos_a;
		int j = pos_b;
		if(i!= this.plat.matrice_plateau.length-1 && this.plat.matrice_plateau[i+1][j]!=2 && this.plat.matrice_plateau[i+1][j-1]!=3 && this.plat.matrice_plateau[i+1][j-1]!=4) {
			this.plat.matrice_plateau[i][j]=0;
			this.plat.matrice_plateau[i+1][j]=3;
			pos_a=pos_a+1;
		}
	}


}
