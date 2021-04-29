package chap6;

public class Person {
    /*
    final필드는 초기값이 저장되면 이것이 최종적인 값이 된다.
    지정하는 방법은 처음 필드 선언시에 주거나, 생성자에서 주는 방법뿐.
     */
    final String nation=  "korea";
    final String ssn;
    String name;
    public Person(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }

}
