import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHero  {

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testExistHero() {
		
		
		try {
			Hero H = new Hero("Mehdi",'M',20,20,-5,5);
			assertEquals(H.getPosition()[0],-5);
			assertEquals(H.getPosition()[1],5);
		} catch (Exception e) {
			      System.out.println("Saisir des positions initiales positifs");
			      
		}
		
	}
	@Test
	void testmoveRight(){
		Hero H = new Hero("Mehdi",'M',20,20,4,5);
		try {
			H.MoveRight();
			assertEquals(H.getPosition()[1],6);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	void testMoveLeft(){
		Hero H = new Hero("Mehdi",'M',20,20,5,5);   
		try {
			H.MoveLeft();
			assertEquals(H.getPosition()[1],4);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	void testMoveUp(){
		Hero H = new Hero("Mehdi",'M',20,20,5,5);
		try {
			H.MoveUp();
			assertEquals(H.getPosition()[0],4);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	void testMoveDown(){
		Hero H = new Hero("Mehdi",'M',20,20,5,5);
		try {
			H.MoveDown();
			assertEquals(H.getPosition()[0],6);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	// Maintenant on verifie que le Heros ne peut pas sortir de labyrinthe 
	@Test
	void testRight(){ 
		Hero H = new Hero("Mehdi",'M',20,20,5,19);
		try {
			H.MoveRight();
			assertEquals(H.getPosition()[1],19);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		
		
	}
	@Test
	void testLeft(){ 
		Hero H = new Hero("Mehdi",'M',20,20,19,5);
		try {
			H.MoveLeft();
			assertEquals(H.getPosition()[0],19);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		
	}
	@Test
	void testDown() {
		Hero H = new Hero("Mehdi",'M',20,20,19,5);
		try {
			H.MoveDown();
			assertEquals(H.getPosition()[0],19);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		
	}
	@Test
	void testUp() {
		Hero H = new Hero("Mehdi",'M',20,20,0,5);
		try {
			H.MoveUp();
			assertEquals(H.getPosition()[0],0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	void testHeromur(){  //ici on teste que le hero ne peut pas franchire le mur 
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(1,p);
		Hero H = new Hero("Mehdi",'M',20,20,0,0);
		try {
			H.MoveRight();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		assertEquals(p.matrice_plateau[0][0],1); //dans notre code on a donne le numero 1 au Hero 
	}
	@Test
	void testtelep() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(1,p);
		Hero H = new Hero("Mehdi",'M',20,20,7,3);
		H.matrice_plateau[7][4]=1;
		H.teleportation();
		assertEquals(H.matrice_plateau[19][17],11);
	}
	@Test
	void case_piege() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(1,p);
		Hero H = new Hero("Mehdi",'M',20,20,5,3);
		H.case_piege();
		assertEquals(H.getPointVie(),85);
		
		}
	void case_magique() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(1,p);
		Hero H = new Hero("Mehdi",'M',20,20,5,3);
		assertNotEquals(H.getPointVie(),100);
		
	}
	

}
	


