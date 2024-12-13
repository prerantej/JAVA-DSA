package DSA.Recursion.Medium;
import java.util.*;


public class KBinaryString {
    static String toString(char[] a){
        String s= new String(a);
        return s;
    }
    static void generate(int k, char[] charray,int n){
        if(n==k){
            System.out.println(toString(charray));
            return;
        }
        if(charray[n-1]=='0'){
            charray[n]='0';
            generate(k,charray,n+1);
            charray[n]='1';
            generate(k,charray,n+1);
        }
        if(charray[n-1]=='1'){
            charray[n]='0';
            generate(k,charray,n+1);
        }
    }
    static void fun(int k){
        if(k<=0){
            return;
        }
        char[] charray= new char[k];
        charray[0]='0';
        generate(k,charray,1);
        charray[0]='1';
        generate(k,charray,1);
    }
    public static void main(String[] args) {
        int k =3;
        fun(k);
    }
}
