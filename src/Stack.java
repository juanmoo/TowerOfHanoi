import java.util.ArrayList;

public class Stack {

	public int id;
	
	public static int count;
	
	public Stack(int n, int identifier) {
      id = identifier;
		for (int i = 1; i<=n; i++) {
			this.add(i);
		}
	}

	public Stack(int identifier) {
      id = identifier;
	}

	public ArrayList<Integer> diskStack = new ArrayList<Integer>();

	public int numDisks() {
		return diskStack.size();
	}

	public int getDisk(int height){
		return diskStack.get(height);
	}

	public int getTop() {
		return getDisk(diskStack.size()-1);
	}

	public void add(int diskNum) {
		diskStack.add(diskNum);
	}

	public void moveTop(Stack otherStack) {
		otherStack.add(diskStack.remove(diskStack.size()-1));
		count = count==0?1:count+1;
		
	}
   
   @Override
   public String toString() {
      return id+"";
   }
}
