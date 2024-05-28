public class CountryData 
{
    private String name;
    private int year;
    private int population;
    private int[] incomeDeciles;
    public CountryData(StudentData incomeData , String country, String y)
    {
            int count = 0;
            int yay = incomeData.getRow(country,y);
            for (int i = 0; i<12; i++)
            {
              if (i==0)
                {
                    name =(incomeData.getFormattedData()[yay][i]);
                }
                if (i==1)
                {
                    year =Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                }
            
                if (i==2)
                {
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                }
                if (i==3)
                {
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                }
                if (i==4)
                {
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                }
                if (i==5)
                {
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                }
                if (i==6)
                {
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                }
                if (i==7)
                {
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                }
                if (i==8)
                {
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                }
                if (i==9)
                {
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                }
                if (i==10)
                {
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                }
                if (i==11)
                {
                    population = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                
                }
            
        
            

            
            
            }
        
        }
    public int totalIncome()
    {
        int total = 0;
        for (int t: incomeDeciles)
        {
            total += t;
        }
        return total;

    }
    public double giniIndex()
    {
        double ans = 0;
        double total = 0;
        double yay = 0;
        for (int t=0; t<incomeDeciles.length;t++)
        {
            if (t == 1|| t == 10)
            {
                total+=incomeDeciles[t];
            }
            else
            {
                total+=(incomeDeciles[t])*2;
            }
            
            yay+=total;
        }
        ans = 1-(0.1/totalIncome());
        return yay*ans;


    }

}

    

