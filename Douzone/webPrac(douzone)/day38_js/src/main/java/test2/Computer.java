package test2;

public class Computer {

    //if U dont know parameters each values
    int sum1(int[] values){
        int a=  0;
        for (int i = 0; i < values.length; i++) {
            a+=values[i];
        }
        return a;
    }
    //solution2. spread parameter
    int sum2(int ...values){
        int a=  0;
        for (int i = 0; i < values.length; i++) {
            a+=values[i];
        }
        return a;
    }
    void println(String string1){
        System.out.println(string1);
    }
}
