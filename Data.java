import java.util.*;
import java.io.*;

public class Data {
  
  private ArrayList<String> unformattedData;
  private String[][] formattedData;
  private File fileName;
  
  public Data(String file) {
    try {
      fileName = new File(file); //opens the file to read
      Scanner scan = new Scanner(fileName); //instantiates a Scanner to read file
      
      /* Initialize the ArrayList and read through the file, populating the  */
      unformattedData = new ArrayList<String>();
      int c =1;
      while (scan.hasNextLine())
      {
        unformattedData.add(scan.nextLine());
        c++;
      }
      
      /* populate unformattedData array with data from the table */
      /* use String method replaceAll to get rid double quotes */
      
      
      /* parse through the first row of unformattedData to num of columns */
      
      
      
      /* initialize the formattedData array using rows and columns */
      
      
      
      /* populate formattedData array with data from unformattedData */
      


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
  
  public String[][] getFormattedData() {
    return formattedData;
  }
  
  
  /* Returns the row containing the country and year. Returns -1 if not found. */
  public int getRow(String countryName, String year) {\
    /* finish method */

    return -1;
  }
}
