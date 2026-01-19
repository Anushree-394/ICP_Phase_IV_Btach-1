package Week1;
import java.util.*;
public class Three_Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        Set<ArrayList<Integer>> s=new HashSet<>();
        for(int k=0;k<n;k++){
            int i=k+1;
            int j=n-1;
            while(i<j){
                if(arr[i]+arr[j]+arr[k]==0){
                ArrayList<Integer> li=new ArrayList<>();
                li.add(arr[i]);
                li.add(arr[j]);
                li.add(arr[k]);
                s.add(li);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]+arr[k]<0){
                i++;
            }
            else if(arr[i]+arr[j]+arr[k]>0){
                j--;
            }
            }
        }
        System.out.print(new ArrayList<>(s));
    }
}
