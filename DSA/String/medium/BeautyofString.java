package DSA.String.medium;

public class BeautyofString {
        public int beautySum(String s) {
            int sum =0;
            int n=s.length();
            for(int i=0;i<n;i++){
                int[] charArray = new int[26];
                for(int j=i;j<n;j++){
                    charArray[s.charAt(j)-'a']++;
                    int max=Integer.MIN_VALUE;
                    int min=Integer.MAX_VALUE;
                    for(int k=0;k<26;k++){
                        if(charArray[k]>0){
                            max=Math.max(charArray[k],max);
                            min=Math.min(charArray[k],min);
                        }
                    }
                    sum+=max-min;
                }
            }
            return sum;
        }
}
