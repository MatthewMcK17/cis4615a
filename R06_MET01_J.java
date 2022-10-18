/*
  MET01-J: Noncompliant Code
   - Uses assertions to validate arguments of public methods
*/

public static int getAbsAdd(int x, int y) {
  return Math.abs(x) + Math.abs(y);
}
getAbsAdd(Integer.MIN_VALUE, 1);
