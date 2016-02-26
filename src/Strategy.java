public class Strategy {
	
	private static Stack start,target,other;
	public static Board board;
	
	
	public static void setBoard(Board b) {
		board = b;
	}
	
	public static void setStacks(Stack s, Stack t, Stack o) {
		start = s;
		target = t;
		other = o;
	}
	
	public static void move3(Stack start, Stack target, Stack other) {
		
		printMove(start, target);
		start.moveTop(target);
		printMove(start, other);
		start.moveTop(other);
		printMove(target, other);
		target.moveTop(other);
		printMove(start, target);
		start.moveTop(target);
		printMove(other, start);
		other.moveTop(start);
		printMove(other, target);
		other.moveTop(target);
		printMove(start, target);
		start.moveTop(target);
		
		
	}
	
	private static void printMove(Stack start, Stack target) {
		System.out.println("Move disk "+start.getTop()+" from stack "+start+" to stack "+target);
	}
	
	
	
	public static void moveN(int n) {
		if (n == 3) {
			move3(start, target, other);
			board.printBoard();
		}
		
		else {
			setStacks(start, other, target);
			moveN(n-1);
			printMove(start,other);
			start.moveTop(other);
			board.printBoard();
			setStacks(target,other,start);
			moveN(n-1);
			setStacks(other,target,start);
			
		}
	}
	
}