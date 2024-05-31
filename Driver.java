public class Driver 
{
    public static void main(String[] args) 
    {
        Data test = new Data("RawIncomeData.csv");
        System.out.println(test.getRow("Japan", "2014"));
        CountryData one = new CountryData(test , "Japan","2014");
        for (int i:one.getIncomeDecile())
        {
            System.out.println(i);
        }
        
        
        
    }
    
}
