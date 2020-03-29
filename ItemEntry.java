public class ItemEntry {
	int quantity;
	String name;
	
	public ItemEntry(String n, int q){
		this.quantity = q;
		this.name = n;
		return;
	}
	
	public String getName(){
		return this.name;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public void setQuantity(int newQ){
		this.quantity = newQ;
	}
}
