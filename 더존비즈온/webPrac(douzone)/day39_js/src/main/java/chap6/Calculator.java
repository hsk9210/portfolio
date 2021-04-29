package chap6;

public class Calculator {
    /*
    정적static는 고정된이란 의미를 가지고 있다. 정적 멤버는 클래스에
    고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를
    말한다. 이들을 각각 정적 필드, 정적 메소드라고 부른다.
    정적 멤버는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에
    클래스 멤버라고도 한다.
     */
    //static field
    static String field1 = "aa";
    static double pi = Math.PI; //계산기에서 사용하는 파이는 동일하다.
    //객체마다 가질 필요성이 없는 공용적인 데이터는 정적 필드로 선언.
    String color;

    //static method
    static String intToStringMethod1(int param1, int param2){
        String a=  Integer.toString(param1);
        String b=  Integer.toString(param2);
        return a+" "+b;
    }
    /*
    이렇게 정적 필드와 메소드를 걸어버리면 클래스에 고정된 멤버이므로 클래스 로더가
    클래스(바이트 코드)를 로딩해서 메소드 메모리 영역에 적재할 때 클래스별로 관리.
     */

    /*
    메소드의 경우, 인스턴스와 정적 선언여부 판단기준은,
    인스턴스의 필드를 사용하는지 안하는지에 따라서 달라진다.
     */
    //ex
    void setColor(String color){
        this.color = color;
    }
    //인스턴스 필드를 사용할 일이 없는 메소드.
    static int plus(int x, int y){
        return x+y;
    }
    static int minus(int x, int y){
        return x-y;
    }

}
