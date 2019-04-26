import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1;
      int sum=0;
      for(i=1;i<=n;i++)
      {
        sum=sum+i;
      }
        System.out.println(sum);
    }
}