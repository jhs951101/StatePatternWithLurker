package pkg;

public class Main {
	public static void main(String[] args){
		
		Lurker lurker = new Lurker();
		
		lurker.move(1,1);
		lurker.attack();
		
		lurker.burrow();
		
		lurker.burrow();
		
		lurker.attack();
		lurker.move(2,2);
		
		lurker.unburrow();
		
		lurker.move(3,3);
	}
}
