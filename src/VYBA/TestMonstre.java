package VYBA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMonstre {

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
	void testExistMonstre() {
		Plateau p = new Plateau(20,20,0,0);
		Monster M = new Monster(7,100,0,0,p);
		assertEquals(M.getPosition_monster()[0],0);
		assertEquals(M.getPosition_monster()[1],0);
	}
	@Test
	void testmurmons() { //ici on teste que le monstre ne peut pas franchire le mur 
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(1,p);
		Monster M = new Monster(7,100,0,0,p);
		M.MoveRightMon();
		assertEquals(p.matrice_plateau[0][0],1);//dans notre code on a donne le numero 1 au mur 
	}

	
	@Test
	void testmoveRight(){
		Plateau p = new Plateau(20,20,0,0);
		Monster M = new Monster(7,100,0,0,p);
		M.MoveRightMon();
		assertEquals(M.getPosition_monster()[1],1);
	}
	@Test
	void testMoveLeft(){
		Plateau p = new Plateau(20,20,5,5);
		Monster M = new Monster(7,100,5,5,p);
		M.MoveLeftMon();
		assertEquals(M.getPosition_monster()[1],4);
	}
	@Test
	void testMoveDown() {
		Plateau p = new Plateau(20,20,5,5);
		Monster M = new Monster(7,100,5,5,p);
		M.MoveDownMon();
		assertEquals(M.getPosition_monster()[0],6);
		
	}
	@Test
	void testMoveUp() {
		Plateau p = new Plateau(20,20,5,5);
		Monster M = new Monster(7,100,5,5,p);
		M.MoveUpMon();
		assertEquals(M.getPosition_monster()[0],4);
	}
	// Maintenant on verifie que le montre ne peut pas sortir de labyrinthe 
		@Test
		void testRight(){ 
			Plateau p = new Plateau(20,20,0,19);
			Monster M = new Monster(7,100,0,19,p);
			M.MoveRightMon();
			assertEquals(M.getPosition_monster()[1],19);
			
		}
		@Test
		void testLeft(){ 
			Plateau p = new Plateau(20,20,5,0);
			Monster M = new Monster(7,100,5,0,p);
			M.MoveLeftMon();
			assertEquals(M.getPosition_monster()[1],0);
			
		}
		@Test
		void testDown() {
			Plateau p = new Plateau(20,20,19,5);
			Monster M = new Monster(7,100,19,5,p);
			M.MoveRightMon();
			assertEquals(M.getPosition_monster()[0],19);
			
		}
		@Test
		void testUp() {
			Plateau p = new Plateau(20,20,0,5);
			Monster M = new Monster(7,100,0,5,p);
			M.MoveLeftMon();
			assertEquals(M.getPosition_monster()[0],0);
			
		}
		
}
