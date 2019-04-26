import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int shift=in.nextInt();
    int sb_len=sb.length();
    for(int i=0;i<=sb_len-1;i++)
    {
      char ch=sb.charAt(i);
      if(ch>='A'&& ch<='Z')
      {
        ch=(char)(ch-shift);
        if(ch<'A')
        {
          ch=(char)(ch+26);
        }
      }
      else if(ch>='a'&&ch<='z')
      {
        ch=(char)(ch-shift);
        if(ch<'a')
        {
        ch=(char)(ch+26);
        }
      }
      sb.setCharAt(i,ch);
    }
    System.out.print(sb);
  }
}

    