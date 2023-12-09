import java.util.HashMap;
import java.util.Map;

class Information
{
    String Name;
    String Email;
    int Number;

    public Information(String Name,String Email,int Number)
    {
        this.Name = Name;
        this.Email = Email;
        this.Number = Number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public void Display()
    {
        System.out.print("\nName : "+Name+"\nEmail : "+Email+"\nNumber : "+Number+"\n");
    }
}

public class HashMap1 
{
    public static void main(String[] args)
    {
        HashMap<String,Information> m1 = new HashMap<String,Information>();

        Information Info1 = new Information("Neil","neil123@gmail.com", 989786756);
        Information Info2 = new Information("Kumar","kumar123@gmail.com", 973386756);
        Information Info3 = new Information("Rihan","rihan123@gmail.com", 939786451);
        Information Info4 = new Information("Manju","manju123@gmail.com", 900786756);

        m1.put(Info1.getName(),Info1);
        m1.put(Info2.getName(),Info2);
        m1.put(Info3.getName(),Info3);
        m1.put(Info4.getName(),Info4);

        for(Map.Entry<String,Information> key : m1.entrySet())
        {
            Information i1 = key.getValue();
            System.out.print("\n"+key.getKey());
            i1.Display();
        }

        System.out.print("\n"+m1.containsKey("Kumar"));  //if Kumar found it returns true other wise it returns false

        m1.remove("Kumar");  //if kumar is there in the HashMap then kumar's information is now deleted

         System.out.print("\n\n");
        for(Map.Entry<String,Information> key : m1.entrySet())
        {
            Information i1 = key.getValue();
            System.out.print("\n"+key.getKey());
            i1.Display();
        }
         System.out.print("\n\n");
    }
}
