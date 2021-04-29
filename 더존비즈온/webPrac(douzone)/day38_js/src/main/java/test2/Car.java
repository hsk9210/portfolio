package test2;

public class Car {
    /**
     * this()
     * 다른생성자 호출 간략화
     * 생성자 오버로딩이 많을 경우 대비 간략화
     *
     */
    //field
    String company = "";
    String model;
    String color;
    int maxSpeed;

    //constructor
    Car(){

    }
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car(String model, String color){
        this(model,color,300);
    }
    Car(String model){ //매개변수 이름이 아니라, 갯수로 따진다???
        this(model,"silver",250); //생성자 오버로딩이 같은 자료형과 개수면 구분을 못하는듯.
    }
//    Car(String color){ // model과 color가 달라도 같이 취급.
//        this("aaa",color,222);
//    }
    Car(int maxSpeed){ //아예 매개변수 자료형이 다르면 이상은 없음.
        this("bbb","blue",maxSpeed);
    }




}
