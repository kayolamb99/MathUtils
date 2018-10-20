public class MathUtils {
    /**This method returns whether a given number is
     * a prime number or not.
     */
    public static boolean isPrime(int x) {
        if (x == 0 || x == 1) {return false;}
        if (x == 2) {return true;}
        if (x % 2 == 0) {return false;}
        int factor = 3;
        /*I am only going up to x/2 because any factor
        above that point means the number is divisible by 2,
        aka not a prime number.
         */
        while (factor < x / 2) {
            if (x % factor == 0) {
                return false;
            }
            factor++;
        }
        return true;
    }

    /** TODO: A faster isPrime method,
     * most likely using the AKS primality test.
     */
    public static boolean fasterIsPrime(int x) {
        return false;
    }
    public static boolean isPerfectSquare(int x) {
        if ((int)(Math.sqrt(x)) == Math.sqrt(x)) {return true;}
        return false;
    }

    public static int sumDigits(int x) {
        String asString = Integer.toString(x);
        int count = 0; int res = 0;
        while (count < asString.length()) {
            res += Integer.parseInt(asString.substring(count, count + 1));
            count++;
        }
        return res;
    }
    public static int tradSumDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static int reverseInt(int x) {
        int res = 0;
        while (x > 0) {
            res *= 10;
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    public static boolean isPalindrome(int x) {
        if (reverseInt(x) == x) {return true;}
        return false;
    }

    public static long factorial(int x) {
        long res = (long)x;
        while(x > 0) {
            res *= x - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrome(345));
    }

}