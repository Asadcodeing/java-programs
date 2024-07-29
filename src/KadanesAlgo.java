import java.util.*;
public class KadanesAlgo {
    public static int kadanesAlgorithm(int[] a){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
            if(sum < 0){
                sum = 0;
                start = i+1;
            }
            if(max <= sum){
                max = sum;
                end = i;
            }
        }
        System.out.print(start+","+end);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int n = sc.nextInt();
        System.out.print("Enter the Array size : ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int max = kadanesAlgorithm(a);
        System.out.println(" ");
        System.out.println("Maxsum of Array : "+max);
        sc.close();
    }
}
