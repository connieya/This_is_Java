package chap07.sec07.exam03_array_polymorphism;


public class Car {

    //필드
//    Tire frontLeftTire = new Tire(6 , "앞왼쪽");
//    Tire frontRightTire = new Tire(2 , "앞오른쪽");
//    Tire backLeftTire = new Tire(3 , "뒤왼쪽");
//    Tire backRightTire = new Tire(4 , "뒤오른쪽");

    Tire[] tires = {
            new Tire(6,"앞왼쪽"),
            new Tire(2,"앞오른쪽"),
            new Tire(3,"뒤왼쪽"),
            new Tire(4,"뒤오른쪽")
    };


    //메소드
    int run(){
        System.out.println("[자동차가 달립니다.]");
       for (int i=0; i<tires.length; i++){
           if (tires[i].roll() == false){
               stop();
               return (i+1);
           }

       }
       return 0;
    }

     void stop() {
         System.out.println("[자동차가 멈춥니다]");
    }
}
