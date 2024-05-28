public class Driver 
{
    public static void main(String[] args) 
    {
        StudentData test = new StudentData("RawIncomeData.csv");
        CountryData one = new CountryData(test , "Japan", "2014");
        CountryData two = new CountryData(test , "United States", "2000");
        CountryData three = new CountryData(test , "Norway", "2010");
        System.out.println("Japan’s Gini index in 2014 was: " + one.giniIndex());
        System.out.println("United States’ Gini Index in 2000 was:" + two.giniIndex());
        System.out.println("Norway’s Gini Index in 2010 was: " + three.giniIndex());
        
    }
    
}
