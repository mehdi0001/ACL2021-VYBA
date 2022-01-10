package VYBA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLaby {

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
	void testLabLvl1() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(1,p);
		assertEquals(p.matrice_plateau[0][1],2);
		assertEquals(p.matrice_plateau[1][1],2);
	}
	@Test
	void testLabLvl2() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(2,p);
		assertEquals(p.matrice_plateau[6][0],2);// mur 0 
		assertEquals(p.matrice_plateau[11][3],2);// mur 20
		assertEquals(p.matrice_plateau[16][13],2);//mur 77
		
		
	}
	@Test
	void testLabLvl3() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(3,p);
		assertEquals(p.matrice_plateau[15][0],2);// mur 0 
		assertEquals(p.matrice_plateau[2][2],2);// mur 20
		assertEquals(p.matrice_plateau[0][9],2);//mur 77		
	}
	@Test
	void TestCaseTeleplvl1() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l = new labyrinthe(1,p);
		assertEquals(p.matrice_plateau[7][4],8);
		assertEquals(p.matrice_plateau[19][17],8);
	}
	@Test
	void TestCaseTeleplvl2() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l2 = new labyrinthe(2,p);
		assertEquals(p.matrice_plateau[1][4],8);
		assertEquals(p.matrice_plateau[17][17],8);
	}
	@Test
	void TestCaseTeleplvl3() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l3 = new labyrinthe(3,p);
		assertEquals(p.matrice_plateau[2][6],8);
		assertEquals(p.matrice_plateau[6][16],8);
	}
	@Test
	void TestCaseArrivelvl1() {
		Plateau p = new Plateau(20,20,0,0);
		labyrinthe l1 = new labyrinthe(1,p);
	
		assertEquals(p.matrice_plateau[0][19],5);
		
	}
	@Test
	void TestCaseArrivelvl2() {
		Plateau p = new Plateau(20,20,0,0);
		
		labyrinthe l2 = new labyrinthe(2,p);
		
		
		assertEquals(p.matrice_plateau[0][19],5);
		
	}
	@Test
	void TestCaseArriveLvl3() {
		Plateau p = new Plateau(20,20,0,0);
		
		labyrinthe l3 = new labyrinthe(3,p);
		
		assertEquals(p.matrice_plateau[12][19],5);
	}
	@Test
	void TestCaseMagiqueLvl1() {
		Plateau p = new Plateau(20,20,0,0);
		
		labyrinthe l1 = new labyrinthe(1,p);
		assertEquals(p.matrice_plateau[7][8],9);
		assertEquals(p.matrice_plateau[2][8],9);
		assertEquals(p.matrice_plateau[8][13],9);
		assertEquals(p.matrice_plateau[11][19],9);
	}
	@Test
	void TestCaseMagiqueLvl2() {
		Plateau p = new Plateau(20,20,0,0);
		
		labyrinthe l2 = new labyrinthe(2,p);
		assertEquals(p.matrice_plateau[10][8],9);
		assertEquals(p.matrice_plateau[15][18],9);
		assertEquals(p.matrice_plateau[9][1],9);
		assertEquals(p.matrice_plateau[2][17],9);
	}
	@Test
	void TestCaseMagiqueLvl3() {
		Plateau p = new Plateau(20,20,0,0);
		
		labyrinthe l3 = new labyrinthe(3,p);
		assertEquals(p.matrice_plateau[5][14],9);
		assertEquals(p.matrice_plateau[7][9],9);
		assertEquals(p.matrice_plateau[15][19],9);
		assertEquals(p.matrice_plateau[13][4],9);
	}
	@Test
	void TestcasePiegelvl1() {
		Plateau p = new Plateau(20,20,0,0);	
		labyrinthe l1 = new labyrinthe(1,p);
		assertEquals(p.matrice_plateau[14][16],7);
		assertEquals(p.matrice_plateau[5][3],7);
		assertEquals(p.matrice_plateau[3][17],7);
		assertEquals(p.matrice_plateau[6][5],7);
	}
	@Test
	void TestcasePiegelvl2() {
		Plateau p = new Plateau(20,20,0,0);	
		labyrinthe l2 = new labyrinthe(2,p);
		assertEquals(p.matrice_plateau[9][3],7);
		assertEquals(p.matrice_plateau[15][16],7);
		assertEquals(p.matrice_plateau[8][10],7);
		assertEquals(p.matrice_plateau[13][5],7);
	}
	@Test
	void TestcasePiegelvl3() {
		Plateau p = new Plateau(20,20,0,0);	
		labyrinthe l3 = new labyrinthe(3,p);
		assertEquals(p.matrice_plateau[4][18],7);
		assertEquals(p.matrice_plateau[7][3],7);
		assertEquals(p.matrice_plateau[11][10],7);
		assertEquals(p.matrice_plateau[13][15],7);
	}
}
