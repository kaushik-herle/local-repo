/* We are given a Array, if the Product of 1st half of the array is less than the Product of 2nd half of the array then Reverse the array. Otherwise let it be. */
import java.util.Scanner;

public class ArrayOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter Array Elements:");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int half = n / 2;
        int ans1 = a[0];
        int ans2 = a[half];
        for(int i = 1; i < half; i++)
            ans1 = ans1 * a[i];
        for(int i = half + 1; i < n; i++)
            ans2 = ans2 * a[i];
        if(ans1 < ans2){
            for(int i = 0; i < n / 2; i++){
                int temp = a[i];
                a[i] = a[(n - 1) - i];
                a[(n - 1) - i] = temp;
            }
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + "\t");
        }
        else{
            for(int i = 0; i < n; i++)
                System.out.print(a[i] + "\t");
        }
        sc.close();
    }
}
