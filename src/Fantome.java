
public class Fantome extends Plateau {
	private int nbr_fantome;
	private int id_fantome;
	public static int poit_de_vie_intial = 100;
	private int pointVie;
	public Fantome(int n, int m, int a, int b, int nbr_fantome, int id_fantome, int pointVie) {
		super(n, m, a, b);
		this.nbr_fantome = nbr_fantome;
		this.id_fantome = id_fantome;
		this.pointVie = pointVie;
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
		for(int i=0; i<this.matrice_plateau.length;i++){
			for(int j=0; j<this.matrice_plateau[0].length;j++){
				if (this.matrice_plateau[i][j]==4){
					d[0] = i;
					d[1] = j;
				}
			}
		}
		return d;
	}
	
	

}


