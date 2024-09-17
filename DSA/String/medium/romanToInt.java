package DSA.String.medium;
import java.util.*;

public class romanToInt {
        public int romanToInt(String s) {
            int sum=0;
            HashMap<Character,Integer> mpp = new HashMap<>();
            mpp.put('I',1);
            mpp.put('V',5);
            mpp.put('X',10);
            mpp.put('L',50);
            mpp.put('C',100);
            mpp.put('D',500);
            mpp.put('M',1000);
            for(int i =0;i<s.length();i++){
                if(i<s.length()-1 && mpp.get(s.charAt(i))<mpp.get(s.charAt(i+1))){
                    sum-=mpp.get(s.charAt(i));
                }
                else{
                    sum+=mpp.get(s.charAt(i));
                }

            }
            return sum;
        }
    }

