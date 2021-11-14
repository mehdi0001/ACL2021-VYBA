public class Hero extends Plateau{
	private String name;
	private char c;
	public Plateau p;
	public Hero(String name, char c, int n, int m, int a, int b, Plateau p ){
		super(n, m, a, b);
		this.name = name;
		this.c = c;
		this.p = p;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getc() {
		return c;
	}
	public void setGender(char c) {
		this.c = c;
	}
	public int[] getPosition(){
		int[] d = {0,0};
		for(int i=0; i<p.gettableau().length;i++){
			for(int j=0; j<p.gettableau()[0].length;j++){
				if (p.gettableau()[i][j]==1){
					d[0] = i;
					d[1] = j;
				}
			}
		}
		return d;
	}
	
	public void MoveRight()
	{
		int[] pos = getPosition();
		int j = pos[1];
		if(j!= p.gettableau()[0].length-1) {
			p.setB(j+1);
		}
	}
	
	public void MoveLeft()
	{
		int[] pos = getPosition();
		int j = pos[1];
		if(j!=0) {
			p.setB(j-1);
		}
	}
	public void MoveUp()
	{
		int[] pos = getPosition();
		int i = pos[0];
		if(i!=0) {
			p.setA(i-1);
		}
	}
	
	public void MoveDown()
	{
		int[] pos = getPosition();
		int i = pos[0];
		if(i!= gettableau().length-1) {
			p.setA(i+1);
		}
}
}