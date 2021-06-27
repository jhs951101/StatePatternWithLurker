package pkg;

class Burrow implements BurrowState{
	
	Lurker lurker;
	
	public Burrow(Lurker s){
		this.lurker = s;
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println("Error: You can't move in Burrow State.");
	}

	@Override
	public void attack() {
		System.out.println("The Lurker has attacked enemies! (damage: 100)");
	}

	@Override
	public void burrow() {
		System.out.println("Error: Already in Burrow State.");
	}

	@Override
	public void unburrow() {
		lurker.setState(lurker.getUnburrowState());
		System.out.println("The Lurker has unburrowed.");
	}
}