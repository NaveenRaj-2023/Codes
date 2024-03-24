import java.io.*;
import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr1=new int[2][2];
         int [][]arr2=new int[2][2];   
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
               arr2[j][i]=arr1[i][j];
               System.out.print(arr1[j][i] + " ");
            }
            System.out.println();
        }
      
    }
    
}
