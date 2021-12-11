import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*;
public class principal extends JFrame implements KeyListener,ActionListener
{
	public Hero notre_heros;
	public int niveau=99;
	public JFrame f;
	public JFrame selection_niveau;
	public JFrame fin;
	public JFrame donnee_joueur;
	public JTextArea nom;
	public JComboBox genre;
	public char genre_heros;
	public static void main(String[] args) 

	{
		new principal();
	}

	principal()
	{
		donnee_joueur= new JFrame("Données du joueur");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(3,1));
		JButton validation = new JButton("Valider");
		validation.addActionListener(this);
		JLabel label1 = new JLabel("Nom du joueur : ");
		nom = new JTextArea();
		nom.setPreferredSize(new Dimension (125,20));
		JLabel label3 = new JLabel("Genre du joueur");
		genre = new JComboBox();
		genre.addItem('M');
		genre.addItem('F');		
		panel1.add(label1);
		panel1.add(nom);
		panel2.add(label3);
		panel2.add(genre);
		panel3.add(validation);
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);
		donnee_joueur.add(panel4);
		donnee_joueur.setSize(300,300);
		donnee_joueur.show();
	}

	void niveau()
	{
		selection_niveau = new JFrame("Selection du niveau");
		JPanel panel=new JPanel();
		JLabel label1 = new JLabel("Appuyez sur 1 pour le niveau 1");
		JLabel label2= new JLabel ("Appuyez sur 2 pour le niveau 2");
		JLabel label3= new JLabel ("Appuyez sur 3 pour le niveau 3");
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		selection_niveau.add(panel);
		selection_niveau.addKeyListener(this);
		selection_niveau.setSize(300, 300); 
		selection_niveau.show();
	}

	void deplacement_heros()
	{
		selection_niveau.dispose();
		notre_heros = new Hero(nom.getText(),genre_heros,20,20,0,0);
		new labyrinthe(this.niveau,notre_heros);
		notre_heros.Affichage(notre_heros.matrice_plateau);
		f = new JFrame("Labyrinthe");
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().add(new Draw(notre_heros));
		f.addKeyListener(this);
		f.setSize(600, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.show();	
	}
	void fin_partie()
	{
		f.dispose();
		fin = new JFrame();
		JLabel message_fin= new JLabel("Bravo, vous avez gagné");
		JPanel panel_fin = new JPanel();
		panel_fin.add(message_fin);
		JButton bouton_rejouer = new JButton("Rejouer avec le même joueur");
		bouton_rejouer.addActionListener(this);
		JButton bouton_changer = new JButton("Changer de joueur");
		bouton_changer.addActionListener(this);
		panel_fin.add(bouton_rejouer);
		panel_fin.add(bouton_changer);
		fin.add(panel_fin);
		fin.setSize(300,300);
		fin.setVisible(true);
		fin.show();
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_DOWN) 
		{ 
			notre_heros.MoveDown();
			f.getContentPane().add(new Draw(notre_heros));
			f.show();
		}

		if (e.getKeyCode() == KeyEvent.VK_UP) { 
			notre_heros.MoveUp();
			f.getContentPane().add(new Draw(notre_heros));
			f.show();
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{ 
			notre_heros.MoveLeft();
			f.getContentPane().add(new Draw(notre_heros));
			f.show();
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			notre_heros.MoveRight();
			f.getContentPane().add(new Draw(notre_heros));
			f.show();
		}
		if (notre_heros.getPosition()[0]==notre_heros.position_arrivee[0] && notre_heros.getPosition()[1]==notre_heros.position_arrivee[1])
		{
			fin_partie();
		}
	}



	@Override
	public void keyTyped(KeyEvent e) 
	{
		if (e.getKeyChar()=='1')
		{
			this.niveau=1;
			deplacement_heros();
		}
		if (e.getKeyChar()=='2')
		{
			this.niveau=2;
			deplacement_heros();
		}
		if (e.getKeyChar()=='3')
		{
			this.niveau=3;
			deplacement_heros();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// pas d'action quand on relache la touche

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getActionCommand() == "Valider")
		{
			donnee_joueur.dispose();
			System.out.println(genre.getSelectedIndex());
			if (genre.getSelectedIndex()== 0)
			{
				genre_heros='M';
			}
			if (genre.getSelectedIndex() == 1)
			{
				genre_heros='F';
			}
			niveau();
		}
		if (e.getActionCommand()=="Rejouer avec le même joueur")
		{
			fin.dispose();
			niveau();
		}
		if (e.getActionCommand()=="Changer de joueur")
		{
			fin.dispose();
			new principal();
		}
	}
}


