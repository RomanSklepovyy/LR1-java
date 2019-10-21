public class Operations {

    public static boolean IsEven (int number) {
        if (number % 2 == 0) return true; else return false;
    }

    public static double FindMin(double a, double b, double c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static boolean IsPalindrome(String word) {

        word = word.toLowerCase();

        for (int i=0; i<word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) return false;
        }

        return true;
    }

    public static double CalculateNumericSeries(int N) {
        double sum = 0;

        for (int i=1; i<N+1; i++) {
            sum += i * (i+1) * 2 * i;
        }

        return sum;
    }

    public static int DeleteDigits(int number, int digit) {

        String strNumber = "" + number;
        strNumber = strNumber.replaceAll(String.valueOf(digit), "");
        return Integer.parseInt(strNumber);

    }

    public static boolean IsPrimeNumber(int number) {

        if (number % 2 != 0 || number == 2)
            if (number % 3 != 0 || number == 3)
                if (number % 5 != 0 || number == 5)
                    if (number % 7 != 0 || number == 7)
                        return true;
        return false;
    }

}
