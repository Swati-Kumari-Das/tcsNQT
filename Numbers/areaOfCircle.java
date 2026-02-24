class Solution {

  public static double areaOfCircle(int n) {
    return Math.PI * n * n;
  }

  public static void main(String args[]) {
    int n = 5;
    double result = areaOfCircle(n);
    System.out.print("Area of circle is : " + result);
  }

}
