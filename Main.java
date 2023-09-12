public class Main 
{
  public static void main(String[] args)
  {
    int a = 5;
    double b = 2.3f; //casted from f to double
    int c = 19;
    int bad = 0;
    c++;
    System.out.print("Current Version of C++ is ");
    System.out.println(c);

    a+=8;
    System.out.print("5+8= ");
    System.out.println(a);

    try {
      int num = ((int) b) / bad;
      System.out.println("I divded num by 0 lol");
    } catch(ArithmeticException e) {
      System.out.println("Failure when I was ur age I divided any numbers by 0");
    }
    
  }
}
