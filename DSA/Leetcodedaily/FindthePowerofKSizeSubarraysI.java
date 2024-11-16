package DSA.Leetcodedaily;

public class FindthePowerofKSizeSubarraysI {
        public int[] resultsArray(int[] nums, int k) {
            int n= nums.length;
            int[] result= new int[n-k+1];
            int i =0;
            int j=k-1;
            int p=0;

            while(j<n){
                int res=checkSort(nums,i,j);
                result[p]=res;
                i++;
                j++;
                p++;
            }
            return  result;
        }
        public int checkSort(int[] nums,int a, int b){
            for(int i=a;i<b;i++){
                if(nums[i]>=nums[i+1] || (Math.abs(nums[i]-nums[i+1])>1)){
                    return -1;
                }
            }
            return nums[b];
        }
    }
