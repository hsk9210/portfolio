package test2;

public class MainEntry {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car("hyundai","blue",20);

        System.out.println(car3.model+" "+car3.maxSpeed);
        System.out.println("aaa"+car1.maxSpeed);
        System.out.println((84000-67000)+"");

        Computer myCom = new Computer();
        System.out.println("MainEntry.main");
        int[] values1 = {1,2,3,4};
        System.out.println(myCom.sum1(values1));
        System.out.println(myCom.sum2(5,6,7));
        System.out.println(myCom.sum2(values1));
        System.out.println(myCom.sum1(new int[] {3,5,9}));
        myCom.println("asdfdsaf");

    }
}
