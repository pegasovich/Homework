import java.util.Scanner;
import java.text.NumberFormat;

public class Task4 {




    public static final String[] units = { "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };

    public static final String[] tens = {
            "", 		// 0
            "",		// 1
            "Twenty", 	// 2
            "Thirty", 	// 3
            "Forty", 	// 4
            "Fifty", 	// 5
            "Sixty", 	// 6
            "Seventy",	// 7
            "Eighty", 	// 8
            "Ninety" 	// 9
    };

    public static String convert(final int n) {
        if (n < 0) {
            return "Minus " + convert(-n);
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }


        return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
    }


    public static void main(final String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please type a number between 0 and 10000: ");
        int n = input.nextInt();

        System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

        System.out.println("\nnumbers in text starting from 10 to 150: ");
        for (int i=10; i<151; i++) {
            System.out.println(NumberFormat.getInstance().format(i) + "='" + convert(i) + "'");
        }

        System.out.println("\nnumbers in text starting from 9980 to 10000.: ");
        for (int i=9980; i<10001; i++) {
            System.out.println(NumberFormat.getInstance().format(i) + "='" + convert(i) + "'");
        }

    }
}