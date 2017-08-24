package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;



public class SumArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to enter?");
        int num = input.nextInt();

        int array[] = new int[num];
        int temp[] =new int[num];

        System.out.println("Enter the " + num + " numbers now.");
int sum=0;
        for (int i = 0 ; i < array.length; i++ ) {
           
        	System.out.println("your enterd "+(array[i] = input.nextInt()));
              sum+=array[i];
        }
       double avg=sum /array.length;
       System.out.println("sum is "+sum+" \n avg is "+avg);
       System.out.println("copy of array is  "+ Arrays.copyOf(array,6));
    }
}
     /*   System.out.println("These are the numbers you have entered.");
        printArray(array);

    }

    public static void printArray(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}*/



