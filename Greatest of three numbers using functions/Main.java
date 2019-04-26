import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
  Scanner sc=new Scanner(System.in);
  int n1=sc.nextInt();
   int n2=sc.nextInt();
   int n3=sc.nextInt();
      System.out.println(greatest_number(n1,n2,n3));
    }
  public static int greatest_number(int n1,int n2,int n3)
  {
  int min,great;
  if(n1>n2)
  {
    min=n1;
  }
  else
  {
    min=n2;
  }
  if(min>n3)
  {
    great=min;
  }
  else
  {
    great=n3;
  }
  return great;
}
}