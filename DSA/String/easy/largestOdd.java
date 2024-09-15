package DSA.String.easy;

public class largestOdd {
        public String largestOddNumber(String num) {
            int i=num.length()-1;
            while(i>=0){
                char ch=num.charAt(i);
                int n= (int)ch -48;
                if(n%2==0){
                    i--;
                }
                else{
                    return num.substring(0,i+1);
                }
            }
            return "";

        }
    }

