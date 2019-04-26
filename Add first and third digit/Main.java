import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
       Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int num_firstdigit=num/100;
      int num_lastdigit=num%10;
      int sum=num_firstdigit+num_lastdigit;
      System.out.println(sum);
	}
}