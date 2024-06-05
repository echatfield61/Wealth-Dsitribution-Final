public class CountryData 
{
    private String name;
    private int year;
    private int population;
    private int[] incomeDeciles;
    public CountryData(Data incomeData , String country, String y)
    {
            int count = 0;
            int yay = incomeData.getRow(country,y);
            incomeDeciles= new int[10];
            for (int i = 0; i<13; i++)
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
                    
                    incomeDeciles[count] = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                    count++;
                
                }
                if (i==11)
                {
                    population = Integer.parseInt(incomeData.getFormattedData()[yay][i]);
                
                }
               
            
        
            

            
            
            }
        
        }
    public int[] getIncomeDecile()
    {
        return incomeDeciles;
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
        double total = 0;
        double yay = 0;
        if(incomeDeciles.length > 0)
        {
        for (int t=0; t<incomeDeciles.length;t++)
        {
            total+=incomeDeciles[t];
            if (t == 0|| t == incomeDeciles.length -1)
            {
                yay+=total;
            }
            else
            {
                yay+=total*2;
            }
            
            
        }
        
        return 1-((0.1/totalIncome())*yay);
    }
    return 0;
}

}

    

