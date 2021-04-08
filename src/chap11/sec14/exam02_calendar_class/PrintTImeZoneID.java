package chap11.sec14.exam02_calendar_class;

import java.util.TimeZone;

public class PrintTImeZoneID {
    public static void main(String[] args) {
        String [] availableIDs = TimeZone.getAvailableIDs();
        for (String id : availableIDs){
            System.out.println(id);
        }
    }
}
