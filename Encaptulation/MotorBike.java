package Encaptulation;
import java.util.Scanner;

public class MotorBike
{
    private String BikeName;
    private String BikeBrand;    
    private long BikePrice;

    public MotorBike() 
    {
        BikeBrand = "ShineSP";
        BikeBrand = "Honda";
        BikePrice = 106999;
    } 

    public void SetBike()
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("\nEnter The Bike Name : ");
         BikeName = sc.nextLine();
         System.out.print("\nEnter The Bike Brand Name : ");
         BikeBrand = sc.nextLine();
         System.out.print("\nEnter The Bike Price Name : ");
         BikePrice = sc.nextLong();
         System.out.print("\n");
         sc.close();
    }

    public void ShowBike()
    {
         System.out.print("\nThe Full Bike Details Is Given Bellow : \n\n");
         System.out.print("\nBike Name : "+BikeName);
         System.out.print("\nBike Brand : "+BikeBrand);
         System.out.print("\nBike Price: "+BikePrice+"\n\n");
    }

}