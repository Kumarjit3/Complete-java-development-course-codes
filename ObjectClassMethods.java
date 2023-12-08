import java.util.Scanner;

class Laptop
{
    Scanner sc = new Scanner(System.in);

     private String LaptopName;
     private long LaptopPrice;
     private String LaptopBrand;

     public Laptop()
     {
        LaptopName="Inspiron153000";
        LaptopBrand="Dell";
        LaptopPrice=70000;
     }

     public String toString() //object class method
     {
        return "Hello From Laptop Class";
     }

     public boolean equals(Laptop that)  //object class method
     {
         System.out.print("\n"+this.LaptopBrand+that.LaptopBrand);
         System.out.print("\n"+this.LaptopName+that.LaptopName);
         System.out.print("\n"+this.LaptopPrice+that.LaptopPrice);
        if( (this.LaptopBrand.equals(that.LaptopBrand)) && (this.LaptopName.equals(that.LaptopName)) && (this.LaptopPrice == that.LaptopPrice) )
        {
         return true;
        }
        else
        {
        return false;
        }
     }

     public void SetLaptop()
     {
        System.out.print("\nEnter The Laptop Name : ");
        LaptopName = sc.nextLine();
        System.out.print("\nEnter The Laptop Brand : ");
        LaptopBrand = sc.nextLine();
        System.out.print("\nEnter The Laptop Price : ");
        LaptopPrice = sc.nextInt();
     }

     public void ShowLaptop()
     {
        System.out.print("\nThe Full Laptop Details : \n\n");
        System.out.print(LaptopName +" : "+LaptopBrand+" : "+LaptopPrice+"\n");
        System.out.print("\n");
     }
}

public class ObjectClassMethods 
{
    public static void main(String[] args) 
    {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        
        l1.SetLaptop();
        l2.SetLaptop();

        System.out.print("\n "+l1.equals(l2)+"\n\n\n\n");
    }
}
