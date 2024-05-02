import java.util.Scanner;
public class sortAsIncreasing{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Five Numbers");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){//taking inputs
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++){//outer loop for swapping
            int min=a[i];//asuming the first element to be min
            int minIndex=i;//assuming the first index to be min index
            for(int j=i;j<a.length;j++){
                if(a[j]<min){//if any element gets smaller than min
                    min=a[j];//then assign that as min
                    minIndex=j;//and assign that index as min index
                }
            }
            int temp=a[i];//assigning the ith element to be temp
            a[i]=min;//assigning the min to be ith element
            a[minIndex]=temp;//assigning the temp to be min index element
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");//printing elements
            }
        }
    }
