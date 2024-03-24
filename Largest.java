import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        int[] arr=new int[4];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        int k=0;
        System.out.println("Largest element in array");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>k)
            {
                k=arr[i];
            }
        }
        System.out.println("largest element is:" + k);
        
        

    }
    
}
