package fileops;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class fileopsclass {
	 public static void CreateFile() {
		try {
	        File myObj = new File("C:/Users/maninder/filename.txt");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("Unable to create the file");
	        e.printStackTrace();
	      }
	    }
	public static void SortFile() {
		File fileDir = new File("C:/Users/maninder/Documents");
		if(fileDir.isDirectory()){
			List<String> listFile = Arrays.asList(fileDir.list());
			System.out.println("Listing files unsorted");
			for(String s:listFile){
				System.out.println(s);
			}
			Collections.sort(listFile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order");
			for(String s:listFile){
				System.out.println(s);
			}
		}
		else{
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		}
	}
	public static void AddData() {
		try {
			FileWriter myWriter = new FileWriter("C:/Users/maninder/filename.txt");
			myWriter.write("Java is the prominent programming language of the millenium!"); 
			 myWriter.close(); 
			System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
			System.out.println("File not Found.");
			e.printStackTrace();
			}
			}
	public static void DeleteData() {
	    File myObj = new File("C:/Users/maninder/filename.txt"); 
	    if (myObj.delete()) { 
	      System.out.println("File deleted: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	  } 
	public static void SearchData() {
		  File dir = new File("C:/Users/maninder/Documents");
	      String[] sum = dir.list();
	   if (sum == null) {
	         System.out.println("Does not exist in the directory");
	      } else {
	         for (int i = 0; i < sum.length; i++) {
	            String filename = sum[i];
	            System.out.println("File found:"+ filename);
	         }
	      }
	  	}
	public static void main(String[] args) {
		fileopsclass f=new fileopsclass();
		f.CreateFile();
		int num=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the choice:");
	num=s.nextInt();
	int num1 =num+1;
	
	switch (num) {
	case 1:
		System.out.println("File in Ascending Order");
		f.SortFile();
		break;
		case 2:
		switch(num1) {
		case 3:
			f.AddData();
			break;
	case 4:
		f.DeleteData();
		break;
	case 5:
		f.SearchData();
		break;
		default:
			System.out.println("Chioce was not there");
		break;
		}
	case 6:
		System.exit(0);
	
		break;
		
	}
	}
}
		
		
	



