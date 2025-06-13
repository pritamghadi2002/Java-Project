import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Well Come to our Factorial Program:\n");
        System.out.print(" Please Enter Your Number: ");
        int num = input.nextInt();
        long sum = factorial(num);
        System.out.print(" factorial of: "+ num + " is: "+ sum);
    }

    public static long factorial(int num){
        if(num < 2){
            return 1;
        }
        int sum = 1;
        int i = 2;
        while ( i <= num){
            sum *= i;

            i++;
        }

        return sum;
    }
}
