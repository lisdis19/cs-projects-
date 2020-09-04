/*
lisa disalvo
1000 int program 07-09-2020
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.io.File;
public class randomArray
{
    public static void main(String args[])
    {
        File file = new File("output.txt");
        try {
            PrintWriter output = new PrintWriter(file);
            int[] randomNumbers = new int[1001];
            int total = 0;
            Random rand = new Random();
            for (int i = 0; i < randomNumbers.length; i++) {
                int n = rand.nextInt(11);
                randomNumbers[i] = n;
                total = total + randomNumbers[i];
            }
            output.println("This program will print 1000 integers that all range between numbers 1 through 10!");
            System.out.println("Here are your unsorted integers!: ");
            for (int i = 0; i < randomNumbers.length; i++) {
                System.out.println("");
                System.out.println("Number " + i + " : " + randomNumbers[i]);
                System.out.println("");
            }
            System.out.println("Here are your sorted integers!: ");
            for (int i = 0; i < randomNumbers.length; i++) {
                int smallestNo = randomNumbers[i];
                int posWithSmallest = i;
                for (int j = i + 1; j < randomNumbers.length; j++) {
                    int val = randomNumbers[j];
                    if (val < smallestNo) {
                        smallestNo = val;
                        posWithSmallest = j;
                    }
                }
                int tmp = randomNumbers[i];
                randomNumbers[i] = smallestNo;
                randomNumbers[posWithSmallest] = tmp;
                System.out.println("");
                System.out.println("Number " + i + " : " + randomNumbers[i]);
            }

            output.println("");
            output.println("Here is a frequency report for the numbers in this array:");
            output.println("");
            // create a count array to store count of all array elements
            int[] freq = new int[randomNumbers.length];

            // update frequency of each element
            for (int e: randomNumbers)
            {
                freq[e]++;
            }

            // iterate through the array to print frequencies
            for (int i = 0; i < freq.length; i++)
                if (freq[i] > 0)
                {
                    output.printf("%d appears %d times\n", i, freq[i]);
                }

            output.println("");
            output.println("Now let's find the average of the numbers in this array!");
            output.println("");
            int average = total / randomNumbers.length;
            output.println("The average for this set of numbers is: " + average);
            output.println("");
            output.println("End of Job!");
            output.close();
        } catch (IOException ex)
        {
            System.out.printf("Error: %s\n", ex);
        }

    }

}
