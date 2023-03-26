import java.util.InputMismatchException;
import java.util.Scanner;

public class perfect_square {
    public static double square(double number) {
        double t;

        double squareRoot = number / 2;

        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);

        return squareRoot;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input  a number: ");
        int number;

        try{
            number = scan.nextInt();
            double root;

            root = square(number);

            int rootOne = (int) root;

            if (rootOne == root) {
                System.out.println("Number : " + number);
                System.out.println("Square Root : " + rootOne);
                System.out.println("Its a perfect square!!!");
            } else if (rootOne != root) {
                System.out.println("Number : " + number);
                System.out.println("Square Root : " + root);
                System.out.println("Its not a perfect square...");
            }
        }catch (InputMismatchException e){
            System.out.println("Only Integers are allowed");+
        }



    }

}
