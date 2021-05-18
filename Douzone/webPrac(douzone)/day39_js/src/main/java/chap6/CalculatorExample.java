package chap6;


public class CalculatorExample {
    //정적 멤버는 staticClass.field, StaticClass.method() 로 사용한다.
    double result1=  10*10*Calculator.pi;
    int result2 = Calculator.plus(10,5);
    int result3 = Calculator.minus(20,5 );

    //System.out.println("result1 "+result1)'
}
