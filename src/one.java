import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = input.nextInt();
        System.out.print("Enter a condition");
        boolean condition = input.nextBoolean();
        if(number>10 && number<20 && condition==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }


    }
}
