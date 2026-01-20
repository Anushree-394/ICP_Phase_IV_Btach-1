package Week2_Stack;
import java.util.*;
public class Next_greater_ele {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        arr=nextGreaterElement(arr, arr2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
    //Brute force
    //time complexity-> O(n*m);
    //space complexity->O(1)
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int[] arr=new int[nums1.length];
        // for(int i=0;i<nums1.length;i++){
        //     boolean flag=false;
        //     int j=0;
        //     for(j=0;j<nums2.length;j++){
        //         // sbse phle elee mark krdia jo equal hai 
        //         if(nums1[i]==nums2[j]){
        //             flag=true;
        //         }
        //         // next abh hm check krenge equal ele milne k bdd ki greater ele mila ki nhi
        //         else if(flag==true && nums2[j]>nums1[i]){
        //             nums1[i]=nums2[j];
        //             break;
        //         }
                
        //     }
        //     // agr hm last mai aagye and still ele ni mila toh hm -1 bitha denge
        //     if(j==nums2.length){
        //         nums1[i]=-1;
        //     }

        // }
        // return nums1;

        // space complexity->o(n+m);
        //time complexity->o(n);
        Stack<Integer> st=new Stack<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       int[] arr=new int[nums2.length];
       for(int i=nums2.length-1;i>=0;i--){
           //chote ele remove krdo
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            // agr stack empty it mean no greater ele

            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }
            // agr stack empty ni hai toh peek most ele greter ele bnjyega
            else{
                map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}
