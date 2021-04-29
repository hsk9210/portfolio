package chap6;

public class Television {
    static String company = "samsung";
    static String model = "LCD";
    static String info;
    //인스턴스나 this는 static에서 사용불가.
    //class 자체에 static이 붙어있기 때문에 인스턴스는 x.
    int field1;
    void method1(){};

    /*
    정적 필드는 필드 선언과 동시에 초기화하는것이 보통이나..
    계산이 필요한 초기화 작업이 있다면, 초기화 작업을 위해
    static block을 열어야 한다.
    static field는 객체 생성 없이도 사용되야 하므로 생성자에서
    초기화 작업이 불가능하기 때문.
     */
    static{ //클래스가 메모리로 로딩될 때 자동적으로 실행됨.
        info = company + "-" + model;
        //this.field1;
        //field1 = 10;
    }


}
