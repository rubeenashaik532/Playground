import java.util.Scanner;
class Main
{
 public static int[] C_Array(String str)
  {
    //type your code here
    int c[]=new int[256];
    for(int i=0;i<str.length();i++)
    {
      c[str.charAt(i)]++;
    }
    return c;
  }
  public static String remove_Chars(String str,String sub_str)
  {
    int c[]=C_Array(sub_str);
    int ip_ind=0,res_ind=0;
    char arr[]=str.toCharArray();
    while(ip_ind!=arr.length)
    {
      char temp=arr[ip_ind];
    if(c[temp]==0)
    {
      arr[res_ind]=arr[ip_ind];
      res_ind++;
    }
    ip_ind++;
  }
  str=new String(arr);
  return str.substring(0,res_ind);
}
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  String sub_str=sc.nextLine();
  System.out.print(remove_Chars(str,sub_str));
}
}
