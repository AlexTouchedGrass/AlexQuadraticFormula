import java.util.Scanner;

public class AlexQuadraticFormula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c = 0;
        double answerQuad1 = 0;
        double answerQuad2 = 0;


        System.out.println("Please enter the values for a,b, and c in standard form.");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (Math.pow(b, 2) - 4 * a * c < 0) {
            System.out.println("Sorry your answer is imaginary.");


        }
        else {
            answerQuad1 = -1*b + Math.sqrt(Math.pow(b, 2) - 4 * a * c);
            answerQuad2 = -1*b - Math.sqrt(Math.pow(b, 2) - 4 * a * c);

            System.out.println("The answers to the quadratic formula using the a,b, and c inputs previous is " + answerQuad1 + " and " + answerQuad2 + ".");
        }
    }
}