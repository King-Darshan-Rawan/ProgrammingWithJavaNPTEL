package Week1;

public class SumOfArray {
    public static void main(String[] args) {
        int a[]= {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        float avg = sum/ a.length;
        System.out.println();
        System.out.println("average = " + avg + ", sum = " + sum);
    }    
}
