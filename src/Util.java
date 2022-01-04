import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Util {
	public static void createTextFile(String fileName) {
		try {
		      File file = new File(fileName);
		      if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		      } else {
		        System.out.println("File already exists. (" + file.getName() + ")");
		      }
		      
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public static void writeToFile(String fileName, String msg) {
		try {
			//Set append the text file to true.
		    	FileWriter myWriter = new FileWriter(fileName,true);
		     //Write the msg into the text file and write true.
		    	myWriter.write(msg +"\n");
		    //Close the writer.
		    	myWriter.close();
		    	System.out.println();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	
	public static String[] readATextFile(String fileName) {
		        File file = new File(fileName);
		        int counter = 0;
		        
		        BufferedReader br = null;
		        
				try {
					br = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
		        
		        try {
		            
		            while (br.readLine() != null) {
		            	
		                counter++;
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        String[] lines = new String[counter];
		        
		        
		        try {
					br = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		        
		        counter = 0;
		        try {
		            for(int i =0; i < lines.length; i++) {
		            	lines[i] = br.readLine();
		            }
		            //Read to move cursor down one more line.
		            br.readLine();
		        }
		        
		        catch (IOException e) {
		            e.printStackTrace();
		        }
		        return lines;
	}
	

	
	public static boolean fileExists(String filePathString) {
		File f = new File(filePathString);
		if(f.exists() && !f.isDirectory()) { 
			return true;
		}
		else
			return false;
	}
	
	//https://stackoverflow.com/questions/7080205/popup-message-boxes
		public static void warningBox(String infoMessage, String titleBar)
	    {
	        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.WARNING_MESSAGE);
	    }
		
		//https://stackoverflow.com/questions/3987921/not-able-to-delete-the-directory-through-java
		public static boolean deleteFile(String pathName) {
			File path = new File(pathName);
			try {
				return path.delete();
		    }
		    catch(Exception e) {
			
			
			if (path.exists()) {
		        File[] files = path.listFiles();
		        for (int i = 0; i < files.length; i++) {
		            if (files[i].isDirectory()) {
		            	deleteFile(files[i].getName());
		            } else {
		                files[i].delete();
		            }
		        }
		    }
		    return (path.delete());
		    }
		}

	
}
