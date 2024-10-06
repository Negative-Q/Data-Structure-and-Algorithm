/*
 Create a program using the deletion operation. The program will ask the user the length of the array, 
 the value/elements that we will input on the array/list and the target value to be remove in the list.


 */


import java.util.Scanner;
import java.util.Arrays;
public class Deletion{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array:");
        int array_size = scanner.nextInt();

        int[] array = new int[array_size];


        for(int i = 0; i < array_size; i++){
            System.out.println("Enter the" + " " + (i+1) + " " + "array");
            array[i] = scanner.nextInt();
        }

        System.out.println("Here is the element inside the array:" + Arrays.toString(array));

        System.out.println("Enter the target value of the array you want to remove. Example start from 1 - total size of the array");
        int target_value = scanner.nextInt() - 1;

        int[] new_array = new int[(array_size - 1)];

        int index = 0;



        for (int i = 0; i < array_size; i++){
            if (i != target_value){
                new_array[index++] = array[i];
            }
        }
            
        System.out.println(Arrays.toString(new_array));

        
     



    }
}