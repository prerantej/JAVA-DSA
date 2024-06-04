package java_basics.stack;

public class stack {
    int MAX=1000;
    int[] arr = new int[MAX];
    int top = -1;
    int push(int num){
        if (top>=MAX-1) {
            System.out.println("Stack Overflow");
            return 0;
        }
        else {
            top=top+1;
            arr[top]=num;
            return num;
        }
    }
    int pop(){
        if (top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x=arr[top];
            top=top-1;
            return x;
        }
    }
    int peek(){
        if (top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            return arr[top];
        }
    }

    public static void main(String[] args) {
        stack s= new stack();
        s.push(20);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
