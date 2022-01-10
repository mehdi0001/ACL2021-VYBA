package VYBA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFontome {

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
	void testExistFontome() {
		Plateau p = new Plateau(20,20,0,0);
		Fantome F = new Fantome(7,100,0,0,p);
		assertEquals(F.getPosition()[0],0);
		assertEquals(F.getPosition()[1],0);
	}
	@Test
	void testmoveRight(){
		Plateau p = new Plateau(20,20,0,0);
		Fantome F = new Fantome(7,100,0,0,p);
		F.MoveRightFan();
		assertEquals(F.getPosition()[1],1);
	}
	void testMoveLeft(){
		Plateau p = new Plateau(20,20,5,5);
		Fantome F = new Fantome(7,100,5,5,p);
		F.MoveLeftFan();
		assertEquals(F.getPosition()[1],4);
	}
	@Test
	void testMoveDown() {
		Plateau p = new Plateau(20,20,5,5);
		Fantome F = new Fantome(7,100,5,5,p);
		F.MoveDownFan();
		assertEquals(F.getPosition()[0],6);
		
	}
	@Test
	void TestMoveUp() {
		Plateau p = new Plateau(20,20,5,5);
		Fantome F = new Fantome(7,100,5,5,p);
		F.MoveUpFan();
		assertEquals(F.getPosition()[0],4);
	}
	// Maintenant on verifie que le Fantome ne peut pas sortir de labyrinthe 
	void testRight(){ 
		Plateau p = new Plateau(20,20,0,19);
		Fantome F = new Fantome(7,100,0,19,p);
		F.MoveRightFan();
		assertEquals(F.getPosition()[1],19);
		
	}
	@Test
	void testLeft(){ 
		Plateau p = new Plateau(20,20,5,0);
		Fantome F = new Fantome(7,100,5,0,p);
		F.MoveLeftFan();
		assertEquals(F.getPosition()[1],0);
		
	}
	@Test
	void testDown() {
		Plateau p = new Plateau(20,20,19,5);
		Fantome F = new Fantome(7,100,19,5,p);
		F.MoveRightFan();
		assertEquals(F.getPosition()[0],19);
		
	}
	@Test
	void testUp() {
		Plateau p = new Plateau(20,20,0,5);
		Fantome F = new Fantome(7,100,0,5,p);
		F.MoveUpFan();
		assertEquals(F.getPosition()[0],0);
		
	}
	@Test
	void testmur() {//ici on teste que le fantome ne peut pas franchire le mur 
		Plateau p = new Plateau(20,20,0,0);
		Fantome F = new Fantome(7,100,0,0,p);
		labyrinthe l = new labyrinthe(1,p);
		F.MoveRightFan();
		F.MoveRightFan();
		assertEquals(p.matrice_plateau[0][2],4); // 
	}

	
}
