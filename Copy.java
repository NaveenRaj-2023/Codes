import java.util.Scanner;
public class Copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[4];
        int[] arr2=new int[4];
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++)
        {
          if(arr1[i]==arr2[i])
          {
            count++;
          }
        }
        if(count==arr1.length)
        {
            System.out.println("equal");
        }
        else{
            System.out.println("no");
        }
        
    }
}
