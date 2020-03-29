package application;

import java.io.File;
import java.io.IOException;

public class Inventory {
	
	//creates new inventory file
	boolean createInventory(String name){
		String fileAddress = new String(name + ".txt");
		try{
			File newFile = new File(fileAddress);
			  if (newFile.createNewFile()) {
				  System.out.println("New Inventory File: " + newFile.getName());
					return true;
			  } else {
				  System.out.println("File already exists.");	
			  }
		} catch (IOException e) {
		      e.printStackTrace();
		} 
		return false;
	}
	
	//adds new item to inventory file 
	void newInventory
	
	
	//updates values of existing inventory item
	
	
	//prints contents of existing inventory item
	
	
	//deletes inventory item
	
	
	//deletes inventory file
}
