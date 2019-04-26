import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
     Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int seconddigit=(n%100)/10;
      System.out.println(seconddigit);
	}
}