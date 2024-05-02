package Array;
import java.util.Scanner;
public class printingNumbers{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){//taking inputs
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){//printing the array
            System.out.println(a[i]);
        }  
        
    }
}
