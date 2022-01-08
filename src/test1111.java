
public class test1111 {

	public static void main(String[] args) {
		mur3_2 m2 = new mur3_2();
		System.out.println(m2.mur32());
		Plateau p = new Plateau(20,20,0,0);
        labyrinthe l = new labyrinthe(3,p);
        Hero H = new Hero("Mehdi",'M',20,20,0,0);
        System.out.println(p.matrice_plateau[19][17]);
	}
	
	

}
