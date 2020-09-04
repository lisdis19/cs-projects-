/*
Lisa DiSalvo
Sorting Array Program
CS 112
July 30th 2020
*/
import java.io.*;
import java.util.*;

public class Main
{

    public static final String programOutput1 = "ascendingOutput.csv";
    public static final String programOutput2 = "descendingOutput.csv";
    public static final String sourceFile = "Tutorials.txt";

    public static void main(String args[]) throws Exception

    {
        BufferedReader in = new BufferedReader(new FileReader(sourceFile));
        stringArr[] tutorialWebsites = createTutorials();
        //descending
        System.out.println("Unsorted Given array is: ");
        selectionSort.sSort(tutorialWebsites);
        System.out.println("\nWriting Data to CSV Files . . .");
        printCSV(programOutput2, tutorialWebsites);
        System.out.println("Done!");

        //ascending
        System.out.println("Elements of array sorted in ascending order: ");
        selectionSort.iSort(tutorialWebsites);
        System.out.println("\nWriting Data to CSV Files . . .");
        printCSV (programOutput1, tutorialWebsites);
        System.out.println("Done!");
        System.out.println("End of Job!");

    }

    public static void printCSV(String output, stringArr[] tutorials) throws Exception
    {
        PrintWriter out = new PrintWriter(new File (output));
        //every line is a single entity
        for (stringArr t: tutorials) out.println(t.toString());
        out.close();
    }
    
    //class for this string array in order to establish the components of this array/in file
    public static class stringArr implements Comparable<stringArr>
    {
        //establishing :
        //Language Name
        //Website Description
        //Website URL

        public String Language;
        public String Description;
        public String URL;
        @Override
        public String toString()
        {
            return this.Language + ", " + this.URL + ", " + this.Description;
        }
        //trim eliminates leading and trailing spaces
        stringArr(String lang, String desc, String url)
        {
            this.Language = lang.trim();
            this.Description = desc.trim();
            this.URL = url.trim();
        }
        public int compareTo(stringArr that)
        {
            return this.Language.compareTo(that.Language);
        }
    }

    private static stringArr[] createTutorials() throws Exception
    {
        stringArr[] tutorialText = new stringArr[0];
        //determine size of the array
        Scanner in = new Scanner(new File(sourceFile));
        int count = 0;
        //count the lines
        while (in.hasNextLine())
        {
            count++;
            in.nextLine();
        }
        //refresh scanner
        in = new Scanner(new File(sourceFile));
        tutorialText = new stringArr[count / 3];
        for (int i = 0; i < tutorialText.length; i++)
        {
            //every 3 lines = object
            String[] objProps = new String[3];
            for (int j = 0; j < 3; j++) objProps[j] = in.nextLine();
            tutorialText[i] = new stringArr(objProps[0], objProps[1], objProps[2]);
        }
        return tutorialText;
    }

}
