import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int s=0,total;
    for(int i=1;i<=num;i++)
    {
   s =s+i;
    }
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int  s=sum(num);
      System.out.println(s);
	}
}