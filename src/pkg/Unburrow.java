package pkg;

class Unburrow implements BurrowState{
	
	Lurker lurker;
	
	public Unburrow(Lurker s){
		this.lurker = s;
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println("The Lurker has moved to (" + x + ", " + y + ")");
	}

	@Override
	public void attack() {
		System.out.println("Error: The Lurker can attack enemies only in Burrow State.");
	}

	@Override
	public void burrow() {
		lurker.setState(lurker.getBurrowState());
		System.out.println("The Lurker has burrowed.");
	}

	@Override
	public void unburrow() {
		System.out.println("Error: Already in Unburrow State.");
	}
	
}