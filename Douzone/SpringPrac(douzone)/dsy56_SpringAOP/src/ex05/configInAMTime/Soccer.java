package ex05.configInAMTime;

public class Soccer implements PlayerView{
	private NewPlayer player;

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("name: "+player.getName());
		System.out.println("position: "+player.getPosition());
		System.out.println("sports: "+player.getSports());
		System.out.println("Entered into stadium!");
		
	}

	public void setPlayer(NewPlayer np) {
		// TODO Auto-generated method stub
		this.player = np;	
	}

}
