interface Computer 
{  
    int NoOfComputers=100;   // By Default all the variables are final & static in interface 
    String ComputerBrand="Dell";
    void code();    
}

class Laptop implements Computer
{
   public void code()
   {
     System.out.print("\nin Laptop\n");
   }

public void SetLaptop() {
}
}

class Desktop implements Computer
{

    public void code()
   {
     System.out.print("\nin Desktop\n");
   }
}

class Developer
{
    public void DdevApp(Computer ld)
    {
        ld.code();
    }
}


public class InterfaceBasic 
{
    public static void main(String[] args) 
    {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer Kumarjit = new Developer();
        Kumarjit.DdevApp(lap);
        Kumarjit.DdevApp(desk);
       
    }
}