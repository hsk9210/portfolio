package chap6;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("1234455-123124","김정은");
        System.out.println(p1.nation);
        System.out.println(p1.name);
        System.out.println(p1.ssn);
        p1.name = "한글테스트";
        System.out.println(p1.name);
    }
}
