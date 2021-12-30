package src;
import java.io.FileOutputStream;
import java.io.FileWriter;
//import java.io.FileWriter;
import java.io.IOException;
public class test3 {

	public static void main(String[] args) {
		
			try(FileWriter fw = new FileWriter("niveau1_2.txt")) {
				int [][] mur= {{0,1},{1,1},{2,1},{3,1},{3,2},{16,2},{3,3},{6,3},{7,3},{8,3},{16,3},{3,4},{4,4},{5,4},{8,4},{16,4},{8,5},{9,5},{10,5},{11,5},{12,5},{13,5},{16,5},{13,6},{13,7},{13,8},{4,9},{5,9},{6,9},{7,9},{8,9},{13,9},{16,9},{17,9},{13,10},{13,11},{13,12},{13,13},{4,14},{5,14},{6,14},{7,14},{8,14},{13,14},{14,14},{15,14},{10,16},{10,17},{10,18},{11,18},{12,18}};
				for (int k=0;k<mur.length;k++)
				{  
		            fw.write(mur[k][1]+"\n");
		        
		         }
			}
		    catch (IOException ioEx) {
		        ioEx.printStackTrace();
		    }
		
		}
	}

	
