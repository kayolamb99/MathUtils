/**This file is a combination of useful utilities for Arrays.
 
/** This program prints all of the elements
  * in an array, a
  * @author Kayode Lambkin
  */
public class ArrayUtils {
  public static void printArrays(int[] a) {
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
  /** This program generates random 
    * array elements, then prints them.
    * @author Kayode Lambkin.
    */
  public static void randArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = (int)(Math.random());
      ArrayUtils.printArrays(a);
    }
  }
  /** This program finds the maximum of all the array elements
    * given.
    * @author Kayode Lambkin
    */
  public static int findMax(int[] a) {
    int max = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    return max;
  }
  /** This program finds the average of 
    * elements of an array.
    */
  public static double findAverage(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    double average = (double)(sum / a.length);
    return average;
  }
  /** This program copies the elements of one 
    * array, into a seperate one called "foobar."
    */
  public static int[] copyArrays(int[] a) {
    int [] foobar = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      foobar[i] = a[i];
    }
    return foobar;
  }
  public static void swap(int [] vals, int idexA, int idexB){
    int t = vals[idexA];
    vals[idexA] = vals[idexB];
    vals[idexB] = t;
  }
  public static boolean hasDups (int[] vals) {
    for(int i = 0; i < vals.length; i++) {
      for(int j = i + 1; j < vals.length; j++) {
        if (vals[i] == vals[j]) {return true;}
      }
    }
    return false;
  }
  public static void reverseElements(int[] vals) {
    for (int i = 0; i < vals.length; i++) {
      swap(vals, i, vals.length - i);
    }
  }
  public static void shuffleArray(int [] a) {
    for (int i = 0; i < a.length; i++) {
      int j = 0 + (int)(Math.random() * a.length);
      swap(a, i, j);
    }
  }
  /** This program returns the string version of
    * a given array.
    * @author Kayode Lambkin.
    */
  public static String toString(int[] vals) {
    String array = vals + "";
    return array;
  }
  public static void printArraysD(double[] a) {
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
  /** This program generates random 
    * array elements, then prints them.
    * @author Kayode Lambkin.
    */
  public static double[]  randArrayD(double[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = Math.random();
    }
    return a;
  }
  /** This program finds the maximum of all the array elements
    * given.
    * @author Kayode Lambkin
    */
  public static double findMaxD(double[] a) {
    double max = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    return max;
  }
  /** This program finds the average of 
    * elements of an array.
    */
  public static double findAverageD(double[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    double average = (double)(sum / a.length);
    return average;
  }
  /** This program copies the elements of one 
    * array, into a seperate one called "foobar."
    */
  public static double[] copyArraysD(double[] a) {
    double [] foobar = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      foobar[i] = a[i];
    }
    return foobar;
  }
  public static void swapD(double [] vals, int idexA, int idexB){
    double t = vals[idexA];
    vals[idexA] = vals[idexB];
    vals[idexB] = t;
  }
  public static boolean hasDupsD (double[] vals) {
    for(int i = 0; i < vals.length; i++) {
      for(int j = i + 1; j < vals.length; j++) {
        if (vals[i] == vals[j]) {return true;}
      }
    }
    return false;
  }
  public static void reverseElementsD(double[] vals) {
    for (int i = 0; i < vals.length; i++) {
      swapD(vals, i, vals.length - i);
    }
  }
  public static void shuffleArrayD(double [] a) {
    for (int i = 0; i < a.length; i++) {
      int j = 0 + (int)(Math.random() * a.length);
      swapD(a, i, j);
    }
  }
  /** This program returns the string version of
    * a given array.
    * @author Kayode Lambkin.
    */
  public static String toStringD(double[] vals) {
    String array = vals + "";
    return array;
  }
}




