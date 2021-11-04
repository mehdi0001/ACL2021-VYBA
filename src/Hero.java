
public class Hero {
	private String name;
	private String gender;
	private float[] InitialPosition;
	public Hero(String name, String gender, float[] initialPosition) {
		this.name = name;
		this.gender = gender;
		InitialPosition = initialPosition;
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
	public float[] getInitialPosition() {
		return InitialPosition;
	}
	public void setInitialPosition(float[] initialPosition) {
		InitialPosition = initialPosition;
	}
	
}
