## Calendar 클래스

Calendar 클래스는 달력을 표현한 클래스이다.
Calendar 클래스는 추상 클래스 이므로 new 연산자를 사용해서 인스턴스를 
생성할 수 없다. 그 이유는 날짜와 시간을 계산하는 방법이 지역과 문화, 나라에 따라
다르기 때문이다. 우리나라만 해도 양력과 음력이 동시에 사용되고 있다. 그래서
Calendar 클래스에는 날짜와 시간을 계산하는 데 꼭 필요한 메소드로만 선언되어있고
 특정한 역법을 사용한 경우가 아니라면 직접 하위클래스를 만들 필요는 없고
Calendar 클래스의 정적메소드인 getInstance() 메소드를 
이용하면 현재 운영체제에 설정 되어있는 시간대를 기준으로 한 Calendar 하위 
객체를 얻을 수 있다. 

```java
Calendar now Calendar.getInstance();
```
Calendar 객체를 얻었다면 get() 매소드를 이용해서  날짜와 시간에 대한
정보를 읽을 수 있다.
```java
int year = now.get(Calendar.YEAR); // 년도를 리턴 
int month = now.get(Calendar.MONTH) + 1;  //월을 리턴
int day = now.get(Calendar.DAY_OF_MONTH); // 일을 리턴
int week = now.get(Calendar.DAY_OF_WEEK) // 요일을 리턴
int amPm =  now.get(Calendar.AM_PM);  // 오전/오후를 리턴
int hour = now.get(Calendar.HOUR); // 시를 리턴
int minute = now.get(Calendar.MINUTE); // 분을 리턴
int second = now.get(Calendar.SECOND); // 초를 리턴

```

`Calendar.java`

```java
public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);


        int week  = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch (week){
            case Calendar.MONDAY:
                strWeek = "월";
                break;
            case Calendar.TUESDAY:
                strWeek = "화";
                break;
            case Calendar.WEDNESDAY:
                strWeek = "수";
                break;
            case Calendar.THURSDAY:
                strWeek = "목";
                break;
            case Calendar.FRIDAY:
                strWeek = "금";
                break;
            case Calendar.SATURDAY:
                strWeek = "토";
                break;
            case Calendar.SUNDAY:
                strWeek = "일";
                break;
        }

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if (amPm == Calendar.AM){
            strAmPm ="오전";
        }else{
            strAmPm = "오후";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);


        System.out.print(year +"년 ");
        System.out.print(month +"월 ");
        System.out.println(day +"일 ");
        System.out.print(strWeek +"요일 ");
        System.out.println(strAmPm + "");
        System.out.print(hour +"시 ");
        System.out.print(minute +"분 ");
        System.out.println(second +"초");
    }
}
```

다른 시간대에 해당하는 날짜와 시간을 출력하는 방법은

Calendar 클래스의 오버로딩된 다른 getInstance() 메소드를 
이용하면 간단하게 다른 시간대의 Calendar를 얻을 수 있다.
알고 싶은 시간 대의 java.util.TimeZone 객체를 얻어,
Calendar.getInstance() 메소드의 매개값으로 넘겨주면 된다.
```java
TimeZone timeZone = TimeZone.getTimeZone("America/Lost_Angeles");
Calendar now  = Calendar.getInstance(timeZone);
```

TimeZone.getTimeZone() 메소드의 매개값은 TimeZone 클래스의 정적
메소드인 getAvailableIDs()를 호출하여 얻은 시간대 문자열 중 하나를
사용하면 된다. 

`PrintTimeZOneID.java`

```java
public class PrintTImeZoneID {
    public static void main(String[] args) {
        String [] availableIDs = TimeZone.getAvailableIDs();
        for (String id : availableIDs){
            System.out.println(id);
        }
    }
}

```