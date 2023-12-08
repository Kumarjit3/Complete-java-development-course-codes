
enum Device
{
    D1(10000),D2(12000),D3(13000),D4(15000),D5(17000),D6(19000),D7(20000);

    private int price;


    private Device()
    {
        price = 11000;
    }

    private Device(int price)
    {
        this.price=price;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }
}

public class EnumClass 
{
    public static void main(String[] args) 
    {
        for(Device D : Device.values())
        {
            System.out.print("\n "+D+" : "+D.getPrice()+" \n");
        }

        System.out.print("\n\n\n");
    }
}
