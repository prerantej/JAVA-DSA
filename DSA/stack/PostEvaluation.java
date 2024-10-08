package DSA.stack;

import java.util.Stack;

public class PostEvaluation {
    static Float postFixEvaluation(String str){
        Stack<Float> st = new Stack<>();
        StringBuilder s = new StringBuilder(str);
        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);
            if (Character.isDigit(ch)){
                st.push((float) ch - '0');

            }
            else if (ch=='+') {
                float i1=st.pop();
                float i2=st.pop();
                float result= i2 + i1;
                st.push(result);
            }
            else if (ch=='-') {
                float i1=st.pop();
                float i2=st.pop();
                float result= i2 - i1;
                st.push(result);
            }else if (ch=='/') {
                float i1=st.pop();
                float i2=st.pop();
                float result= i2 / i1;
                st.push(result);
            }else if (ch=='*') {
                float i1=st.pop();
                float i2=st.pop();
                float result= i2 * i1;
                st.push(result);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String string = "562+∗24/−";
        System.out.println(postFixEvaluation(string));
    }
}
