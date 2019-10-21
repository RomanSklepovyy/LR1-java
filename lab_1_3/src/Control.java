import java.util.Scanner;

public class Control {

    public static void CheckForEven() {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter your number: ");

        if (scanner.hasNextInt())
        {
            number = scanner.nextInt();
            if (Operations.IsEven(number))
                System.out.println("It is even!");
            else
                System.out.println("It is odd!");
        }
        else {
            System.out.println("Incorrect input!");
        }
        System.out.println();
    }

    public static void ShowMin() {

        Scanner scanner = new Scanner(System.in);
        double number1, number2, number3;

        System.out.print("Enter first element: ");
        number1 = scanner.nextDouble();

        System.out.print("Enter second element: ");
        number2 = scanner.nextDouble();

        System.out.print("Enter third element: ");
        number3 = scanner.nextDouble();

        System.out.println("\nMin = " + Operations.FindMin(number1, number2, number3));
        System.out.println();
    }

    public static void CheckPalindrome() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = scanner.nextLine();

        if (Operations.IsPalindrome(word)) System.out.println("It is palindrome!"); else System.out.println("It is not palindrome!");
        System.out.println();
    }

    public static void ShowSumSerial() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        System.out.println("Sum of serial: " + Operations.CalculateNumericSeries(N));
        System.out.println();

    }

    public static void DeleteDigitsFromNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        int digit;

        while (true) {

            System.out.print("Enter digit: ");
            digit = scanner.nextInt();

            if (digit > -10 && digit < 10)
                break;
            else
                System.out.println("It must be one digit! Enter again!");
        }

        System.out.println("Digit: " + Operations.DeleteDigits(number, digit));
        System.out.println();
    }

    public static void ShowPrimeNumbers() {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int number = 1;

        System.out.print("Enter count of prime numbers: ");
        int amount = scanner.nextInt();
        System.out.println();

        while (i<amount)
        {
            if (Operations.IsPrimeNumber(number))
            {
                System.out.println((i+1) + ") number: " + number);
                i++;
            }

            number++;
        }

    }

    public static void ControlMenu() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String command;

        while (!exit)
        {
            System.out.print("Commands: check even, show min, check palindrome, count serial, delete digit, show prime numbers, exit;\n");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command)
            {
                case "check even" :
                    Control.CheckForEven();
                    break;

                case "show min" :
                    Control.ShowMin();
                    break;

                case "check palindrome" :
                    Control.CheckPalindrome();
                    break;

                case "count serial" :
                    Control.ShowSumSerial();
                    break;

                case "delete digit" :
                    Control.DeleteDigitsFromNumber();
                    break;

                case "show prime numbers" :
                    Control.ShowPrimeNumbers();
                    break;

                case "exit" :
                    exit = true;
                    break;

                default:
                    System.out.println("Wrong command!\n");
                    break;
            }
        }
    }
}
