package application;

public class User {
	String name, usrCode;
	int privilege;
	
	//constructor for User takes input from loggin() to create instance of user object
	public User(){
		
		return;
	}
	
	//searches ~/users/<usrCode>.txt locks  
	void login(){}
	
	//saves object data to ~/user/<usrCode>.txt
	void logout(){}
	
	//moves items from one inventory must have privilege
	void transfer(String doner, String reciever, int numItem){
		//check if user is privileged to make transfer
		if(privilege > 2){
			//remove numItem items from doner
			//give numItem items to reciever
		}
	}
	
	
	//removes item, writes trasaction into log file
	void useItem(String itemName, int numItem){
		//remove items from Inventory
		//write to log file
	}
	
	//allows user to view inventory
	void viewInventory(String inventoryName){
		//print contents of inventory
	}
}
