package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Inventory {
	ItemEntry[] itemList;
	File dataFile;
	//constructor
	public Inventory(String iName) throws FileNotFoundException{
		this.dataFile = new File(iName+".txt");  
		BufferedReader br = new BufferedReader(new FileReader(this.dataFile));
		String rawText;
		try {
			while((rawText = br.readLine())!= null){
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//creates new inventory file
	public static boolean createInventory(String name){
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
	
	//opens inventory file and reads contents to memory
	
	
	//adds new item to inventory file 
	void newInventoryItem(){}
	
	
	//updates values of existing inventory item
	
	
	//prints contents of existing inventory item
	
	
	//deletes inventory item
	
	
	//deletes inventory file
}
