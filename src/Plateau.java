
public class Plateau {
	
	private int n; //nombres de lignes
	private int m;//nombres de colonne
	private int a;
	private int b;
	public int [][] matrice_plateau;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Plateau(int n, int m, int a, int b) {
		this.n = n;
		this.m = m;
		this.a = a;
		this.b = b;
		this.matrice_plateau=gettableau();
		
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int[][] gettableau(){
		int[][] tableau = new int[n][];
		for (int i=0 ; i<tableau.length; i++)
			tableau[i]=new int[m];
		tableau[a][b] = 1;
		return tableau;
	}
	public void Affichage(int[][] tableau) {
		for(int array=0; array<tableau.length; array++) {
			for(int item=0; item<tableau[array].length; item++) {
				System.out.print(tableau[array][item] + "\t");
			}
			System.out.println();
	}
			
	
}
}