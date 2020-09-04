/*
Lisa DiSalvo
Sorting Array Program
CS 112
July 30th 2020
*/

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main
{
    public static void main(String args[])
    {
        //starts with the menu
        menuOptions();
    }

    //a method which makes it easy to continously run different sets of data without terminating the program
    public static void tryAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWould you like to sort again?\nENTER 'YES' OR 'NO' ");
        String choice = sc.nextLine();
        if (choice.equals("Yes") || choice.equals("yes")) {
            //reruns menu options to do another run through of this program
            menuOptions();
        } else if (choice.equals("No") || choice.equals("no")) {
            //terminates program
            System.out.println("End of Job!");
            System.exit(0);
        }
    }

    public static void menuOptions() {
        //a simple menu which allows the user to select between quick sort or merge sort
        //self explanatory with switch statement
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is for research purposes! Please select an option");
        System.out.println("1. Quick Sort Your Selected Input of Integers!");
        System.out.println("2. Merge Sort Your Selected Input of Integers!");
        System.out.println("3. Bubble Sort Your Selected Input of Integers!");
        System.out.println("4. Insertion Sort Your Selected Input of Integers!");
        System.out.println("5. Selection Sort Your Selected Input of Integers!");
        System.out.println("6. Exit this Program.");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                quickOption();
                break;
            case 2:
                quickMerge();
                break;
            case 3:
                quickBubble();
                break;
            case 4:
                quickInsert();
                break;
            case 5:
                quickSelect();
                break;
            case 6:
                System.out.println("Thank you! Goodbye");
                System.exit(0);
                break;
        }
    }

    public static void quickBubble() {
        //opens scanner. User can input the size of the array and then the numbers within the array are randomized
        //you can really make your computer lag with this haha
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array!");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Random rd = new Random(); // creating Random object
        System.out.println("How many times would you like to run this sort?");
        int times = sc.nextInt();
        System.out.println("\nRunning " + n + " sets of a bubble sort:");
        System.out.println("Here are your results: \n");
        for (int i = 0; i < times; i++) {
            long startTime = System.nanoTime();
            //time measured BEGINS
            arr[i] = rd.nextInt();
            // Let's sort using quick sort!
            bubbleSort(arr);
            //time measured ENDS
            long endTime = System.nanoTime();
            //get difference of two nanoTime values!
            long timeElapsed = endTime - startTime;
            int result = arr.length;
            //format neatly the times listed
            System.out.println(" " + timeElapsed);
        }
        //option to redo the entire program for more data sets
        tryAgain();
    }
    public static void quickSelect()
    {
        //opens scanner. User can input the size of the array and then the numbers within the array are randomized
        //you can really make your computer lag with this haha
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array!");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Random rd = new Random(); // creating Random object
        System.out.println("How many times would you like to run this sort?");
        int times = sc.nextInt();
        System.out.println("\nRunning " + n + " sets of a selection sort:");
        System.out.println("Here are your results: \n");
        for (int i = 0; i < times; i++) {
            long startTime = System.nanoTime();
            //time measured BEGINS
            arr[i] = rd.nextInt();
            // Let's sort using quick sort!
            selectionSort(arr);
            //time measured ENDS
            long endTime = System.nanoTime();
            //get difference of two nanoTime values!
            long timeElapsed = endTime - startTime;
            int result = arr.length;
            //format neatly the times listed
            System.out.println(" " + timeElapsed);
        }
        //option to redo the entire program for more data sets
        tryAgain();
    }
    public static void quickInsert() 
    {
        //opens scanner. User can input the size of the array and then the numbers within the array are randomized
        //you can really make your computer lag with this haha
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array!");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Random rd = new Random(); // creating Random object
        System.out.println("How many times would you like to run this sort?");
        int times = sc.nextInt();
        System.out.println("\nRunning " + n + " sets of a Insertion sort:");
        System.out.println("Here are your results: \n");
        for (int i = 0; i < times; i++) {
            long startTime = System.nanoTime();
            //time measured BEGINS
            arr[i] = rd.nextInt();
            // Let's sort using quick sort!
            insertionSort(arr);
            //time measured ENDS
            long endTime = System.nanoTime();
            //get difference of two nanoTime values!
            long timeElapsed = endTime - startTime;
            int result = arr.length;
            //format neatly the times listed
            System.out.println(" " + timeElapsed);
        }
        //option to redo the entire program for more data sets
        tryAgain();
    }


    public static void bubbleSort(int[] array) {

        boolean swapped = true;

        while (swapped) {
            swapped = false;

            //iterate once for every element
            for (int i = 0; i < array.length - 1; i++) {

                //if the current element is larger than the next element...
                if (array[i] > array[i + 1]) {
                    //swap elements
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    //activate flag to quit early
                    swapped = true;
                }
            }
        }//end while
    }

    //method makes the time measurement much easier//captures time
    private static void methodToTime() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //these methods output data/time measurements, hence titled 'quick'
    public static void quickOption() {
        //opens scanner. User can input the size of the array and then the numbers within the array are randomized
        //you can really make your computer lag with this haha
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array!");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Random rd = new Random(); // creating Random object
        System.out.println("How many times would you like to run this sort?");
        int times = sc.nextInt();
        System.out.println("\nRunning " + n + " sets of a quick sort:");
        System.out.println("Here are your results: \n");
        for (int i = 0; i < times; i++) {
            long startTime = System.nanoTime();
            //time measured BEGINS
            arr[i] = rd.nextInt();
            // Let's sort using quick sort!
            quickSortMath(arr, 0, arr.length - 1);
            //time measured ENDS
            long endTime = System.nanoTime();
            //get difference of two nanoTime values!
            long timeElapsed = endTime - startTime;
            int result = arr.length;
            //format neatly the times listed
            System.out.println(" " + timeElapsed);
        }
        //option to redo the entire program for more data sets
        tryAgain();
    }

    //these methods output data/time measurements, hence titled 'quick'
    public static void quickMerge() {
        //opens scanner. User can input the size of the array and then the numbers within the array are randomized
        //you can really make your computer lag with this haha
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array!");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Random rd = new Random(); // creating Random object
        System.out.println("How many times would you like to run this sort?");
        int times = sc.nextInt();
        System.out.println("\nRunning " + n + " sets of a merge sort:");
        System.out.println("Here are your results: \n");
        for (int i = 0; i < times; i++) {
            long startTime = System.nanoTime();

            //timer begin
            arr[i] = 10;
            // Let's sort using merge sort
            mergesort(arr);
            //timer ends
            long endTime = System.nanoTime();
            // get difference of two nanoTime values
            long timeElapsed = endTime - startTime;
            int result = arr.length;
            //format neatly the times listed
            System.out.println(" " + timeElapsed);

        }
        //option to redo program
        tryAgain();
    }


    public static void mergesort(int[] input) {
        mergesort(input, 0, input.length - 1);
    }

    //Merge alg which is then called in the 'quick' method which outputs the time elapsed and the actual data
    private static void mergesort(int[] input, int start, int end)
    {
        // break problem into smaller structurally identical problems
        int mid = (start + end) / 2;
        if (start < end) {
            mergesort(input, start, mid);
            mergesort(input, mid + 1, end);
        }
        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];
        while (first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        while (first <= mid) {
            tmp[i++] = input[first++];
        }
        while (last <= end) {
            tmp[i++] = input[last++];
        }
        i = 0;
        while (start <= end) {
            input[start++] = tmp[i++];
        }
    }


    //quick sort alg which is then called in the 'quick' method which outputs the time elapsed and the actual data
    public static void quickSortMath(int[] arr, int low, int high)
    {

        //check for empty or null array

        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot) {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot) {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j) {
            quickSortMath(arr, low, j);
        }
        if (high > i) {
            quickSortMath(arr, i, high);
        }
    }

    public static void swap(int[] array, int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void insertionSort(int[] array) 
    {
        int index;

        //iterate from slot 1
        for (int nextPos = 1; nextPos < array.length; nextPos++) {
            //set inspected value
            int value = array[nextPos];

            //set location for backwards checking
            index = nextPos - 1;

            //decrease location index until array is exhausted /larger found value
            while (index >= 0 && array[index] > value  ||
                    index >= 0 && array[index] < value ) {
                //shift elements forward
                array[index + 1] = array[index];
                index--;
            }

            //place value into slot
            array[index + 1] = value;
        }

    }
    public static void selectionSort(int[] array)
    {
        int minPos;

        //iterate once for every element
        for (int index = 0; index < array.length; index++) {
            //set position of minimum value to current iteration
            minPos = index;

            //check for next lowest element
            for (int nextPos = index + 1; nextPos < array.length; nextPos++) {
                if (array[nextPos] < array[minPos]   ||
                        array[nextPos] > array[minPos]  ) minPos = nextPos;
            }

            //perform swap
            if (minPos > index) {
                int temp = array[index];
                array[index] = array[minPos];
                array[minPos] = temp;
            }
        }

    }


}

