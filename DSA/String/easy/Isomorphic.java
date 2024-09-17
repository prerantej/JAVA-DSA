package DSA.String.easy;

public class Isomorphic {
        public boolean isIsomorphic(String s, String t) {
            int[] sIndex= new int[256];
            int[] tIndex= new int[256];
            if(s.length()!=t.length()){
                return false;
            }
            for(int i=0;i<s.length();i++){
                if(sIndex[s.charAt(i)]!=tIndex[t.charAt(i)]){
                    return false;
                }
                sIndex[s.charAt(i)]=i+1;
                tIndex[t.charAt(i)]=i+1;
            }
            return true;
        }
}
