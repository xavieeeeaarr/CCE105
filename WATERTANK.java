
public class WaterTank {
	private int capacity;
	private int currentLevel;
	
	//constructor
	public WaterTank(int capacity) {
		this.capacity = capacity;
		this.currentLevel = 0;
	}
	
	//transformer
	
	public void fill (int amount ) {
		currentLevel += amount;
		if(currentLevel>capacity) {
			currentLevel = capacity;
		}
		else 
			System.out.println("Wrong!");
	}
	
	public void drain (int amount) {
		if(currentLevel<0) {
			currentLevel=0;
		}
		
		else
			currentLevel -=amount;
	}
	
	//observer
	
	public int getCurrentLevel() {
		return currentLevel;
	}
	public int getCapacity() {
		return capacity;
	}

}




----------------------------------------------------


  public class main {
	
	public static void main(String[]args) {
		WaterTank tank = new WaterTank(100);
		tank.fill(50);
		
		System.out.println("Current Level: "+ tank.getCurrentLevel());
		
		
	}

}
