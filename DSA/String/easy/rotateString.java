package DSA.String.easy;

public class rotateString {
        public boolean rotateString(String s, String goal) {
            if(s.length()!=goal.length()){
                return false;
            }
            s+=s;
            return s.contains(goal);
        }
    }

