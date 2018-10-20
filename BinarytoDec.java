/** Class converts a given binary number
 * to a decimal number.
 * UPDATE: Working fully.
 */
public class BinarytoDec {
    public static int binaryConverter(int x) {
        String xAsString = Integer.toString(x);
        int numDigits = xAsString.length(); int depth = numDigits - 1; int curr = 0;
        int res = 0;
        while (curr < numDigits) {
            if (xAsString.substring(curr, curr + 1).equals("1")) {res += (int)(Math.pow(2, depth));}
            depth--;
            curr++;
        }
        return res;
    }
    public static void main(String[] args) {
        int test = 10110101;
        System.out.println(binaryConverter(test));
    }
}
