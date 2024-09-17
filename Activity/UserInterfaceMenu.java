/*
SEARCHING OPERATION:
Instruction:
Program that ask a user a length/value until it finds the index position

Learn about Arrays class
Task:
 */

import java.util.Scanner;
import java.util.Arrays;


public class UserInterfaceMenu{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;
        int userInput = 0;
    
        System.out.println("Enter the length of the element first");
        arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++){
            System.out.print("Enter the elements:");
            array[i] = scanner.nextInt();
        }
        do{
            System.out.println("Here is the array elements:" + Arrays.toString(array));

            System.out.println("0) Exit");
            System.out.println("1) Deleting an Element");
            System.out.println("2) Sorting an Element");
            System.out.println("3) Searching Array Index");
            System.out.println("4) Filling an Element");

            System.out.print("Enter the number:");
            userInput = scanner.nextInt();

            switch(userInput){
                case 1:
                    array = deleteElements(scanner,array);
                    break;

                case 2:
                    array = sortingArray(scanner,array);
                    break;
                case 3:
                    array = searchingArrayIndex(scanner,array);
                    break;
                case 4:
                    array = fillingElement(scanner, array);
                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Thank you for using my system");

            }

        } while(userInput != 0);

        
    }

    public static int[] deleteElements(Scanner scanner, int[] array){
        System.out.println("1) Delete specific elements");
        System.out.println("2) Delete all elements");
        System.out.print("Select:");
        int userInput = scanner.nextInt();

        int selectIndex= 0;
        int[] newArray = new int[array.length];

        switch (userInput){
            case 1:
                System.out.println("Here is the element of the previous arrays you input:" + Arrays.toString(array));
                System.out.print("Select:");
                selectIndex = scanner.nextInt();
                newArray = new int[array.length - 1];
                System.arraycopy(array, 0, newArray, 0, selectIndex);
                System.arraycopy(array, selectIndex + 1, newArray, selectIndex, array.length - selectIndex - 1);
                //System.arraycopy(array, (selectPosition + 1), newArray, selectPosition, newArray.length);
                array = newArray;
                System.out.println(Arrays.toString(array));
                return array;
                


            case 2:
                newArray = new int[array.length - array.length];
                System.arraycopy(array, 0, newArray, 0,0);
                array = newArray;
                System.out.println(Arrays.toString(array));
                return array;
                

            default:
                System.out.println("Try again");
                return array;
                  
        }   
    }

    public static int[] sortingArray(Scanner scanner, int[] array){
        System.out.println("Original arrays" + " " + Arrays.toString(array));
        System.out.println("After sorting the elements in array in ascending order:");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] searchingArrayIndex(Scanner scanner, int[] array){
        System.out.print("Enter the elements you want to find in the array:");
        int searchElement = scanner.nextInt();

        int index = Arrays.binarySearch(array, searchElement);
        if (index >= 0){
            System.out.println("Element found at index:" + " " + index);
        }
        else{
            System.out.println("Element not found");
        }

        return array;
    }

    public static int[] fillingElement(Scanner scanner, int[] array){
        System.out.print("Enter the number you want to replace all the elements inside the array:");
        int replacementValue = scanner.nextInt();
        Arrays.fill(array,replacementValue);
        System.out.println(Arrays.toString(array));
        return array;
    }
}