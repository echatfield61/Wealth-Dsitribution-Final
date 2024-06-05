public class Driver 
{
    public static void main(String[] args) 
    {
        Data test = new Data("RawIncomeData.csv");
        
        CountryData one = new CountryData(test ,"Hungary","2009");
        System.out.println(test.getRow("Japan", "2014"));
        System.out.println(one.giniIndex());
        
        
        
    }
    
}
