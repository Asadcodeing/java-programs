public class Asad {
    public static int kadaneAlgorithm(int[] a) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<a.length-1; i++){
            sum = sum+a[i];
        
        if(sum < a[i]){
            sum=0;
        }
        if(max < sum){
            max = sum;
        }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2,1,5,-3};
        int max = kadaneAlgorithm(a);
        System.out.println(max);
    }
}
