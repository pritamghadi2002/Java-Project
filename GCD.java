import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" WellCome to Our Greatest Common Deviser:\n ");
        System.out.print(" Please Enter your First Nmber: ");
        int num1 = input.nextInt();
        System.out.print(" Then Enter Your Second Number: ");
        int num2 = input.nextInt();
        int main = ( num1 < num2)? num1 : num2;
        int gcd = 0;
        for ( int i = main; i>=1 ; i--){
            if( num1 % i == 0 && num2 % i == 0){
                gcd = i;
                break;
            }
        }
        System.out.printf("gcd " + gcd);

    }

}
