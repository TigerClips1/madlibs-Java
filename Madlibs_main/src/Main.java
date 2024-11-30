// import the Scanner class to i can get user input
import java.util.Scanner;

// make an main class
public class Main {
    // make a main function
    public static void main(String[] args) {
            // Handle the game
            System.out.print("Enter a verb: ");
            Scanner verb = new Scanner(System.in);
            String verbs = verb.nextLine();
            System.out.print("Enter a adverb: ");
            Scanner adverb = new Scanner(System.in);
            String adverbs = adverb.nextLine();
            System.out.print("Enter a noun: ");
            Scanner noun = new Scanner(System.in);
            String nouns = noun.nextLine();

            System.out.println("Roses are " + verbs);
            System.out.println("Valents are " + adverbs);
            System.out.println("Please Eat some " + nouns);
        }
    }