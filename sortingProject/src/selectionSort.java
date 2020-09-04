/*
Lisa DiSalvo
Sorting Array Program
CS 112
July 30th 2020
*/

import java.io.*;
import java.io.FileNotFoundException;

public class selectionSort
{

    public static final String sourceFile = "Tutorials.txt";

    //sSort calls stringArr
    public static void sSort(Main.stringArr[] stringArr) throws IOException
    {
        //buffered reader to read from file
        BufferedReader in = null;
        //try catch surrounding
        try
        {
            in = new BufferedReader(new FileReader(sourceFile));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        int result = stringArr.length;

        // Printing the array BEFORE sorting
        for(int j = 0; j < result; j++)
        {
            //format neatly outputs the tutorials listed
            System.out.println("- \n " +stringArr[j]);
        }

        System.out.println();

            // Find the string reference that should go in each cell of array
            for ( int j=0; j < stringArr.length-1; j++ )
            {
                // min: the index of the string reference that should go into cell j.
                // looks through the unsorted strings (those at j or higher)
                int min = j;
                for ( int k=j+1; k < stringArr.length; k++ )
                   if ( stringArr[k].compareTo( stringArr[min] ) < 0 ) min = k;
                // swap ref at j with ref at min
                Main.stringArr temp = stringArr[j];
                stringArr[j] = stringArr[min];
                stringArr[min] = temp;
            }

        System.out.println("Elements in Array in descending order is");
        // Printing the array AFTER sorting
        for(int j = 0; j < result; j++)
        {
            //format neatly outputs the tutorials listed
            System.out.println("- \n " +stringArr[j]);
        }
        System.out.println();
    }

    public static void iSort(Comparable[] stringArr) throws IOException
    {

        //insertion sort
        for (int i = 1; i < stringArr.length; i++)
        {
            Comparable objectToSort = stringArr[i];
            int j = i;
            while (j > 0 && stringArr[j-1].compareTo( objectToSort )< 1)
            {
                stringArr[j] = stringArr[j-1];
                j--;
            }
            stringArr[j] = objectToSort;
        }
        for (int i = 0; i < stringArr.length; i++)
        {
            //format neatly outputs the tutorials listed
            System.out.println("- \n "+stringArr[i]);

        }

    }




}
