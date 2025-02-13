// Java
import java.util.Scanner;

class FizzBuzz
{
  public void solve() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0)
        System.out.println("FizzBuzz");
      else if (i % 3 == 0)
        System.out.println("Fizz");
      else if (i % 5 == 0)
        System.out.println("Buzz");
      else
        System.out.println(i);
    }
  }

  public static void main(String[] args)
  {
    new FizzBuzz().solve();
  }
}
