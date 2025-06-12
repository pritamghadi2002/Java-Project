import java.util.Scanner;

public class oddnumbersum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Well Come to Our Odd Number Sum Program:\n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        int sum = retturn (num);
        System.out.print(" Your Odd Number"+ num +   "is"  +  sum );

    }

    public static int retturn( int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;

            i += 2;
        }
        return sum;
    }
}




