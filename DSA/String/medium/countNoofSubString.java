package DSA.String.medium;

public class countNoofSubString {
        static long calcCount(String s , int k ){
            int i=0;
            int j=0;
            int n= s.length();
            int[] charArray= new int[26];
            int dist_count=0;
            long ans=0;
            while(j<n){
                charArray[s.charAt(j)-'a']++;
                if(charArray[s.charAt(j)-'a']==1){
                    dist_count++;
                }

                while(dist_count>k){
                    charArray[s.charAt(i)-'a']--;
                    if(charArray[s.charAt(i)-'a']==0){
                        dist_count--;
                    }
                    i++;
                }
                j++;
                ans+=(j-i+1);
            }
            return ans;
        }
        long substrCount (String S, int K) {
            return calcCount(S,K) - calcCount(S,K-1) ;
        }

    }

