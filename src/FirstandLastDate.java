import java.util.*;
import java.text.SimpleDateFormat;
public class FirstandLastDate {
        public static void main(String[] args) {
            Calendar c = Calendar.getInstance();
            c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()+1);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y");
            System.out.println(sdf.format(c.getTime()));
            c.add(Calendar.DATE, 6);
            System.out.println(sdf.format(c.getTime()));
        }
}
