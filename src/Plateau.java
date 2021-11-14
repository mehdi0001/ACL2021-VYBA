
public class Plateau {
	
	private int n; //nombres de lignes
	private int m; //nombres de colonne
	public Plateau(int n, int m) {
		this.n = n;
		this.m = m; 
		
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