package DSA.DoublyLinkedList;
import java.util.*;

public class findPairsWithGivenSum {
        public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
            ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
            Node end=head;
            Node cur=head;
            while(end.next!=null){
                end=end.next;
            }
            while(cur.data<end.data){
                int sum= cur.data+end.data;
                if(sum==target){
                    ArrayList<Integer> res= new ArrayList<>();
                    res.add(cur.data);
                    res.add(end.data);
                    ans.add(res);
                }
                if(sum<target){
                    cur=cur.next;
                }
                else{
                    end=end.prev;
                }
            }

            return ans;
        }
    }

