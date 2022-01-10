package VYBA;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class mur3_1 {
	public List<String> mur31() {
		 {
			    try
			    {
			      // Le fichier d'entrée
			      FileInputStream file = new FileInputStream("niveaux/niveau3_1.txt");   
			      Scanner scanner = new Scanner(file);  
			      String mur31 = "";
			      //renvoie true s'il y a une autre ligne à lire
			      while(scanner.hasNextInt())
			      {
			    	  int mur = scanner.nextInt();
			    	  String s=Integer.toString(mur);
			    	  mur31=mur31+s+";";
			    	  
			      }
					// To array
					String[] arr = mur31.split(";");

					// To fixed-size list
					List<String> l2 = Arrays.asList(mur31.split(";"));

					// To ArrayList
					//List<String> l2 = new ArrayList<>(Arrays.asList(input.split(",")));
					
			      scanner.close(); 
			      return l2;
			    }
			    catch(IOException e)
			    {
			      e.printStackTrace();
			      return null;
			    }
				
			  }

	}
}
