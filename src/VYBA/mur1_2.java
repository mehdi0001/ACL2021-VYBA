package VYBA;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mur1_2 {

	public List<String> mur12() {
		 {
			    try
			    {
			      // Le fichier d'entrée
			      FileInputStream file = new FileInputStream("niveaux/niveau1_2.txt");   
			      Scanner scanner = new Scanner(file);  
			      String mur12 = "";
			      //renvoie true s'il y a une autre ligne à lire
			      while(scanner.hasNextInt())
			      {
			    	  int mur = scanner.nextInt();
			    	  String s=Integer.toString(mur);
			    	  mur12=mur12+s+";";
			    	  
			      }
					// To array
					String[] arr = mur12.split(";");

					// To fixed-size list
					List<String> l2 = Arrays.asList(mur12.split(";"));

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
