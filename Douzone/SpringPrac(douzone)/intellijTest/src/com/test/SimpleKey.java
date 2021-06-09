package com.test;


public class SimpleKey {
    private int x,y;
    private String word1;
    private double minorNum;

    public SimpleKey(int x, int y, String word1, double minorNum) {
        this.x = x;
        this.y = y;
        this.word1 = word1;
        this.minorNum = minorNum;
    }
    public SimpleKey(){

    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getWord1() {
        return word1;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public double getMinorNum() {
        return minorNum;
    }

    public void setMinorNum(double minorNum) {
        this.minorNum = minorNum;
    }
}
