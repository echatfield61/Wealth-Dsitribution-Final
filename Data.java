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
      int yay = 0;
      for (int i = 0; i < unformattedData.get(0).length();i++)
      {
        if(unformattedData.get(0).substring(i,i+1).equals(","))
        {
          yay++;
        }
      }
      
      
      /* initialize the formattedData array using rows and columns */
      
      formattedData = new String[c][yay];
      
      /* populate formattedData array with data from unformattedData */
      int base = 0; 
      int t = 0;
      for (int x=0; x<unformattedData.size();x++)
      {
        for (int i = 0; i < unformattedData.get(0).length();i++)
        {
          if(unformattedData.get(0).substring(i,i+1).equals(","))
          {
            formattedData[x][t] = unformattedData.get(0).substring(base,i);
            base = i+1;
            t++;
          
          }
        }
      }


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
  
  public String[][] getFormattedData() {
    return formattedData;
  }
  
  
  /* Returns the row containing the country and year. Returns -1 if not found. */
  public int getRow(String countryName, String year) 
  {
    
    for (int i = 0; i< formattedData.length; i++)
    {
      if (formattedData[i][0].equals(countryName)&&formattedData[i][1].equals(year))
      {
        return i;
      }
    }

    return -1;
  }
}
