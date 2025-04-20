package at.htl.klu.methods;

import java.util.Arrays;

public class staticMethodenUbung {

  public static void main(String[] args) {
    System.out.println("------------------------");
/*   int count = countNumerics("Es waren 17 Zwerge!");
    System.out.println(count);
 */   int sum = solve("4");
    System.out.println(sum);

  }
  public static int countNumerics(String str){
    char [] c = str.toCharArray();
    int count = 0;
    for (int i = 0; i < c.length; i++) {
      if (Character.isDigit(c[i])){
        count++;
      }
    }
  return count;}


  public static int solve(String str){
    char[] c = str.toCharArray();
    System.out.println(Arrays.toString(c));
    int sum = c[0];
    System.out.println(c);
    for (int i = 2; i < c.length; i+=2) {
      if (c[i] == '+'){
      sum += Character.getNumericValue(c[i+2]);
      }
      if (c[i]== '-'){
        sum -= Character.getNumericValue(c[i+2]);
      }
    }
    System.out.println(sum);

  return sum;}
}
