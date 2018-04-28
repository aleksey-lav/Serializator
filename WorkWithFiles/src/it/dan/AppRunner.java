package it.dan;

import java.io.File;

import it.dan.model.Item;
import it.dan.service.ItemFileManager;

public class AppRunner {
	public static void main(String[] args) {
		
		String sep = System.getProperty("file.separator");
		String appDir = "/home/al/eclipse-workspace" + sep + "test";
		
		
		String filePath = appDir + sep + "test.txt";
		
		Item item = new Item("artId1", "My favorite item", 3000, new File("/home/al/eclipse-workspace/test/harm.jpg"));
		
		ItemFileManager itemFileManager = new ItemFileManager();
		
		itemFileManager.saveItemToFile(item, filePath);
		
	}
}
