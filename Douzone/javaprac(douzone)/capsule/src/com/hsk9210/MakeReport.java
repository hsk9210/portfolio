package com.hsk9210;

public class MakeReport {
    StringBuffer buffer = new StringBuffer();
    private String line = "-----------";
    private String title= " name\t addr\t\t tel \n";
    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }
    
}
