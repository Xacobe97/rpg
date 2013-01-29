public class Player {
	
	int hp = 1000;
	int[][][] inv = new int[32][64][100];
	
	int pos = 0;
	int num = 0;
	int id = 0;
	
	public void setInv(int pos, int num, int id) {
		
		// pos = inventory position
		// num = number of items (only same item)
		// id = item ID
		
		this.pos = pos;
		this.num = num;
		this.id = id;
		
	}
	
}
