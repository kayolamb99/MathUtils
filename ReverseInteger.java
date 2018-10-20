import java.util.ArrayList; 
/** This program reverses a given integer.
 BUG: Still cannot handle reversed integers exceeding
 (int)(Math.abs(Integer.MAX_VALUE))
 even though a boolean statement was added
 at the end to correct this bug.
 */
public class ReverseInteger {
    public static int reverse(int x) {
    long res = 0; int y = 0;
    if (x < 0) {
      y = x;
      x = x * -1;
    }
    String res2 = "";
    String xAsString = Integer.toString(x);
    ArrayList <String> X = new ArrayList<String>();
    for (int i = 0; i < xAsString.length(); i++) {
      X.add(xAsString.substring(i, i + 1));
    }
    for (int i = X.size() - 1; i > -1; i--) {
      res2 += X.get(i);
    }
    res = Long.parseLong(res2);
    if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {return 0;}
    if (y != 0) {res *= -1;}
    return (int)res;
  }
}
