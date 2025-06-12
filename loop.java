public class loop {
  import java.util.Scanner;
                                    /** MULTIPLICATION TABLE **/
public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Well come to Our Multiplication Calculator;\n");
        System.out.println(" please Enter Your Number: ");
        int num = input.nextInt();
        multiplier(num);

    }

    public static void multiplier(int num){
       int i = 0;
       while ( i <= 10){
           System.out.println(num + "x" + i + "=" + ( num *i ) );
           i++;
       }


    }
}

}
