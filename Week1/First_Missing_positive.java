import java.util.*;
public class First_Missing_positive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            while(nums[i]>=1 && nums[i]<=n && nums[nums[i]-1]!=nums[i]){//idhar hmne jo no hai usko check kiya ki bo apni proper indexx pr baitha hai ki nhiii 
            int index=nums[i]-1; //appropriate index to which ele belong to
            //swap ele to appropraite index
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;

            

            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                System.out.print(i+1);
            }
        }
        System.out.print( n+1);
    }
}
