
public class TowerOfHanoi {

	public void move(int numberofdisk, char from, char to, char intermediate){
		
		if(numberofdisk == 1){
			System.out.println("Moving disk 1 from " + from + " to " + to);
		}
		else{
		move(numberofdisk-1, from,intermediate,to);
		System.out.println("Moving disk " + numberofdisk + " from " + from + " to " + to);
		move(numberofdisk-1, intermediate,to,from);
	}
	
	}	
	public static void main(String args[]){
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.move(4,'A', 'C', 'B');
		
	}
}
