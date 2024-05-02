import java.util.Scanner;
public class findMax{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Five Numbers");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){//taking inputs
            a[i]=sc.nextInt();
        }
        int max=a[0];//initializing max with first element of array
        for(int i=1;i<a.length;i++){
            if(a[i]>max){//if any element gets greater than max then assign that value to max
                max=a[i];
            }
        }
        System.out.println(max);//printing the maximum element
    }
}