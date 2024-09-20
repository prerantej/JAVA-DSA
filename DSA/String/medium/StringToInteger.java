package DSA.String.medium;

public class StringToInteger {
        public int myAtoi(String s) {
            int len= s.length();
            if (len==0){
                return 0;
            }
            int i=0;

            while(i<len && s.charAt(i)==' '){
                ++i;
            }
            boolean isNegative=false;

            if(i<len){
                if(s.charAt(i)=='-'){
                    isNegative=true;
                    ++i;
                }
                else if(s.charAt(i)=='+'){
                    isNegative=false;
                    ++i;
                }

            }

            int result=0;

            while(i<len && isDigit(s.charAt(i))){
                int digit=s.charAt(i)-'0';

                if( result>(Integer.MAX_VALUE/10) || result ==(Integer.MAX_VALUE/10) && digit>7){
                    return isNegative? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }

                result= (result*10) +digit;
                ++i;
            }
            return isNegative? -result : result;
        }
        private boolean isDigit(char ch){
            return ch>='0' && ch<='9';
        }
    }
