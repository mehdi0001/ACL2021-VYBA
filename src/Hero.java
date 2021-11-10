public class Hero {
	private String name;
	private String gender;
	private int[] InitialPosition;
	public Hero(String name, String gender, int[] initialPosition, Plateau plateau) {
		this.name = name;
		this.gender = gender;
		InitialPosition = initialPosition;
		plateau[InitialPosition[0]][InitialPosition[1]]=1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int[] getInitialPosition() {
		return InitialPosition;
	}
	public void setInitialPosition(int[] initialPosition) {
		InitialPosition = initialPosition;
	}
	
	public int[] getPosition()
	{
		for(int i=0; i<tableau.size(0);i++)
		{
			for(int j=0; j<tableau.size(1);j++)
			{
				if tableau[i][j]==1
						{
							return([i,j])
						}
			}
		}
	}
	
	public void MoveRight()
	{
		pos = getPosition();
		plateau[pos[0]][pos[1]] = 0;
		if(pos[1] != plateau.size(1)-1) {
			plateau[pos[0]][pos[1]+1] = 1;
		}
	}
	
	public void MoveLeft()
	{
		pos = getPosition();
		plateau[pos[0]][pos[1]] = 0;
		if(pos[1] != 0) {
			plateau[pos[0]][pos[1]-1] = 1;
		}
		
	}
	public void MoveUp()
	{
		pos = getPosition();
		plateau[pos[0]][pos[1]] = 0;
		if(pos[0] != 0) {
			plateau[pos[0]-1][pos[1]] = 1;
		}
		
	}
	
	public void MoveDown()
	{
		pos = getPosition();
		plateau[pos[0]][pos[1]] = 0;
		if(pos[1] != plateau.size(0)-1) {
			plateau[pos[0]+1][pos[1]] = 1;
		}
		
	}
}