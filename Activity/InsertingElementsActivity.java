/*
Christian Kenneth F. Gonzales
BSIT 2D
09/18/24

Insertion version 1.0.0
Instruction:
User:
1) No. of index/elements
2) Elements/value
3) Position
*/



import java.util.Scanner;
import java.util.Arrays;

public class InsertingElementsActivity{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int arraySize = scanner.nextInt();

        System.out.println("Enter the elements");
        int[] myArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++){
            System.out.print((i+1) + "  :");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Here is the list of the elements in an array:" + Arrays.toString(myArray));

        System.out.print("Enter the element you want to add in the previous array:");
        int newElement = scanner.nextInt();

        System.out.print("Enter the position you want to place in the previous array:");
        int newElementPosition = scanner.nextInt();

        int[] newArray = new int[arraySize + 1];

        for (int i = 0; i < newArray.length; i++){
            if (i < newElementPosition){
                newArray[i] = myArray[i];
            }

            if (i == newElementPosition){
                newArray[i] = newElement;
            }
            if (i > newElementPosition){
                newArray[i] = myArray[(i - 1)];
            }
        }

        System.out.println("New array element:" + Arrays.toString(newArray));

        scanner.close();
    }
}