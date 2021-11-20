import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Draw extends JPanel
{
	int [][] matrice_dessin;
	public Draw(Hero heros)
	{
		this.matrice_dessin=heros.matrice_plateau;
	}
	public void paint(Graphics g)
	{
		for(int array=0; array<matrice_dessin.length; array++) {
			for(int item=0; item<matrice_dessin[array].length; item++) 
			{
				if (matrice_dessin[item][array]==0 || matrice_dessin[array][item]==1)
				{
					g.setColor(Color.green);
					g.fillRect(array*20,item*20,20,20);
				}
				if (matrice_dessin[item][array]==1)
				{
					g.setColor(Color.red);
					g.fillOval(array*20,item*20,20,20);
				}
				if (matrice_dessin[item][array]==2)
				{
					g.setColor(Color.black);
					g.fillRect(array*20,item*20,20,20);
				}

			}
		}

	}
}
