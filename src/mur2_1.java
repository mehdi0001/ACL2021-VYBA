import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class mur2_1 {
	public List<String> mur21() {
		 {
			    try
			    {
			      // Le fichier d'entrée
			      FileInputStream file = new FileInputStream("niveaux/niveau2_1.txt");   
			      Scanner scanner = new Scanner(file);  
			      String mur21 = "";
			      //renvoie true s'il y a une autre ligne à lire
			      while(scanner.hasNextInt())
			      {
			    	  int mur = scanner.nextInt();
			    	  String s=Integer.toString(mur);
			    	  mur21=mur21+s+";";
			    	  
			      }
					// To array
					String[] arr = mur21.split(";");

					// To fixed-size list
					List<String> l2 = Arrays.asList(mur21.split(";"));

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
