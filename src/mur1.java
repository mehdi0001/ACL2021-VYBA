import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class mur1{
  public List<String> mur11()
  {
    try
    {
      // Le fichier d'entrée
      FileInputStream file = new FileInputStream("niveaux/niveau1.txt");   
      Scanner scanner = new Scanner(file);  
      String mur11 = "";
      //renvoie true s'il y a une autre ligne à lire
      while(scanner.hasNextInt())
      {
    	  int mur = scanner.nextInt();
    	  String s=Integer.toString(mur);
    	  mur11=mur11+s+";";
    	  
    	  
      }
		// To array
		String[] arr = mur11.split(";");

		// To fixed-size list
		List<String> l = Arrays.asList(mur11.split(";"));

		// To ArrayList
		//List<String> l2 = new ArrayList<>(Arrays.asList(input.split(",")));
		//System.out.println(l);
      scanner.close();
      return l;
    }
    catch(IOException e)
    {
    	e.printStackTrace();
    	return null;
    }
	

  }
}

