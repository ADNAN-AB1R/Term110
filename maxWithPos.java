import java.util.Scanner;
public class maxWithPos{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Five Numbers");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){//taking inputs
            a[i]=sc.nextInt();
        }
        int max=a[0];//initializing the first element as the max
        int maxIndex=0;//initializing the first index as the maxindex
        for(int i=1;i<a.length;i++){
            if(a[i]>max){//if any element gets larger
                max=a[i];//then assigning that element as the max
                maxIndex=i;//and assigning that index as the maxindex
            }
        }
        System.out.println("Largest number "+max+" was found at location "+maxIndex);
    }
}