/*
Lisa DiSalvo
07/22/20
CS 122
Recursion Assignment
*/
import java.io.*;
import java.util.Scanner;
public class recursionAssignment
{

    public static final String data = "words.txt";

    public static void main(String args[]) throws IOException
    {
        //reading from file using scanner
        Scanner read = new Scanner(new File(data));
        String collect = "";
        //make sure to use three colons or else the formatting will be clumped
        while (read.hasNextLine()) collect += read.nextLine() + ":::";
        String[] pal = collect.split(":::");
        for (String sample: pal)
        {
            System.out.println(sample + " : " + (palCheck(organizePal(sample))? "Is a Palindrome" : "Is Not a Palindrome"));
        }
        read.close();

       startScreen();

    }

    public static void startScreen()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Palindrome Program!\n");
        System.out.println("A Palindrome is a word, phrase, or sequence that reads the same backward as forward\n");
        System.out.println("This program will determine if a String is a palindrome.\n");
        System.out.println("Please enter a Palindrome phrase to continue\n");

        String phrase = sc.nextLine();
        // If function returns true then the string is
        //palindrome,  else string is not a palindrome

        if(palCheck(phrase))
        {
            System.out.println(phrase + " is a palindrome!");
        }
        else
        {
            System.out.println(phrase + " is not a palindrome!");
        }
        loopCheck();
    }

    //pal check , check to see if palindrome = true/false
    public static boolean palCheck(String sample)
    {   // if length is 0 or 1 then String is palindrome
        if(sample.length() == 0 || sample.length() == 1)
            return true;
        if(sample.charAt(0) == sample.charAt(sample.length()-1))
            return palCheck(sample.substring(1, sample.length()-1));
        // checks for the first and last character of a String:
        //if they are same then do the same thing for a substring
        //with first and last char removed. and carry on this
        // until you string completes or condition fails
        //function calling itself is an example of recursion
        //If program control reaches to this statement it means
        //the String is not palindrome hence FALSE.

        return false;
    }


    //checks if user wants to do another palindrome
    public static void loopCheck()
    {
        System.out.println("\nWould you like to try again?\n Enter Y or N to continue");
        Scanner sc = new Scanner(System.in);
        String reply = sc.nextLine();
        if (reply.equals("Y")||reply.equals("y"))
        {
            startScreen();
        }
        else if (reply.equals("N")||reply.equals("n"))
        {
            System.out.println("Thank you for using this program!");
            //terminates program
            System.exit(0);
        }
    }


    //Replaces unicode characters in order to accurately print phrase
    private static String organizePal(String word)
    {
        return word.replaceAll("[.,?! :'\\/]", "").toLowerCase();
    }





}

