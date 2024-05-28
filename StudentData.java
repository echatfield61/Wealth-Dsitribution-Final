import java.util.*;
import java.io.*;

public class StudentData {
  
  private ArrayList<String> unformattedData;
  private String[][] formattedData;
  private File fileName;
  
  public StudentData(String file) {
    try {
      fileName = new File(file); //opens the file to read
      Scanner scan = new Scanner(fileName); //instantiates a Scanner object that will read the file
      
      /* Initialize the ArrayList and read through the file, populating the  */
      
      unformattedData = new ArrayList<String>();
      
      /* populate unformattedData array with data from the table */
      while (scan.hasNextLine())
      {
          unformattedData.add(scan.nextLine().replaceAll("\"", ""));

      }
      /* use String method replaceAll(String replace, String replacement) to get rid double quotes */
      
      
      /* parse through the first row of unformattedData to determine the number of columns */
      int yay = 0;
      for (int i=0;i < unformattedData.get(0).length();i++)
      {
          if(unformattedData.get(0).substring(i,i+1).equals(","))
          {
            yay++;
          }
      }
      
      /* initialize the formattedData array using rows and columns */
      
      formattedData = new String[4][yay+1];
      
      /* populate formattedData array with data from unformattedData */
      for (int x= 0;x<unformattedData.size();x++)
      {
          int count = 0;
          int base = 0;
          for (int i = 0; i<unformattedData.get(x).length(); i++)
          {
                if (unformattedData.get(x).substring(i, i+1).equals(","))
                {
                    formattedData[x][count] = unformattedData.get(x).substring(base,i);
                    base = i+1;
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
    for (int i = 0; i< formattedData.length;i++)
    {
      boolean y = false;
      boolean n = false;
      for (int x = 0; x < formattedData[0].length;i++)
      {
        if (formattedData[i][x].equals(countryName))
        {
          n = true;
        }
        if (formattedData[i][x].equals(year))
        {
          y = true;
        }
        

      }
      if(n&&y)
      {
        return i;
      }
    }
  
    return -1;
  }
}