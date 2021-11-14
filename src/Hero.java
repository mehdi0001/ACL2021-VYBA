public class Hero extends Plateau{
	private String name;
	private String gender;
	public Hero(String name, String gender, int n, int m) {
		super(n, m);
		this.name = name;
		this.gender = gender;
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
	public int[] getPosition(){
		int[] a = {0,0};
		for(int i=0; i<gettableau().length;i++){
			for(int j=0; j<gettableau()[0].length;j++){
				if (gettableau()[i][j]==1){
					a[0] = i;
					a[1] = j;
				}
			}
		}
		return a;
	}
	
	public void MoveRight()
	{
		int[] pos = getPosition();
		int i = pos[0];
		int j = pos[1];
		if(j!= gettableau()[0].length-1) {
			gettableau()[i][j] = 0;
			gettableau()[i][j+1] = 1;
		}
	}
	
	public void MoveLeft()
	{
		int[] pos = getPosition();
		int i = pos[0];
		int j = pos[1];
		if(j!=0) {
			gettableau()[i][j] = 0;
			gettableau()[i][j-1] = 1;
		}
	}
	public void MoveUp()
	{
		int[] pos = getPosition();
		int i = pos[0];
		int j = pos[1];
		if(i!=0) {
			gettableau()[i][j] = 0;
			gettableau()[i-1][j] = 1;
		}
	}
	
	public void MoveDown()
	{
		int[] pos = getPosition();
		int i = pos[0];
		int j = pos[1];
		if(i!= gettableau().length-1) {
			gettableau()[i][j] = 0;
			gettableau()[i+1][j] = 1;
		}
}
}