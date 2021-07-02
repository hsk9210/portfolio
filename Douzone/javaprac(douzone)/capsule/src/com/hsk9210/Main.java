package com.hsk9210;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MakeReport report = new MakeReport();
        String result = report.getreport();
        System.out.println(result);
        System.out.println(report); //StringBuffer는 '객체'로 나온다. 주소값 출력.
    }
}
