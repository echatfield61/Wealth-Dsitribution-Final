import java.util.*;
public class Driver 
{
    public static void main(String[] args) 
    {
        Data yay = new Data("RawIncomeData.csv");
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter a Country: ");
        String c = reader.nextLine(); 
        System.out.println("Enter a year: ");
        String y = reader.nextLine(); 
            while(yay.getRow(c, y)==-1)
            {
                System.out.println("This data does not exist, enter a new set");
                System.out.println("Enter a Country: ");
                c = reader.nextLine(); 
                System.out.println("Enter a year: ");
                y = reader.nextLine(); 
            }
        
        
            CountryData one = new CountryData(yay, c, y);
            System.out.println("The gini index of "+ c +" in " + y + " is: "+ one.giniIndex());
            System.out.println("press p to quit");
            String p = reader.nextLine();
            if (p.equalsIgnoreCase("p"))
            {
                reader.close();
            }
            else{
                reader.nextLine();
            }


        
         

        //once finished
        reader.close();
        Data test = new Data("RawIncomeData.csv");
        
        
        
        
        
    }
    
}
