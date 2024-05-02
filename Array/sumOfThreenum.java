package Array;
import java.util.Scanner;

//prints out the sum of three numbers. Then prints the numbers also.
public class sumOfThreenum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int arr[]=new int[3]; //Declaring an array named arr which contains three numbers 
        int sum=0; // Assuming the initial sum to be zero
        for (int i=0;i<arr.length;i++){ //running a loop to add the numbers
            arr[i]=sc.nextInt(); // taking inputs and scanning numbers
            sum=sum+arr[i]; //  adding the numbers
        }
        System.out.print(sum+","); 
        
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+","); //printing the numbers
        } 
    }
}