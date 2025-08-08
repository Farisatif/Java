import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The First Number : ");
        int start = scanner.nextInt();

        System.out.print("Enter The End Number : ");
        int end = scanner.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int sum = 0;
           int sum1 = 0;
        

        for (int i = start + 1; i < end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }else{
             sum1 += i;
            }
        }

        System.out.println("Sum of Number is : " + start + " And " + end + " is: " + sum);
         System.out.println("Sum of Number is : " + start + " And " + end + " is: " + sum1);
    }
}