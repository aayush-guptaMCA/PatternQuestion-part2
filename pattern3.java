class pattern3
{
  public static void main(String [] arg)
  {
     for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=i;j++)
         {
             System.out.print(j+""+j+" ");
         }
        System.out.println();
      }
   
    for(int i=5;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
         {
            System.out.print(j+""+j+" ");
         }
      System.out.println();
    }
   for(int i=1;i<=5;i++)
    {
       int number=1;
       for(int j=1;j<=i;j++)
        {
           System.out.print(number);
           number++;
        }
      System.out.println();
    }   


  }
}
