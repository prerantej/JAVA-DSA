package DSA.stack;

import java.util.Stack;

public class PostEvaluationWithSpace {
    static Float postFixEvaluation(String str){
        Stack<Float> st = new Stack<>();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String ch = arr[i];

            if (ch.equals("+")) {
                float i1 = st.pop();
                float i2 = st.pop();
                float result = i2 + i1;
                st.push(result);
            }
            else if (ch.equals("-")) {
                float i1 = st.pop();
                float i2 = st.pop();
                float result = i2 - i1;
                st.push(result);
            } else if (ch.equals("/")) {
                float i1 = st.pop();
                float i2 = st.pop();
                float result = i2 / i1;
                st.push(result);
            } else if (ch.equals("*")) {
                float i1 = st.pop();
                float i2 = st.pop();
                float result = i2 * i1;
                st.push(result);

            }
            else if (ch.equals("^")) {
                float i1 = st.pop();
                float i2 = st.pop();
                float result = (float) Math.pow(i2,i1);
                st.push(result);
            }

            else {
                float token = Float.parseFloat(ch);
                st.push(token);
            }

        }
        return st.peek();
    }

    public static void main(String[] args) {
        String string = "5 6 2 + * 12 4 / -";
        System.out.println(postFixEvaluation(string));
    }
}
