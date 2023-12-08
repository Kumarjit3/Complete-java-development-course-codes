enum status
{
    Running,Processing,Pending,Failed,Success;
}

public class EnumBasic
{
    public static void main(String[] args)
    {
       //Printing Only One Status 
       status s = status.Running;
       System.out.print("\n"+s+"\n");

       //Printing Status Code
       s = status.Success;
       System.out.print("\n"+s.ordinal()+"\n");

       //printing all Status by using range-for loop
       status[] ss = status.values();
       for(status S1 : ss)
       {
           System.out.print("\n"+S1+" : "+S1.ordinal()+"");
       }
    }
}