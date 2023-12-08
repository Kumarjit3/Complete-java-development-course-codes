package StaticBasic;

import java.util.Scanner;

public class Mobile 
{
    static String BrandName;
   int Price;
   String MobileName;

   public Mobile()
   {
     MobileName="Realme";
     Price=15000;
     System.err.println("\nIn Constructor\n");
   }

   static
   {
     BrandName="Androide";
     System.err.println("\nIn Static Block\n");
   }

   public void SetMobile()
   {
     Scanner sc = new Scanner(System.in);
     System.err.println("\nEnter The Mobile Name : ");
     MobileName = sc.nextLine();
     System.err.println("\nEnter The Mobile Price : ");
     Price = sc.nextInt();
     sc.close();
   }

   public void ShowMobile()
   {
      System.err.println("\nMobile Name : "+MobileName);
      System.err.println("\nMobile Brand : "+BrandName);
      System.err.println("\nMobile Price : "+Price);
      System.err.println("\n");
   }
}
