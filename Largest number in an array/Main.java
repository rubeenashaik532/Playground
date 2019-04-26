import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
      for(int idx=0;idx<=arr_size-1;idx++)
      {
        arr[idx]=sc.nextInt();
      }
      int max;
      if(arr[0]>arr[1])
      {
        max=arr[1];
    }
      else
      {
        max=arr[0];
      }
      for(int idx=0;idx<=arr_size-1;idx++)
      {
        if(max<arr[idx])
        {
          max=arr[idx];
        }
      }
      System.out.println(max);
    }
}