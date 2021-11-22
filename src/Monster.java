public class Monster extends Plateau{
	private int nbr_monster;
	private int id_monster;
	public static int point_de_vie_initiale = 100;
	private int point_de_vie;
	public Monster(int nbr_monster, int id_monster, int point_de_vie, int n, int m, int a, int b) {
		super(n, m, a, b);
		this.nbr_monster = nbr_monster;
		this.id_monster = id_monster;
		this.point_de_vie = point_de_vie;
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
		for(int i=0; i<this.matrice_plateau.length;i++){
			for(int j=0; j<this.matrice_plateau[0].length;j++){
				if (this.matrice_plateau[i][j]==3){
					d[0] = i;
					d[1] = j;
				}
			}
		}
		return d;
	}

	
}
