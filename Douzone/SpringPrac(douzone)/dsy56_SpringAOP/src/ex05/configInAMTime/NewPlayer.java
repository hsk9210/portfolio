package ex05.configInAMTime;

public class NewPlayer {
	private String name,position,sports;

	public NewPlayer(String name, String position, String sports) {
		super();
		this.name = name;
		this.position = position;
		this.sports = sports;
	}
	public NewPlayer() {
		this("","","");		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	

}
