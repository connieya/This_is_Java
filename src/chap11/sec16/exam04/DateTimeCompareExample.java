package chap11.sec16.exam04;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        LocalDateTime startDateTime = LocalDateTime.of(2023,1,1,9,0,0);
        System.out.println("시작일 : " +startDateTime);

        LocalDateTime endDateTime = LocalDateTime.of(2024,3,31,18,0,0);
        System.out.println("종료일 : " +endDateTime +"\n");

        if (startDateTime.isBefore(endDateTime)){

            System.out.println("진행 중입니다. "+"\n");
        }else if (startDateTime.isEqual(endDateTime)){
            System.out.println("종료 합니다 " +"\n");

        }else if(startDateTime.isAfter(endDateTime)){
            System.out.println("종료 했습니다. "+"\n");
        }

        System.out.println("[종료까지 남은 시간]");
        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);

        System.out.println("남은 해 " +remainYear);
    }


}
