package DSA.stack;

import java.util.Stack;

public class InfixToPostfix {
    static int getPrecedence(char ch){
        if(ch=='-' || ch=='+'){
            return 1;
        } else if (ch=='*' || ch=='/') {
            return 2;
        } else if (ch=='^') {
            return 3 ;
        }
        return  0;
    }
    static String infixtoPostix(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder s= new StringBuilder();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            else if(Character.isLetterOrDigit(ch)){
                s.append(ch);
            }
            else if (ch=='(') {
                st.push(ch);
            }
            else if (ch==')'){
                while (!st.isEmpty() && st.peek() != '(') {
                    s.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && getPrecedence(st.peek())>= getPrecedence(ch)){
                    s.append(st.pop());
                }
                    st.push(ch);
            }


        }
        while(!st.isEmpty()){
            s.append(st.pop());
        }
        return s.toString();
    }


    public static void main(String[] args) {
        String infix = "((a / b) + c) - (d + (e * f))";

        System.out.println(infixtoPostix(infix));
    }
}
