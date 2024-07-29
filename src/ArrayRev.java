import java.util.Scanner;
public class ArrayRev {
    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array length");
        int n = sc.nextInt();
        
        System.out.print("Enter the Elements");
        int[] a = new int[n];
        
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Reverse the Elements");
        int[] b = new int[a.length];

        for(int i=0; i<a.length; i++){
            start = i;
            end = a.length-i-1;
            b[start] = a[end];
            b[end] = a[start];

        }
        for(int i=0; i<a.length; i++){
            System.out.print(b[i]+" ");
        }
        sc.close();
    }
}
