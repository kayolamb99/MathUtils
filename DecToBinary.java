/**This program converts a
 * given decimal number to
 * a binary number.
 * UPDATE: Working fully.
 */
public class DecToBinary {
    public static int findHighestPower(int x) {
        if (x == 0) {return 0;}
        int currDepth = 0;
        while (currDepth < x) { //Fix this
            if ((int)(Math.pow(2, currDepth)) == x) {return currDepth;}
            else if ((int)(Math.pow(2, currDepth)) > x) {return currDepth - 1;}
            currDepth++;
        }
        return -1;
    }
    public static String converter(int x) {
        int currDepth = findHighestPower(x); int num = x; int currPow = 0;
        String res = "";
        while (currDepth >= 0) {
           currPow = (int)(Math.pow(2, currDepth));
           if (num - currPow >= 0) {res+= "1"; num -= currPow;}
           else {res += "0";}
           currDepth--;
        }
        return res;
    }
    public static void main(String[] args) {
        int test = 4567009;
        System.out.println(converter(test));
    }
}
