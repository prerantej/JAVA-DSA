package DSA.String.easy;

public class reverseWords {
        public String reverseWords(String s) {
            String[] str = s.trim().split("\\s+");
            StringBuilder x= new StringBuilder("");
            for(int i=str.length-1;i>0;i--){
                x.append(str[i]+" ");

            }
            x.append(str[0]);
            return x.toString();
        }
    }

