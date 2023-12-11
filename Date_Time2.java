import java.time.*;

public class Date_Time2 
{ 
      public static void main(String[] args) 
      {
        LocalDate date = LocalDate.now();
        System.out.print("\n"+date+"\n");

        LocalTime time = LocalTime.now();
        System.out.print("\n"+time+"\n");

        int dayOfMonth = date.getDayOfMonth();
        System.out.print("\n"+dayOfMonth+"\n");

        int dayOfYear = date.getDayOfYear();
        System.out.print("\n"+dayOfYear+"\n");

        int hour = time.getHour();
        int mintue = time.getMinute();
        int second = time.getSecond();
        System.out.print("\nHour "+hour+"\n");
        System.out.print("\nMintue "+mintue+"\n");
        System.out.print("\nSecond "+second+"\n\n");

      }
}
