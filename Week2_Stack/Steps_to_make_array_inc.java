package Week2_stack;
import java.util.*;
public class Steps_to_make_array_inc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        

    }
    //brute force ->giving tle
    // public int totalSteps(int[] nums) {
    //     ArrayList<Integer> li = new ArrayList<>();
    //     for (int x : nums) li.add(x);

    //     int steps = 0;

    //     while (true) {
    //         ArrayList<Integer> al = new ArrayList<>(); // yh andr isloiye rkhi hai kyunki each step pr hmri new arraylist bnjygei since ele remove honge

    //         // decide removals (no modification here)
    //         for (int i = 1; i < li.size(); i++) {
    //             if (li.get(i - 1) > li.get(i)) {
    //                 al.add(i);
    //             }
    //         }

    //         // if nothing to remove ,i.e ki array increasing hogyi finally
    //         if (al.size() == 0) break;

    //         // remove from back kyunki aage  s remove krne pr index shift hojyegi front wli toh glt ele remove hoga
    //         for (int i = al.size() - 1; i >= 0; i--) {
    //             li.remove((int) al.get(i));
    //         }

    //         steps++;
    //     }

    //     return steps;
    // }
}
