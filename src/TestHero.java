import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHero {

	

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
		Hero H = new Hero("Mehdi",'M',20,20,5,5);
		assertEquals(H.getPosition()[0],5);
		assertEquals(H.getPosition()[1],5);
		
	}
	@Test
	void testmoveRight(){
		Hero H = new Hero("Mehdi",'M',20,20,4,5);
		H.MoveRight();
		assertEquals(H.getPosition()[1],6);
	}
	@Test
	void testMoveLeft(){
		Hero H = new Hero("Mehdi",'M',20,20,5,5);   
		H.MoveLeft();
		assertEquals(H.getPosition()[1],4);
	}
	@Test
	void testMoveUp(){
		Hero H = new Hero("Mehdi",'M',20,20,5,5);
		H.MoveUp();
		assertEquals(H.getPosition()[0],4);
	}
	@Test
	void testMoveDown(){
		Hero H = new Hero("Mehdi",'M',20,20,5,5);
		H.MoveDown();
		assertEquals(H.getPosition()[0],6);
	}
	// Maintenant on verifie que le Heros ne peut pas sortir de labyrinthe 
	@Test
	void testRight(){ 
		Hero H = new Hero("Mehdi",'M',20,20,5,19);
		H.MoveRight();
		assertEquals(H.getPosition()[1],19);
		
	}
	@Test
	void testLeft(){ 
		Hero H = new Hero("Mehdi",'M',20,20,19,5);
		H.MoveLeft();
		assertEquals(H.getPosition()[0],19);
		
	}
	@Test
	void testDown() {
		Hero H = new Hero("Mehdi",'M',20,20,19,5);
		H.MoveDown();
		assertEquals(H.getPosition()[0],19);
		
	}
	@Test
	void testUp() {
		Hero H = new Hero("Mehdi",'M',20,20,0,5);
		H.MoveUp();
		assertEquals(H.getPosition()[0],0);
		
	}
	@Test
	void testHeromur(){  //ici on teste que le hero ne peut pas franchire le mur 
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(1,p);
		Hero H = new Hero("Mehdi",'M',20,20,0,0);
		H.MoveRight();
		assertEquals(p.matrice_plateau[0][0],1); //dans notre code on a donne le numero 1 au mur 
	}


}
