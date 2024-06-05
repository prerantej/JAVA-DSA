package gfg.school;
import java.io.*;
import java.util.*;
public class NoLoop1toN {
    static public void printNos(int N)
    {
        if(N>0){
            printNos(N-1);
            System.out.print(N +  " ");
        }
    }
    public static void main (String[] args) {
        printNos(5);
    }

}

