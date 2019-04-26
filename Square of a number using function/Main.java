import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
   int s=num*num;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int s=square(num);
      System.out.println(s);
	} 
}