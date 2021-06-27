package pkg;

public class Lurker {
	private BurrowState unburrowstate;
	private BurrowState burrowstate;
	
	private BurrowState mode;
	
	public Lurker(){
		unburrowstate = new Unburrow(this);
		burrowstate = new Burrow(this);
		
		mode = unburrowstate;
	}
	
	void setState(BurrowState am){
		mode = am;
	}
	
	public void move(int x, int y){
		mode.move(x, y);
	}
	
	public void attack(){
		mode.attack();
	}
	
	public void burrow(){
		mode.burrow();
	}
	
	public void unburrow(){
		mode.unburrow();
	}
	
	public BurrowState getUnburrowState(){
		return unburrowstate;
	}
	
	public BurrowState getBurrowState(){
		return burrowstate;
	}
}