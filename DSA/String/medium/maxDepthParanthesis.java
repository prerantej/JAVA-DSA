package DSA.String.medium;

public class maxDepthParanthesis {
        public int maxDepth(String s) {
            if(s==null){
                return 0;
            }
            int maxCount=0;
            int count=0;
            for(char c: s.toCharArray()){
                if(c=='('){
                    count++;
                    if(count>maxCount){
                        maxCount=count;
                    }
                }
                if(c==')'){
                    count--;

                }
            }
            return maxCount;
        }
    }

