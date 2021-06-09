package base;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ann Binus

* Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

* Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

* Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

* Challenges
Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.

*/
public class MadLib {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scan.nextLine();

        System.out.print("Enter a plural noun: ");
        String pluralnoun = scan.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scan.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scan.nextLine();

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Dear Santa, \nI've been an okay " + noun + " this year. I was good sometimes, and I wasn't so " + adjective + " other times. I'd really like a book about " + pluralnoun + " for Christmas. That's all. \nYours " + adverb + ", \n" + name );
    }
}
