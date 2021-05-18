객체지향에서
모듈(클래스 등) - 라이브러리 - 컴포넌트(프레임워크) 순으로 묶어나갈 때,
이것들을 조합하여 프로그램을 만든다.
객체지향 프로그래밍 과정
요구사항 분석-객체추출-객체 모델링 - 클래스 정의 - 객체 생성과 활용

클래스: 객체를 만들기 위한  객체와 연관된 변수와 메소드를 정의해 놓은 설계도
java 객체를 생성하면 클래스에 정의된 변수와 메소드가 메모리에 로드하고,
메모리에 저장된 변수와 메소드를 사용할 수 있는 상태로 만드는 것
AAA a = new AAA(); //인스턴스 a를 AAA 클래스로부터 생성.

public class smartPhone{
  public String color; //멤버변수들
  public int size;
  
  smartPhone(){
   //생성자. 인스턴스 초기화때 어떻게 할 것인지 정한다.
  }
  
  colorget();
  colorset();
  sizeget();
  sizeset();

};
public class LGPhone extends smartPhone{
  //이러면 상속.
  
};

//인스턴스의 메모리 주소를 저장할 참조변수 공간 만들고 new로 생성한 인스턴스의 주소값을 참조변수에 할당한다.
className referenceVar = new className();



