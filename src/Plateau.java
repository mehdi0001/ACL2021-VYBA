class Methods {
	public void Matrice (int n, int m) {
		
		int[][] Dimmension = new int[n][];
		for (int i=0 ; i<Dimmension.length; i++)
		    Dimmension[i]=new int[m];
	
		for(int array=0; array<Dimmension.length; array++) {
			for(int item=0; item<Dimmension[array].length; item++) {
				System.out.print(Dimmension[array][item] + "\t");
			}
			System.out.println();
	}
	
}
}
public class Plateau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods run = new Methods();
		run.Matrice(5,5);
		
	}

}
