
public class Board {
	
   public Stack stack1, stack2, stack3;
   
   public Stack start;
   
   public Stack target;
   
   public Stack other;
   
   public Stack temp;
   
   

	public Board(int n) {
		stack1 = new Stack(n,1);
		stack2 = new Stack(2);
		stack3 = new Stack(3);
      
      start = stack1;
      target = stack3;
      other = stack2;
	}
   
   
   
   public void printBoard() {
      System.out.println(stack1.diskStack);
      System.out.println(stack2.diskStack);
      System.out.println(stack3.diskStack+"\n");
   }
}
