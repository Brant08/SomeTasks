package сom;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int countOfMatches = 4; //max count of matches for one square
        int matches;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of squares:");
        int n = scan.nextInt();

        if (n >= 1 && n <= Math.pow(10, 9)) {

            double sqrtNum = Math.sqrt(n);

            if (sqrtNum % 1 == 0) {

                matches = (int) (2 * sqrtNum * (sqrtNum + 1));
                System.out.println("Min number of matches for n squares: " + matches);

            } else {

                int sqrtNumInt = (int) sqrtNum;
                int mediana = (int) (((Math.pow(sqrtNumInt + 1, 2) - Math.pow(sqrtNumInt, 2)) - 1) / 2);
                int diff = (int) (n - Math.pow(sqrtNumInt, 2));

                if (diff > mediana) {

                    matches = 2 * sqrtNumInt * (sqrtNumInt + 1) +
                            (countOfMatches - 1) * 2 + (countOfMatches - 2) * (diff - 2);
                    System.out.println("Min number of matches for n squares: " + matches);

                } else if (diff <= mediana) {

                    matches = 2 * sqrtNumInt * (sqrtNumInt + 1) +
                            (countOfMatches - 1) * 1 + (countOfMatches - 2) * (diff - 1);
                    System.out.println("Min number of matches for n squares: " + matches);

                }
            }
        }
    }
}
