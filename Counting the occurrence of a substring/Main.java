import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int str_len1=str1.length();
      int str_len2=str2.length();
      int occur_cnt=0;
      for(int i=0;i<(str_len1-str_len2+1);i++)
      {
        boolean is_matching=true;
         for(int j=0;j<str_len2;j++)
         {
          if(str1.charAt(i+j)!=str2.charAt(j))
          {
            is_matching=false;
          }
         }
        if(is_matching==true)
        {
          occur_cnt++;
        }
      }
    System.out.print(occur_cnt);
  }
}
