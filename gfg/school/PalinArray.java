package gfg.school;

public class PalinArray {
    public static int palinArray(int[] a, int n)
    {
        int count=0;
        for(int i=0; i<a.length; i++){
            int s= a[i];
            int target=0;
            int original=s;
            while(s>0){
                int r = s%10;
                target= target *10 +r;
                s=s/10;

            }
            if(target==original){
                count++;

            }
        }
        if (count==n){
            return 1;
        }
        else{
            return 0;
        }

    }

    public static void main(String[] args) {

    }
}
