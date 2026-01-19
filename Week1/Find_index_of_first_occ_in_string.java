import java.util.*;
public class Find_index_of_first_occ_in_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
         int n=s1.length();
        int m=s2.length();
        for(int i=0;i<=n-m;i++){
            if(s1.substring(i,i+m).equals(s2)){
                System.out.println(i);
            }
        }
        System.out.print(-1);

    }
}
