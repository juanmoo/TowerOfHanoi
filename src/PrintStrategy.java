
public class PrintStrategy extends Strategy {
	public static void main(String argsp[]) {
		long startTime = System.currentTimeMillis();
		
		int n = 10; //Number of disks on the game;
		
		setBoard(new Board(n));
		setStacks(board.start,board.target,board.other);
		board.printBoard();
		moveN(n);
		System.out.println("It took "+Stack.count+" moves to move "+n+" disks from stack 1 to stack 3.");
		
		System.out.println("It took "+(System.currentTimeMillis()-startTime)+" miliseconds to complete.");
		
	}
}
