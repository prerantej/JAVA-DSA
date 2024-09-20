package DSA.String.medium;

public class longestPalindrome {
        public String longestPalindrome(String s) {
            if(s.length()<=1){
                return s;
            }

            String maxString=s.substring(0,1);

            for(int i=0;i<s.length();i++){
                String odd= expandFromCenter(s,i,i);
                String even= expandFromCenter(s,i,i+1);

                if(odd.length()>maxString.length()){
                    maxString=odd;
                }
                if(even.length()>maxString.length()){
                    maxString=even;
                }
            }
            return maxString;
        }

        public static String expandFromCenter(String S, int left , int right){
            while(left >=0 && right<S.length() && S.charAt(left)==S.charAt(right) ){
                left--;
                right++;
            }
            return S.substring(left+1,right);
        }
    }

