import java.time.LocalDateTime;

public class Date {
    public static void main(String[] args) {
        LocalDateTime l=LocalDateTime.now();
        int day = l.getDayOfMonth();
        int month = l.getMonthValue();
        int year = l.getYear();

        int min=l.getMinute();
        int hr=l.getHour();
        int se=l.getSecond();


        System.out.println(day);
        System.out.println(month);
        System.out.println(year);

        System.out.println(min);
        System.out.println(hr);
        System.out.println(se);
    


    }
    
}
 




