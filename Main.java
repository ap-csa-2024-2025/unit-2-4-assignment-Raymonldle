import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    //System.out.println(lastFirstN());
    stringManip();

    // write your code here
  }

  public static String lastFirstN(){
    Scanner userInput = new Scanner(System.in);

    System.out.println("Whats your first word?");
    String s1 = userInput.nextLine();

    System.out.println("Whats your second word?");
    String s2 = userInput.nextLine();

    System.out.println("What number do you want?");
    int n = userInput.nextInt();

    s1 = s1.substring(n-1);
    s2 = s2.substring(0, s2.length() - n);
    return s1 + s2;
  }

  public static void stringManip(String s1, String s2){
    s1.toUpperCase();
    System.out.println(s1);

    s2.substring(0)
  }
}
